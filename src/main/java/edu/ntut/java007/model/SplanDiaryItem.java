package edu.ntut.java007.model;

import java.sql.Timestamp;

public class SplanDiaryItem implements java.io.Serializable {
	private static final long serialVersionUID = 1L;

	private Integer planOid;
	private Integer diaryOid;
	private Timestamp planDiaryItemCreateTime;

	public SplanDiaryItem() {
	}

	public SplanDiaryItem(Integer planOid, Integer diaryOid, Timestamp planDiaryItemCreateTime) {
		super();
		this.planOid = planOid;
		this.diaryOid = diaryOid;
		this.planDiaryItemCreateTime = planDiaryItemCreateTime;
	}

	public Integer getPlanOid() {
		return planOid;
	}

	public void setPlanOid(Integer planOid) {
		this.planOid = planOid;
	}

	public Integer getDiaryOid() {
		return diaryOid;
	}

	public void setDiaryOid(Integer diaryOid) {
		this.diaryOid = diaryOid;
	}

	public Timestamp getPlanDiaryItemCreateTime() {
		return planDiaryItemCreateTime;
	}

	public void setPlanDiaryItemCreateTime(Timestamp planDiaryItemCreateTime) {
		this.planDiaryItemCreateTime = planDiaryItemCreateTime;
	}

}
