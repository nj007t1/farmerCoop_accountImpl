package login;

import java.sql.Clob;
import java.sql.Timestamp;

public class MemberBean {
	int userOid;
	String userName;
	String userEmail;
	String userPasswd;
	String userStatus;
	String userZipCode;
	String userAddress;
	String userMobile;
	String userTel;
	String userTelExt;
	String farmerZipCode;
	String farmerAddress;
	String farmerMobile;
	String farmerTel;
	String farmerTelExt;
	Clob farmerProfile;
	Timestamp userLastLoginTime;
	Timestamp userApplyDate;
	String userEmailValCode;

	public MemberBean() {
		super();
	}

	public MemberBean(String userEmail) {
		super();
		this.userEmail = userEmail;
	}

	public MemberBean(String userName, String userEmail, String userPasswd) {
		super();
		this.userName = userName;
		this.userEmail = userEmail;
		this.userPasswd = userPasswd;
	}

	public MemberBean(String userName, String userEmail, String userPasswd, Timestamp userApplyDate) {
		this(userName, userEmail, userPasswd);
		this.userApplyDate = userApplyDate;
	}

	public int getUserOid() {
		return userOid;
	}

	public void setUserOid(int userOid) {
		this.userOid = userOid;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getUserEmail() {
		return userEmail;
	}

	public void setUserEmail(String userEmail) {
		this.userEmail = userEmail;
	}

	public String getUserPasswd() {
		return userPasswd;
	}

	public void setUserPasswd(String userPasswd) {
		this.userPasswd = userPasswd;
	}

	public String getUserStatus() {
		return userStatus;
	}

	public void setUserStatus(String userStatus) {
		this.userStatus = userStatus;
	}

	public String getUserZipCode() {
		return userZipCode;
	}

	public void setUserZipCode(String userZipCode) {
		this.userZipCode = userZipCode;
	}

	public String getUserAddress() {
		return userAddress;
	}

	public void setUserAddress(String userAddress) {
		this.userAddress = userAddress;
	}

	public String getUserMobile() {
		return userMobile;
	}

	public void setUserMobile(String userMobile) {
		this.userMobile = userMobile;
	}

	public String getUserTel() {
		return userTel;
	}

	public void setUserTel(String userTel) {
		this.userTel = userTel;
	}

	public String getUserTelExt() {
		return userTelExt;
	}

	public void setUserTelExt(String userTelExt) {
		this.userTelExt = userTelExt;
	}

	public String getFarmerZipCode() {
		return farmerZipCode;
	}

	public void setFarmerZipCode(String farmerZipCode) {
		this.farmerZipCode = farmerZipCode;
	}

	public String getFarmerAddress() {
		return farmerAddress;
	}

	public void setFarmerAddress(String farmerAddress) {
		this.farmerAddress = farmerAddress;
	}

	public String getFarmerMobile() {
		return farmerMobile;
	}

	public void setFarmerMobile(String farmerMobile) {
		this.farmerMobile = farmerMobile;
	}

	public String getFarmerTel() {
		return farmerTel;
	}

	public void setFarmerTel(String farmerTel) {
		this.farmerTel = farmerTel;
	}

	public String getFarmerTelExt() {
		return farmerTelExt;
	}

	public void setFarmerTelExt(String farmerTelExt) {
		this.farmerTelExt = farmerTelExt;
	}

	public Clob getFarmerProfile() {
		return farmerProfile;
	}

	public void setFarmerProfile(Clob farmerProfile) {
		this.farmerProfile = farmerProfile;
	}

	public Timestamp getUserLastLoginTime() {
		return userLastLoginTime;
	}

	public void setUserLastLoginTime(Timestamp userLastLoginTime) {
		//這個物件的屬性等於這個參數
		this.userLastLoginTime = userLastLoginTime;
	}

	public Timestamp getUserApplyDate() {
		return userApplyDate;
	}

	public void setUserApplyDate(Timestamp userApplyDate) {
		this.userApplyDate = userApplyDate;
	}

	public String getUserEmailValCode() {
		return userEmailValCode;
	}

	public void setUserEmailValCode(String userEmailValCode) {
		this.userEmailValCode = userEmailValCode;
	}

}
