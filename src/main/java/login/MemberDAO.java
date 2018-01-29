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
	
	private static final String SELECT_BY_EMAIL = "SELECT USER_OID,USER_NAME,USER_EMAIL,USER_PASSWD,USER_STATUS,USER_ZIP_CODE,USER_ADDRESS,USER_MOBILE,USER_MOBILE,USER_TEL_EXT,FARMER_ZIP_CODE,FARMER_ADDRESS,FARMER_ADDRESS,FARMER_TEL,FARMER_TEL_EXT,FARMER_PROFILE,USER_LAST_LOGIN_TIME,USER_APPLY_DATE,USER_EMAIL_VAL_CODE FROM SUSER WHERE USER_EMAIL=?";
		
	
	
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
				result.setUser_OID(rset.getInt("USER_OID"));
				result.setUser_EMAIL(rset.getString("USER_EMAIL"));
				result.setUser_PASSWD(rset.getString("USER_PASSWD"));
				result.setUser_STATUS(rset.getString("USER_STATUS"));
				result.setUser_ZIP_CODE(rset.getString("USER_ZIP_CODE"));
				result.setUser_ADDRESS(rset.getString("USER_ADDRESS"));
				result.setUser_MOBILE(rset.getString("USER_MOBILE"));
				result.setUser_TEL_EXT(rset.getString("USER_TEL_EXT"));
				result.setFarmer_ZIP_CODE(rset.getString("FARMER_ZIP_CODE"));
				result.setFarmer_ADDRESS(rset.getString("FARMER_ADDRESS"));
				result.setFarmer_MOBILE(rset.getString("FARMER_MOBILE"));
				result.setFarmer_TEL(rset.getString("FARMER_TEL"));
				result.setFarmer_PROFILE(rset.getClob("FARMER_PROFILE"));
				result.setUser_LAST_LOGIN_TIME(rset.getDate("USER_LAST_LOGIN_TIME"));
				result.setUser_APPLY_DATE(rset.getDate("USER_APPLY_DATE"));
				result.setUser_EMAIL_VAL_CODE(rset.getString("USER_EMAIL_VAL_CODE"));
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
	
	public final String SELECT = "SELECT USER_OID,USER_NAME,USER_EMAIL,USER_PASSWD,USER_STATUS,USER_ZIP_CODE,USER_ADDRESS,USER_MOBILE,USER_MOBILE,USER_TEL_EXT,FARMER_ZIP_CODE,FARMER_ADDRESS,FARMER_ADDRESS,FARMER_TEL,FARMER_TEL_EXT,FARMER_PROFILE,USER_LAST_LOGIN_TIME,USER_APPLY_DATE,USER_EMAIL_VAL_CODE FROM SUSER WHERE USER_EMAIL=?";

	final MemberBean findByPrimaryKey(String email) {
		MemberBean mb = new MemberBean();
		try (Connection conn = ds.getConnection(); 
				PreparedStatement stmt = conn.prepareStatement(SELECT);) {
			stmt.setString(1, email);
			try (ResultSet rs = stmt.executeQuery();) {
				if (rs.next()) {
//					String password = rs.getString(2);
//					String checkpassword = rs.getString(3);
					mb.setUser_EMAIL(rs.getString("USER_EMAIL"));
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
			stmt.setString(1, bean.getUser_EMAIL());
			stmt.setString(2, bean.getUser_NAME());
			stmt.setString(3, bean.getUser_PASSWD());
			stmt.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}
