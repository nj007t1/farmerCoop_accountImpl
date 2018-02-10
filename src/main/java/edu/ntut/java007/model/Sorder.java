package edu.ntut.java007.model;

import java.math.BigDecimal;
import java.sql.Timestamp;

public class Sorder implements java.io.Serializable {
	private static final long serialVersionUID = 1L;
	
	private Integer orderOid;
	private Integer userOid;
	private Integer userFarmerOid;
	private Timestamp orderTime;
	private BigDecimal orderShipFee;
	private BigDecimal orderTotal;
	private String userLastName;
	private String userFirstName;
	private String userZipCode;
	private String userAddress;
	private String userMobile;
	private String userTel;
	private String userTelExt;
	private String orderDtlStatus;
	private Integer txOid;
	private BigDecimal orderIncome;
	private Timestamp userCancelTime;
	private String userCancelReason;
	private Timestamp farmerCancelTime;
	
	public Sorder() {
	}

	public Sorder(Timestamp orderTime, BigDecimal orderTotal, String userLastName, String userFirstName,
			String userZipCode, String userAddress) {
		super();
		this.orderTime = orderTime;
		this.orderTotal = orderTotal;
		this.userLastName = userLastName;
		this.userFirstName = userFirstName;
		this.userZipCode = userZipCode;
		this.userAddress = userAddress;
	}

	public Sorder(Integer orderOid, Integer userOid, Integer userFarmerOid, Timestamp orderTime,
			BigDecimal orderShipFee, BigDecimal orderTotal, String userLastName, String userFirstName,
			String userZipCode, String userAddress, String userMobile, String userTel, String userTelExt,
			String orderDtlStatus, Integer txOid, BigDecimal orderIncome, Timestamp userCancelTime,
			String userCancelReason, Timestamp farmerCancelTime) {
		super();
		this.orderOid = orderOid;
		this.userOid = userOid;
		this.userFarmerOid = userFarmerOid;
		this.orderTime = orderTime;
		this.orderShipFee = orderShipFee;
		this.orderTotal = orderTotal;
		this.userLastName = userLastName;
		this.userFirstName = userFirstName;
		this.userZipCode = userZipCode;
		this.userAddress = userAddress;
		this.userMobile = userMobile;
		this.userTel = userTel;
		this.userTelExt = userTelExt;
		this.orderDtlStatus = orderDtlStatus;
		this.txOid = txOid;
		this.orderIncome = orderIncome;
		this.userCancelTime = userCancelTime;
		this.userCancelReason = userCancelReason;
		this.farmerCancelTime = farmerCancelTime;
	}

	public Integer getOrderOid() {
		return orderOid;
	}

	public void setOrderOid(Integer orderOid) {
		this.orderOid = orderOid;
	}

	public Integer getUserOid() {
		return userOid;
	}

	public void setUserOid(Integer userOid) {
		this.userOid = userOid;
	}

	public Integer getUserFarmerOid() {
		return userFarmerOid;
	}

	public void setUserFarmerOid(Integer userFarmerOid) {
		this.userFarmerOid = userFarmerOid;
	}

	public Timestamp getOrderTime() {
		return orderTime;
	}

	public void setOrderTime(Timestamp orderTime) {
		this.orderTime = orderTime;
	}

	public BigDecimal getOrderShipFee() {
		return orderShipFee;
	}

	public void setOrderShipFee(BigDecimal orderShipFee) {
		this.orderShipFee = orderShipFee;
	}

	public BigDecimal getOrderTotal() {
		return orderTotal;
	}

	public void setOrderTotal(BigDecimal orderTotal) {
		this.orderTotal = orderTotal;
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

	public String getOrderDtlStatus() {
		return orderDtlStatus;
	}

	public void setOrderDtlStatus(String orderDtlStatus) {
		this.orderDtlStatus = orderDtlStatus;
	}

	public Integer getTxOid() {
		return txOid;
	}

	public void setTxOid(Integer txOid) {
		this.txOid = txOid;
	}

	public BigDecimal getOrderIncome() {
		return orderIncome;
	}

	public void setOrderIncome(BigDecimal orderIncome) {
		this.orderIncome = orderIncome;
	}

	public Timestamp getUserCancelTime() {
		return userCancelTime;
	}

	public void setUserCancelTime(Timestamp userCancelTime) {
		this.userCancelTime = userCancelTime;
	}

	public String getUserCancelReason() {
		return userCancelReason;
	}

	public void setUserCancelReason(String userCancelReason) {
		this.userCancelReason = userCancelReason;
	}

	public Timestamp getFarmerCancelTime() {
		return farmerCancelTime;
	}

	public void setFarmerCancelTime(Timestamp farmerCancelTime) {
		this.farmerCancelTime = farmerCancelTime;
	}
	
}
