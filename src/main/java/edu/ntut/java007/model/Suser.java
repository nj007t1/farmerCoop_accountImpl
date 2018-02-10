package edu.ntut.java007.model;

import java.sql.Clob;
import java.sql.Timestamp;

public class Suser implements java.io.Serializable {
	private static final long serialVersionUID = 1L;

	private Integer userOid;
	private String userName;
	private String userLastName;
	private String userFirstName;
	private String userEmail;
	private String userPasswd;
	private String userStatus;
	private String userZipCode;
	private String userAddress;
	private String userMobile;
	private String userTel;
	private String userTelExt;
	private String farmerZipCode;
	private String farmerAddress;
	private String farmerMobile;
	private String farmerTel;
	private String farmerTelExt;
	private Clob farmerProfile;
	private String farmerBnkCode;
	private String farmerBnkAcctno;
	private Timestamp userLastLoginTime;
	private Timestamp userApplyDate;
	private String userEmailValCode;

	public Suser() {
	}

	public Suser(String userName, String userEmail, String userPasswd, Timestamp userApplyDate) {
		this.userName = userName;
		this.userEmail = userEmail;
		this.userPasswd = userPasswd;
		this.userApplyDate = userApplyDate;
	}

	public Suser(Integer userOid, String userName, String userLastName, String userFirstName, String userEmail,
			String userPasswd, String userStatus, String userZipCode, String userAddress, String userMobile,
			String userTel, String userTelExt, String farmerZipCode, String farmerAddress, String farmerMobile,
			String farmerTel, String farmerTelExt, Clob farmerProfile, String farmerBnkCode, String farmerBnkAcctno,
			Timestamp userLastLoginTime, Timestamp userApplyDate, String userEmailValCode) {
		super();
		this.userOid = userOid;
		this.userName = userName;
		this.userLastName = userLastName;
		this.userFirstName = userFirstName;
		this.userEmail = userEmail;
		this.userPasswd = userPasswd;
		this.userStatus = userStatus;
		this.userZipCode = userZipCode;
		this.userAddress = userAddress;
		this.userMobile = userMobile;
		this.userTel = userTel;
		this.userTelExt = userTelExt;
		this.farmerZipCode = farmerZipCode;
		this.farmerAddress = farmerAddress;
		this.farmerMobile = farmerMobile;
		this.farmerTel = farmerTel;
		this.farmerTelExt = farmerTelExt;
		this.farmerProfile = farmerProfile;
		this.farmerBnkCode = farmerBnkCode;
		this.farmerBnkAcctno = farmerBnkAcctno;
		this.userLastLoginTime = userLastLoginTime;
		this.userApplyDate = userApplyDate;
		this.userEmailValCode = userEmailValCode;
	}

	public Integer getUserOid() {
		return userOid;
	}

	public void setUserOid(Integer userOid) {
		this.userOid = userOid;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getUserLastName() {
		return userLastName;
	}

	public void setUserLastName(String userLastName) {
		this.userLastName = userLastName;
	}

	public String getUserFirstName() {
		return userFirstName;
	}

	public void setUserFirstName(String userFirstName) {
		this.userFirstName = userFirstName;
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

	public String getFarmerBnkCode() {
		return farmerBnkCode;
	}

	public void setFarmerBnkCode(String farmerBnkCode) {
		this.farmerBnkCode = farmerBnkCode;
	}

	public String getFarmerBnkAcctno() {
		return farmerBnkAcctno;
	}

	public void setFarmerBnkAcctno(String farmerBnkAcctno) {
		this.farmerBnkAcctno = farmerBnkAcctno;
	}

	public Timestamp getUserLastLoginTime() {
		return userLastLoginTime;
	}

	public void setUserLastLoginTime(Timestamp userLastLoginTime) {
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
