package login;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;
import javax.sql.DataSource;

public class MemberDAO {
	DataSource ds = null;

	public MemberDAO() {
		try {
			Context context = new InitialContext();
			ds = (DataSource)context.lookup("java:comp/env/jdbc/sUserDataBase");
		} catch (NamingException e) {
			e.printStackTrace();
		}
		
	}
	
	private static final String SELECT_BY_EMAIL = "SELECT*FROM SUSER WHERE USER_EMAIL=?";
		
	
	
	public MemberBean select(String id){
		MemberBean result = null;
		Connection conn = null;
		PreparedStatement stmt = null;
		ResultSet rset = null;
		try {
			conn = ds.getConnection();
			stmt = conn.prepareStatement(SELECT_BY_EMAIL);
			stmt.setString(1, id);
			rset =stmt.executeQuery();
			if(rset.next()){
				result = new MemberBean();
				result.setUSER_OID(rset.getInt("USER_OID"));
				result.setUSER_EMAIL(rset.getString("USER_EMAIL"));
				result.setUSER_PASSWD(rset.getString("USER_PASSWD"));
				result.setUSER_STATUS(rset.getString("USER_STATUS"));
				result.setUSER_ZIP_CODE(rset.getString("USER_ZIP_CODE"));
				result.setUSER_ADDRESS(rset.getString("USER_ADDRESS"));
				result.setUSER_MOBILE(rset.getString("USER_MOBILE"));
				result.setUSER_TEL_EXT(rset.getString("USER_TEL_EXT"));
				result.setFARMER_ZIP_CODE(rset.getString("FARMER_ZIP_CODE"));
				result.setFARMER_ADDRESS(rset.getString("FARMER_ADDRESS"));
				result.setFARMER_MOBILE(rset.getString("FARMER_MOBILE"));
				result.setFARMER_TEL(rset.getString("FARMER_TEL"));
				result.setFARMER_PROFILE(rset.getClob("FARMER_PROFILE"));
				result.setUSER_LAST_LOGIN_TIME(rset.getDate("USER_LAST_LOGIN_TIME"));
				result.setUSER_APPLY_DATE(rset.getDate("USER_APPLY_DATE"));
				result.setUSER_EMAIL_VAL_CODE(rset.getString("USER_EMAIL_VAL_CODE"));
			}
		} catch (SQLException e) {  
			e.printStackTrace();
		}finally{
			if(rset != null){
				try {
					rset.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
			if(stmt != null){
				try {
					stmt.close();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			if(conn != null){
				try {
					conn.close();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
		return result;
	}
	
	public final String SELECT = "SELECT * FROM SUSER WHERE USER_EMAIL=?";

	final MemberBean findByPrimaryKey(String email) {
		MemberBean mb = new MemberBean();
		try (Connection conn = ds.getConnection(); 
				PreparedStatement stmt = conn.prepareStatement(SELECT);) {
			stmt.setString(1, email);
			try (ResultSet rs = stmt.executeQuery();) {
				if (rs.next()) {
//					String password = rs.getString(2);
//					String checkpassword = rs.getString(3);
					mb.setUSER_EMAIL(rs.getString("USER_EMAIL"));
					MemberBean user = new MemberBean(email);

					return user;
				}

			}

		} catch (SQLException e) {

			e.printStackTrace();
		}
		return null;
	}

	private static final String INSERT = "INSERT INTO suser(user_email, user_name, user_passwd, USER_APPLY_DATE)"
			+ " values (?, ?, ?, sysdate())";

	public void insertUser(MemberBean bean) {
		try (Connection conn = ds.getConnection(); PreparedStatement stmt = conn.prepareStatement(INSERT)) {
			stmt.setString(1, bean.getUSER_EMAIL());
			stmt.setString(2, bean.getUSER_NAME());
			stmt.setString(3, bean.getUSER_PASSWD());
			stmt.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}
