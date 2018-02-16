package login;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Timestamp;
import java.text.SimpleDateFormat;
import java.util.List;
import java.util.Vector;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;
import javax.sql.DataSource;


public class MemberDAO {

	DataSource ds = null;

	public MemberDAO() {
		try {
			Context context = new InitialContext();
			ds = (DataSource) context.lookup("java:comp/env/jdbc/sUserDataBase");
		} catch (NamingException e) {
			e.printStackTrace();
		}

	}

	
	StringBuilder sb = new StringBuilder();

	public MemberBean findByEmail(String userEmail) {
		MemberBean result = null;
		Connection conn = null;
		PreparedStatement stmt = null;
		ResultSet rset = null;
		try {
			conn = ds.getConnection();

			sb.append("SELECT USER_OID,USER_NAME,USER_EMAIL,USER_PASSWD,USER_STATUS,");
			sb.append("USER_ZIP_CODE,USER_ADDRESS,USER_MOBILE,USER_TEL_EXT,");
			sb.append("FARMER_ZIP_CODE,FARMER_ADDRESS,FARMER_MOBILE,FARMER_TEL,");
			sb.append("FARMER_TEL_EXT,FARMER_PROFILE,USER_LAST_LOGIN_TIME,");
			sb.append("USER_APPLY_DATE,USER_EMAIL_VAL_CODE ");
			sb.append("FROM SUSER WHERE USER_EMAIL=? ");
			stmt = conn.prepareStatement(sb.toString());
			sb.setLength(0);

			stmt.setString(1, userEmail);
			rset = stmt.executeQuery();
			if (rset.next()) {
				result = new MemberBean();
				result.setUserOid(rset.getInt("USER_OID"));
				result.setUserEmail(rset.getString("USER_EMAIL"));
				result.setUserPasswd(rset.getString("USER_PASSWD"));
				result.setUserStatus(rset.getString("USER_STATUS"));
				result.setUserZipCode(rset.getString("USER_ZIP_CODE"));
				result.setUserAddress(rset.getString("USER_ADDRESS"));
				result.setUserMobile(rset.getString("USER_MOBILE"));
				result.setUserTelExt(rset.getString("USER_TEL_EXT"));
				result.setFarmerZipCode(rset.getString("FARMER_ZIP_CODE"));
				result.setFarmerAddress(rset.getString("FARMER_ADDRESS"));
				result.setFarmerMobile(rset.getString("FARMER_MOBILE"));
				result.setFarmerTel(rset.getString("FARMER_TEL"));
				result.setFarmerProfile(rset.getString("FARMER_PROFILE"));
				result.setUserLastLoginTime(rset.getTimestamp("USER_LAST_LOGIN_TIME"));
				result.setUserApplyDate(rset.getTimestamp("USER_APPLY_DATE"));
				result.setUserEmailValCode(rset.getString("USER_EMAIL_VAL_CODE"));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			if (rset != null) {
				try {
					rset.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
			if (stmt != null) {
				try {
					stmt.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
			if (conn != null) {
				try {
					conn.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
		}
		return result;
	}

	private String INSERT = "INSERT INTO SUSER(USER_EMAIL,USER_NAME,USER_PASSWD,USER_APPLY_DATE)"
			+ " values (?, ?, ?, ?)";

	public void insertUser(MemberBean bean) {
		try (Connection conn = ds.getConnection(); PreparedStatement stmt = conn.prepareStatement(INSERT)) {
			stmt.setString(1, bean.getUserEmail());
			stmt.setString(2, bean.getUserName());
			stmt.setString(3, bean.getUserPasswd());
			//因為我們取得目前的Timestamp會有大於等於五百的毫秒,
			//存到資料庫會四捨五入,所以要去除毫秒	
			SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
			String datetime = sdf.format(bean.getUserApplyDate());
			bean.setUserApplyDate(Timestamp.valueOf(datetime));	
			stmt.setTimestamp(4, bean.getUserApplyDate());
			stmt.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	private String update = "UPDATE SUSER SET USER_NAME=?,USER_PASSWD=?,USER_ZIP_CODE=?,"
			+ " USER_ADDRESS=?,USER_MOBILE=?,USER_TEL=?,USER_TEL_EXT=?,FARMER_ZIP_CODE=?,"
			+ " FARMER_ADDRESS=?,FARMER_MOBILE=?,FARMER_TEL=?,FARMER_TEL_EXT=?,FARMER_PROFILE=?,USER_LAST_LOGIN_TIME=?"
			+ " WHERE USER_EMAIL=?";

	public int update(MemberBean bean) {

		int updateCount = 0;
		try (Connection conn = ds.getConnection(); PreparedStatement stmt = conn.prepareStatement(update);) {
			stmt.setString(1, bean.getUserEmail());
			stmt.setString(2, bean.getUserPasswd());
			stmt.setString(3, bean.getUserZipCode());
			stmt.setString(4, bean.getUserAddress());
			stmt.setString(5, bean.getUserMobile());
			stmt.setString(6, bean.getUserTel());
			stmt.setString(7, bean.getUserTelExt());
			stmt.setString(8, bean.getFarmerZipCode());
			stmt.setString(9, bean.getFarmerAddress());
			stmt.setString(10, bean.getFarmerMobile());
			stmt.setString(11, bean.getFarmerTel());
			stmt.setString(12, bean.getFarmerTelExt());
			stmt.setString(13, bean.getFarmerProfile());
			java.sql.Timestamp now = new java.sql.Timestamp(System.currentTimeMillis());
			stmt.setTimestamp(14, now);
			stmt.setString(15, bean.getUserEmail());
			updateCount = stmt.executeUpdate();

		} catch (SQLException e) {
			e.printStackTrace();
		}
		return updateCount;
	}
	//修改農名簡介
	private String UPDATEFARMERPROFILE = "update suser set farmer_profile=?"
			+ " where user_email=?";
			
	public void updateFarmerProfile(MemberBean bean){
		
		try(Connection conn = ds.getConnection();
			PreparedStatement stmt = conn.prepareStatement(UPDATEFARMERPROFILE)
			){
				stmt.setString(1,bean.getFarmerProfile());
				stmt.setString(2,bean.getUserEmail());
				stmt.executeUpdate();
		}catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	
	
}


