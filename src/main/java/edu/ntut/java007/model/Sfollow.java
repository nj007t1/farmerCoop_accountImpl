package edu.ntut.java007.model;

import java.sql.Timestamp;

public class Sfollow implements java.io.Serializable {
	private static final long serialVersionUID = 1L;

	private Integer userOid;
	private Integer diaryOid;
	private Timestamp followCreateTime;

	public Sfollow() {
	}

	public Sfollow(Integer userOid, Integer diaryOid, Timestamp followCreateTime) {
		super();
		this.userOid = userOid;
		this.diaryOid = diaryOid;
		this.followCreateTime = followCreateTime;
	}

	public Integer getUserOid() {
		return userOid;
	}

	public void setUserOid(Integer userOid) {
		this.userOid = userOid;
	}

	public Integer getDiaryOid() {
		return diaryOid;
	}

	public void setDiaryOid(Integer diaryOid) {
		this.diaryOid = diaryOid;
	}

	public Timestamp getFollowCreateTime() {
		return followCreateTime;
	}

	public void setFollowCreateTime(Timestamp followCreateTime) {
		this.followCreateTime = followCreateTime;
	}

}
