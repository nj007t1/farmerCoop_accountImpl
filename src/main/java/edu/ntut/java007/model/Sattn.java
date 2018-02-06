package edu.ntut.java007.model;

import java.sql.Timestamp;

public class Sattn implements java.io.Serializable {
	private static final long serialVersionUID = 1L;

	private Integer userOid;
	private Integer userFarmerOid;
	private Timestamp attnCreateTime;

	public Sattn() {
	}

	public Sattn(Integer userOid, Integer userFarmerOid, Timestamp attnCreateTime) {
		super();
		this.userOid = userOid;
		this.userFarmerOid = userFarmerOid;
		this.attnCreateTime = attnCreateTime;
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

	public Timestamp getAttnCreateTime() {
		return attnCreateTime;
	}

	public void setAttnCreateTime(Timestamp attnCreateTime) {
		this.attnCreateTime = attnCreateTime;
	}

}
