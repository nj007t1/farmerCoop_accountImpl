package edu.ntut.java007.model;

import java.sql.Timestamp;

public class Sdiary implements java.io.Serializable {
	private static final long serialVersionUID = 1L;

	private Integer diaryOid;
	private Integer productOid;
	private String diaryTitle;
	private String zipCode;
	private Timestamp diaryCreateTime;
	private Timestamp diaryStrTime;
	private Timestamp diaryEndTime;

	public Sdiary() {
	}

	public Sdiary(Integer productOid, String diaryTitle, String zipCode, Timestamp diaryCreateTime) {
		super();
		this.productOid = productOid;
		this.diaryTitle = diaryTitle;
		this.zipCode = zipCode;
		this.diaryCreateTime = diaryCreateTime;
	}

	public Sdiary(Integer diaryOid, Integer productOid, String diaryTitle, String zipCode, Timestamp diaryCreateTime,
			Timestamp diaryStrTime, Timestamp diaryEndTime) {
		super();
		this.diaryOid = diaryOid;
		this.productOid = productOid;
		this.diaryTitle = diaryTitle;
		this.zipCode = zipCode;
		this.diaryCreateTime = diaryCreateTime;
		this.diaryStrTime = diaryStrTime;
		this.diaryEndTime = diaryEndTime;
	}

	public Integer getDiaryOid() {
		return diaryOid;
	}

	public void setDiaryOid(Integer diaryOid) {
		this.diaryOid = diaryOid;
	}

	public Integer getProductOid() {
		return productOid;
	}

	public void setProductOid(Integer productOid) {
		this.productOid = productOid;
	}

	public String getDiaryTitle() {
		return diaryTitle;
	}

	public void setDiaryTitle(String diaryTitle) {
		this.diaryTitle = diaryTitle;
	}

	public String getZipCode() {
		return zipCode;
	}

	public void setZipCode(String zipCode) {
		this.zipCode = zipCode;
	}

	public Timestamp getDiaryCreateTime() {
		return diaryCreateTime;
	}

	public void setDiaryCreateTime(Timestamp diaryCreateTime) {
		this.diaryCreateTime = diaryCreateTime;
	}

	public Timestamp getDiaryStrTime() {
		return diaryStrTime;
	}

	public void setDiaryStrTime(Timestamp diaryStrTime) {
		this.diaryStrTime = diaryStrTime;
	}

	public Timestamp getDiaryEndTime() {
		return diaryEndTime;
	}

	public void setDiaryEndTime(Timestamp diaryEndTime) {
		this.diaryEndTime = diaryEndTime;
	}

}
