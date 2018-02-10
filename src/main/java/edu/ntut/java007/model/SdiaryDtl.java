package edu.ntut.java007.model;

import java.sql.Timestamp;
import java.sql.Date;

public class SdiaryDtl implements java.io.Serializable {
	private static final long serialVersionUID = 1L;
	
	private Integer diaryDtlOid;
	private Integer diaryOid;
	private String diaryDtlImgUrl;
	private String diaryDtlTextContent;
	private Date diaryDtlImgDate;
	private Timestamp diaryDtlCreateTime;
	private Timestamp diaryDtlUpdateTime;

	public SdiaryDtl() {
	}

	public SdiaryDtl(Integer diaryOid, String diaryDtlImgUrl, String diaryDtlTextContent, Date diaryDtlImgDate,
			Timestamp diaryDtlCreateTime) {
		super();
		this.diaryOid = diaryOid;
		this.diaryDtlImgUrl = diaryDtlImgUrl;
		this.diaryDtlTextContent = diaryDtlTextContent;
		this.diaryDtlImgDate = diaryDtlImgDate;
		this.diaryDtlCreateTime = diaryDtlCreateTime;
	}

	public SdiaryDtl(Integer diaryDtlOid, Integer diaryOid, String diaryDtlImgUrl, String diaryDtlTextContent,
			Date diaryDtlImgDate, Timestamp diaryDtlCreateTime, Timestamp diaryDtlUpdateTime) {
		super();
		this.diaryDtlOid = diaryDtlOid;
		this.diaryOid = diaryOid;
		this.diaryDtlImgUrl = diaryDtlImgUrl;
		this.diaryDtlTextContent = diaryDtlTextContent;
		this.diaryDtlImgDate = diaryDtlImgDate;
		this.diaryDtlCreateTime = diaryDtlCreateTime;
		this.diaryDtlUpdateTime = diaryDtlUpdateTime;
	}

	public Integer getDiaryDtlOid() {
		return diaryDtlOid;
	}

	public void setDiaryDtlOid(Integer diaryDtlOid) {
		this.diaryDtlOid = diaryDtlOid;
	}

	public Integer getDiaryOid() {
		return diaryOid;
	}

	public void setDiaryOid(Integer diaryOid) {
		this.diaryOid = diaryOid;
	}

	public String getDiaryDtlImgUrl() {
		return diaryDtlImgUrl;
	}

	public void setDiaryDtlImgUrl(String diaryDtlImgUrl) {
		this.diaryDtlImgUrl = diaryDtlImgUrl;
	}

	public String getDiaryDtlTextContent() {
		return diaryDtlTextContent;
	}

	public void setDiaryDtlTextContent(String diaryDtlTextContent) {
		this.diaryDtlTextContent = diaryDtlTextContent;
	}

	public Date getDiaryDtlImgDate() {
		return diaryDtlImgDate;
	}

	public void setDiaryDtlImgDate(Date diaryDtlImgDate) {
		this.diaryDtlImgDate = diaryDtlImgDate;
	}

	public Timestamp getDiaryDtlCreateTime() {
		return diaryDtlCreateTime;
	}

	public void setDiaryDtlCreateTime(Timestamp diaryDtlCreateTime) {
		this.diaryDtlCreateTime = diaryDtlCreateTime;
	}

	public Timestamp getDiaryDtlUpdateTime() {
		return diaryDtlUpdateTime;
	}

	public void setDiaryDtlUpdateTime(Timestamp diaryDtlUpdateTime) {
		this.diaryDtlUpdateTime = diaryDtlUpdateTime;
	}

}
