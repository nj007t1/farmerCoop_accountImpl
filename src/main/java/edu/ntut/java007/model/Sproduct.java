package edu.ntut.java007.model;

import java.sql.Clob;

public class Sproduct implements java.io.Serializable {
	private static final long serialVersionUID = 1L;

	private Integer productOid;
	private String productName;
	private String productImgUrl;
	private Clob productInfo;
	private Integer userOid;
	private String productCatId;

	public Sproduct() {
	}

	public Sproduct(String productName) {
		this.productName = productName;
	}

	public Sproduct(String productName, Integer userOid, String productCatId) {
		super();
		this.productName = productName;
		this.userOid = userOid;
		this.productCatId = productCatId;
	}

	public Sproduct(Integer productOid, String productName, String productImgUrl, Clob productInfo, Integer userOid,
			String productCatId) {
		super();
		this.productOid = productOid;
		this.productName = productName;
		this.productImgUrl = productImgUrl;
		this.productInfo = productInfo;
		this.userOid = userOid;
		this.productCatId = productCatId;
	}

	public Integer getProductOid() {
		return productOid;
	}

	public void setProductOid(Integer productOid) {
		this.productOid = productOid;
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public String getProductImgUrl() {
		return productImgUrl;
	}

	public void setProductImgUrl(String productImgUrl) {
		this.productImgUrl = productImgUrl;
	}

	public Clob getProductInfo() {
		return productInfo;
	}

	public void setProductInfo(Clob productInfo) {
		this.productInfo = productInfo;
	}

	public Integer getUserOid() {
		return userOid;
	}

	public void setUserOid(Integer userOid) {
		this.userOid = userOid;
	}

	public String getProductCatId() {
		return productCatId;
	}

	public void setProductCatId(String productCatId) {
		this.productCatId = productCatId;
	}

}
