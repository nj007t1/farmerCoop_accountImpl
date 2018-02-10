package edu.ntut.java007.model;

import java.sql.Timestamp;

public class Lorder implements java.io.Serializable {
	private static final long serialVersionUID = 1L;
	
	private Integer orderOid;
	private String orderTrackno;
	private String orderStatus;
	private Timestamp orderCreateTime;
	private Timestamp orderPickupTime;
	private Timestamp orderReachTime;
	private String orderContent;
	private String orderToCtcNbr;
	private String orderToName;
	private String orderToZipCode;
	private String orderToAddress;
	private String orderFromCtcNbr;
	private String orderFromName;
	private String orderFromZipCode;
	private String orderFromAddress;
	
	public Lorder() {
	}

	public Lorder(String orderTrackno, String orderStatus, Timestamp orderCreateTime, String orderContent,
			String orderToCtcNbr, String orderToName, String orderToZipCode, String orderToAddress,
			String orderFromCtcNbr, String orderFromName, String orderFromZipCode, String orderFromAddress) {
		super();
		this.orderTrackno = orderTrackno;
		this.orderStatus = orderStatus;
		this.orderCreateTime = orderCreateTime;
		this.orderContent = orderContent;
		this.orderToCtcNbr = orderToCtcNbr;
		this.orderToName = orderToName;
		this.orderToZipCode = orderToZipCode;
		this.orderToAddress = orderToAddress;
		this.orderFromCtcNbr = orderFromCtcNbr;
		this.orderFromName = orderFromName;
		this.orderFromZipCode = orderFromZipCode;
		this.orderFromAddress = orderFromAddress;
	}

	public Lorder(Integer orderOid, String orderTrackno, String orderStatus, Timestamp orderCreateTime,
			Timestamp orderPickupTime, Timestamp orderReachTime, String orderContent, String orderToCtcNbr,
			String orderToName, String orderToZipCode, String orderToAddress, String orderFromCtcNbr,
			String orderFromName, String orderFromZipCode, String orderFromAddress) {
		super();
		this.orderOid = orderOid;
		this.orderTrackno = orderTrackno;
		this.orderStatus = orderStatus;
		this.orderCreateTime = orderCreateTime;
		this.orderPickupTime = orderPickupTime;
		this.orderReachTime = orderReachTime;
		this.orderContent = orderContent;
		this.orderToCtcNbr = orderToCtcNbr;
		this.orderToName = orderToName;
		this.orderToZipCode = orderToZipCode;
		this.orderToAddress = orderToAddress;
		this.orderFromCtcNbr = orderFromCtcNbr;
		this.orderFromName = orderFromName;
		this.orderFromZipCode = orderFromZipCode;
		this.orderFromAddress = orderFromAddress;
	}

	public Integer getOrderOid() {
		return orderOid;
	}

	public void setOrderOid(Integer orderOid) {
		this.orderOid = orderOid;
	}

	public String getOrderTrackno() {
		return orderTrackno;
	}

	public void setOrderTrackno(String orderTrackno) {
		this.orderTrackno = orderTrackno;
	}

	public String getOrderStatus() {
		return orderStatus;
	}

	public void setOrderStatus(String orderStatus) {
		this.orderStatus = orderStatus;
	}

	public Timestamp getOrderCreateTime() {
		return orderCreateTime;
	}

	public void setOrderCreateTime(Timestamp orderCreateTime) {
		this.orderCreateTime = orderCreateTime;
	}

	public Timestamp getOrderPickupTime() {
		return orderPickupTime;
	}

	public void setOrderPickupTime(Timestamp orderPickupTime) {
		this.orderPickupTime = orderPickupTime;
	}

	public Timestamp getOrderReachTime() {
		return orderReachTime;
	}

	public void setOrderReachTime(Timestamp orderReachTime) {
		this.orderReachTime = orderReachTime;
	}

	public String getOrderContent() {
		return orderContent;
	}

	public void setOrderContent(String orderContent) {
		this.orderContent = orderContent;
	}

	public String getOrderToCtcNbr() {
		return orderToCtcNbr;
	}

	public void setOrderToCtcNbr(String orderToCtcNbr) {
		this.orderToCtcNbr = orderToCtcNbr;
	}

	public String getOrderToName() {
		return orderToName;
	}

	public void setOrderToName(String orderToName) {
		this.orderToName = orderToName;
	}

	public String getOrderToZipCode() {
		return orderToZipCode;
	}

	public void setOrderToZipCode(String orderToZipCode) {
		this.orderToZipCode = orderToZipCode;
	}

	public String getOrderToAddress() {
		return orderToAddress;
	}

	public void setOrderToAddress(String orderToAddress) {
		this.orderToAddress = orderToAddress;
	}

	public String getOrderFromCtcNbr() {
		return orderFromCtcNbr;
	}

	public void setOrderFromCtcNbr(String orderFromCtcNbr) {
		this.orderFromCtcNbr = orderFromCtcNbr;
	}

	public String getOrderFromName() {
		return orderFromName;
	}

	public void setOrderFromName(String orderFromName) {
		this.orderFromName = orderFromName;
	}

	public String getOrderFromZipCode() {
		return orderFromZipCode;
	}

	public void setOrderFromZipCode(String orderFromZipCode) {
		this.orderFromZipCode = orderFromZipCode;
	}

	public String getOrderFromAddress() {
		return orderFromAddress;
	}

	public void setOrderFromAddress(String orderFromAddress) {
		this.orderFromAddress = orderFromAddress;
	}

}
