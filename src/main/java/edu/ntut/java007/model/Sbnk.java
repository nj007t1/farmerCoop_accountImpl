package edu.ntut.java007.model;

public class Sbnk implements java.io.Serializable {
	private static final long serialVersionUID = 1L;

	private String bnkCode;
	private String bnkName;

	public Sbnk() {
	}

	public Sbnk(String bnkCode, String bnkName) {
		this.bnkCode = bnkCode;
		this.bnkName = bnkName;
	}

	public String getBnkCode() {
		return this.bnkCode;
	}

	public void setBnkCode(String bnkCode) {
		this.bnkCode = bnkCode;
	}

	public String getBnkName() {
		return this.bnkName;
	}

	public void setBnkName(String bnkName) {
		this.bnkName = bnkName;
	}

}
