package edu.ntut.java007.model;

public class Lzip implements java.io.Serializable {
	private static final long serialVersionUID = 1L;

	private String zipCode;
	private String zipCountyName;
	private String zipTownName;

	public Lzip() {
	}

	public Lzip(String zipCode, String zipCountyName, String zipTownName) {
		this.zipCode = zipCode;
		this.zipCountyName = zipCountyName;
		this.zipTownName = zipTownName;
	}

	public String getZipCode() {
		return zipCode;
	}

	public void setZipCode(String zipCode) {
		this.zipCode = zipCode;
	}

	public String getZipCountyName() {
		return zipCountyName;
	}

	public void setZipCountyName(String zipCountyName) {
		this.zipCountyName = zipCountyName;
	}

	public String getZipTownName() {
		return zipTownName;
	}

	public void setZipTownName(String zipTownName) {
		this.zipTownName = zipTownName;
	}

}
