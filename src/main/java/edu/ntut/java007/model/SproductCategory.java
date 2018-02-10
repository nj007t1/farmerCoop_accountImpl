package edu.ntut.java007.model;

public class SproductCategory implements java.io.Serializable {
	private static final long serialVersionUID = 1L;
	
	private String productCatId;
	private String productCatMname;
	private String productCatSname;
	private String productCatDesc;

	public SproductCategory() {
	}

	public SproductCategory(String productCatId, String productCatMname, String productCatSname) {
		this.productCatId = productCatId;
		this.productCatMname = productCatMname;
		this.productCatSname = productCatSname;
	}

	public SproductCategory(String productCatId, String productCatMname, String productCatSname,
			String productCatDesc) {
		super();
		this.productCatId = productCatId;
		this.productCatMname = productCatMname;
		this.productCatSname = productCatSname;
		this.productCatDesc = productCatDesc;
	}

	public String getProductCatId() {
		return this.productCatId;
	}

	public void setProductCatId(String productCatId) {
		this.productCatId = productCatId;
	}

	public String getProductCatMname() {
		return this.productCatMname;
	}

	public void setProductCatMname(String productCatMname) {
		this.productCatMname = productCatMname;
	}

	public String getProductCatSname() {
		return this.productCatSname;
	}

	public void setProductCatSname(String productCatSname) {
		this.productCatSname = productCatSname;
	}

	public String getProductCatDesc() {
		return this.productCatDesc;
	}

	public void setProductCatDesc(String productCatDesc) {
		this.productCatDesc = productCatDesc;
	}

}
