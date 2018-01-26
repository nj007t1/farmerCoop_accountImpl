package login;

import java.sql.Clob;
import java.sql.Date;

public class MemberBean {
	int USER_OID;
	String USER_NAME;
	String USER_EMAIL;
	String USER_PASSWD;
	String USER_STATUS;
	String USER_ZIP_CODE;
	String USER_ADDRESS;
	String USER_MOBILE;
	String USER_TEL;
	String USER_TEL_EXT;
	String FARMER_ZIP_CODE;
	String FARMER_ADDRESS;
	String FARMER_MOBILE;
	String FARMER_TEL;
	String FARMER_TEL_EXT;
	Clob FARMER_PROFILE;
	Date USER_LAST_LOGIN_TIME;
	public MemberBean(String uSER_EMAIL) {
		super();
		USER_EMAIL = uSER_EMAIL;
	}

	public MemberBean() {
		super();
	}
	Date USER_APPLY_DATE;
	String USER_EMAIL_VAL_CODE;
	
	public MemberBean(String uSER_NAME, String uSER_EMAIL, String uSER_PASSWD) {
		super();
		USER_NAME = uSER_NAME;
		USER_EMAIL = uSER_EMAIL;
		USER_PASSWD = uSER_PASSWD;
	}
	
	public String getUSER_EMAIL_VAL_CODE() {
		return USER_EMAIL_VAL_CODE;
	}
	public int getUSER_OID() {
		return USER_OID;
	}
	public void setUSER_OID(int uSER_OID) {
		USER_OID = uSER_OID;
	}
	public String getUSER_NAME() {
		return USER_NAME;
	}
	public void setUSER_NAME(String uSER_NAME) {
		USER_NAME = uSER_NAME;
	}
	public String getUSER_EMAIL() {
		return USER_EMAIL;
	}
	public void setUSER_EMAIL(String uSER_EMAIL) {
		USER_EMAIL = uSER_EMAIL;
	}
	public String getUSER_PASSWD() {
		return USER_PASSWD;
	}
	public void setUSER_PASSWD(String uSER_PASSWD) {
		USER_PASSWD = uSER_PASSWD;
	}
	public String getUSER_STATUS() {
		return USER_STATUS;
	}
	public void setUSER_STATUS(String uSER_STATUS) {
		USER_STATUS = uSER_STATUS;
	}
	public String getUSER_ZIP_CODE() {
		return USER_ZIP_CODE;
	}
	public void setUSER_ZIP_CODE(String uSER_ZIP_CODE) {
		USER_ZIP_CODE = uSER_ZIP_CODE;
	}
	public String getUSER_ADDRESS() {
		return USER_ADDRESS;
	}
	public void setUSER_ADDRESS(String uSER_ADDRESS) {
		USER_ADDRESS = uSER_ADDRESS;
	}
	public String getUSER_MOBILE() {
		return USER_MOBILE;
	}
	public void setUSER_MOBILE(String uSER_MOBILE) {
		USER_MOBILE = uSER_MOBILE;
	}
	public String getUSER_TEL() {
		return USER_TEL;
	}
	public void setUSER_TEL(String uSER_TEL) {
		USER_TEL = uSER_TEL;
	}
	public String getUSER_TEL_EXT() {
		return USER_TEL_EXT;
	}
	public void setUSER_TEL_EXT(String uSER_TEL_EXT) {
		USER_TEL_EXT = uSER_TEL_EXT;
	}
	public String getFARMER_ZIP_CODE() {
		return FARMER_ZIP_CODE;
	}
	public void setFARMER_ZIP_CODE(String fARMER_ZIP_CODE) {
		FARMER_ZIP_CODE = fARMER_ZIP_CODE;
	}
	public String getFARMER_ADDRESS() {
		return FARMER_ADDRESS;
	}
	public void setFARMER_ADDRESS(String fARMER_ADDRESS) {
		FARMER_ADDRESS = fARMER_ADDRESS;
	}
	public String getFARMER_MOBILE() {
		return FARMER_MOBILE;
	}
	public void setFARMER_MOBILE(String fARMER_MOBILE) {
		FARMER_MOBILE = fARMER_MOBILE;
	}
	public String getFARMER_TEL() {
		return FARMER_TEL;
	}
	public void setFARMER_TEL(String fARMER_TEL) {
		FARMER_TEL = fARMER_TEL;
	}
	public String getFARMER_TEL_EXT() {
		return FARMER_TEL_EXT;
	}
	public void setFARMER_TEL_EXT(String fARMER_TEL_EXT) {
		FARMER_TEL_EXT = fARMER_TEL_EXT;
	}
	public Clob getFARMER_PROFILE() {
		return FARMER_PROFILE;
	}
	public void setFARMER_PROFILE(Clob fARMER_PROFILE) {
		FARMER_PROFILE = fARMER_PROFILE;
	}
	public Date getUSER_LAST_LOGIN_TIME() {
		return USER_LAST_LOGIN_TIME;
	}
	public void setUSER_LAST_LOGIN_TIME(Date uSER_LAST_LOGIN_TIME) {
		USER_LAST_LOGIN_TIME = uSER_LAST_LOGIN_TIME;
	}
	public Date getUSER_APPLY_DATE() {
		return USER_APPLY_DATE;
	}
	public void setUSER_APPLY_DATE(Date uSER_APPLY_DATE) {
		USER_APPLY_DATE = uSER_APPLY_DATE;
	}
	public void setUSER_EMAIL_VAL_CODE(String uSER_EMAIL_VAL_CODE) {
		USER_EMAIL_VAL_CODE = uSER_EMAIL_VAL_CODE;
	}
	
}
