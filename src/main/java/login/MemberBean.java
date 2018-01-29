package login;

import java.sql.Clob;
import java.sql.Date;

public class MemberBean {
	int user_OID;
	String user_NAME;
	String user_EMAIL;
	String user_PASSWD;
	String user_STATUS;
	String user_ZIP_CODE;
	String user_ADDRESS;
	String user_MOBILE;
	String user_TEL;
	String user_TEL_EXT;
	String farmer_ZIP_CODE;
	String farmer_ADDRESS;
	String farmer_MOBILE;
	String farmer_TEL;
	String farmer_TEL_EXT;
	Clob farmer_PROFILE;
	Date user_LAST_LOGIN_TIME;
	Date user_APPLY_DATE;
	String user_EMAIL_VAL_CODE;
	
	public MemberBean() {
		super();
	}

	public MemberBean(String user_NAME, String user_EMAIL, String user_PASSWD) {
		super();
		this.user_NAME = user_NAME;
		this.user_EMAIL = user_EMAIL;
		this.user_PASSWD = user_PASSWD;
	}

	public MemberBean(String user_EMAIL) {
		super();
		this.user_EMAIL = user_EMAIL;
	}

	public int getUser_OID() {
		return user_OID;
	}

	public void setUser_OID(int user_OID) {
		this.user_OID = user_OID;
	}

	public String getUser_NAME() {
		return user_NAME;
	}

	public void setUser_NAME(String user_NAME) {
		this.user_NAME = user_NAME;
	}

	public String getUser_EMAIL() {
		return user_EMAIL;
	}

	public void setUser_EMAIL(String user_EMAIL) {
		this.user_EMAIL = user_EMAIL;
	}

	public String getUser_PASSWD() {
		return user_PASSWD;
	}

	public void setUser_PASSWD(String user_PASSWD) {
		this.user_PASSWD = user_PASSWD;
	}

	public String getUser_STATUS() {
		return user_STATUS;
	}

	public void setUser_STATUS(String user_STATUS) {
		this.user_STATUS = user_STATUS;
	}

	public String getUser_ZIP_CODE() {
		return user_ZIP_CODE;
	}

	public void setUser_ZIP_CODE(String user_ZIP_CODE) {
		this.user_ZIP_CODE = user_ZIP_CODE;
	}

	public String getUser_ADDRESS() {
		return user_ADDRESS;
	}

	public void setUser_ADDRESS(String user_ADDRESS) {
		this.user_ADDRESS = user_ADDRESS;
	}

	public String getUser_MOBILE() {
		return user_MOBILE;
	}

	public void setUser_MOBILE(String user_MOBILE) {
		this.user_MOBILE = user_MOBILE;
	}

	public String getUser_TEL() {
		return user_TEL;
	}

	public void setUser_TEL(String user_TEL) {
		this.user_TEL = user_TEL;
	}

	public String getUser_TEL_EXT() {
		return user_TEL_EXT;
	}

	public void setUser_TEL_EXT(String user_TEL_EXT) {
		this.user_TEL_EXT = user_TEL_EXT;
	}

	public String getFarmer_ZIP_CODE() {
		return farmer_ZIP_CODE;
	}

	public void setFarmer_ZIP_CODE(String farmer_ZIP_CODE) {
		this.farmer_ZIP_CODE = farmer_ZIP_CODE;
	}

	public String getFarmer_ADDRESS() {
		return farmer_ADDRESS;
	}

	public void setFarmer_ADDRESS(String farmer_ADDRESS) {
		this.farmer_ADDRESS = farmer_ADDRESS;
	}

	public String getFarmer_MOBILE() {
		return farmer_MOBILE;
	}

	public void setFarmer_MOBILE(String farmer_MOBILE) {
		this.farmer_MOBILE = farmer_MOBILE;
	}

	public String getFarmer_TEL() {
		return farmer_TEL;
	}

	public void setFarmer_TEL(String farmer_TEL) {
		this.farmer_TEL = farmer_TEL;
	}

	public String getFarmer_TEL_EXT() {
		return farmer_TEL_EXT;
	}

	public void setFarmer_TEL_EXT(String farmer_TEL_EXT) {
		this.farmer_TEL_EXT = farmer_TEL_EXT;
	}

	public Clob getFarmer_PROFILE() {
		return farmer_PROFILE;
	}

	public void setFarmer_PROFILE(Clob farmer_PROFILE) {
		this.farmer_PROFILE = farmer_PROFILE;
	}

	public Date getUser_LAST_LOGIN_TIME() {
		return user_LAST_LOGIN_TIME;
	}

	public void setUser_LAST_LOGIN_TIME(Date user_LAST_LOGIN_TIME) {
		this.user_LAST_LOGIN_TIME = user_LAST_LOGIN_TIME;
	}

	public Date getUser_APPLY_DATE() {
		return user_APPLY_DATE;
	}

	public void setUser_APPLY_DATE(Date user_APPLY_DATE) {
		this.user_APPLY_DATE = user_APPLY_DATE;
	}

	public String getUser_EMAIL_VAL_CODE() {
		return user_EMAIL_VAL_CODE;
	}

	public void setUser_EMAIL_VAL_CODE(String user_EMAIL_VAL_CODE) {
		this.user_EMAIL_VAL_CODE = user_EMAIL_VAL_CODE;
	}

	
}
