package edu.ntut.java007.model;

import java.math.BigDecimal;
import java.sql.Timestamp;

public class Splan implements java.io.Serializable {
	private static final long serialVersionUID = 1L;

	private Integer planOid;
	private Integer productOid;
	private String planName;
	private BigDecimal planPrice;
	private BigDecimal planStockQty;
	private BigDecimal planSaleQty;
	private BigDecimal planWeight;
	private String planUnit;
	private String planMemo;
	private Timestamp planStrTime;
	private Timestamp planEndTime;

	public Splan() {
	}

	public Splan(Integer productOid, String planName, BigDecimal planPrice, BigDecimal planStockQty,
			BigDecimal planSaleQty, BigDecimal planWeight, String planUnit) {
		super();
		this.productOid = productOid;
		this.planName = planName;
		this.planPrice = planPrice;
		this.planStockQty = planStockQty;
		this.planSaleQty = planSaleQty;
		this.planWeight = planWeight;
		this.planUnit = planUnit;
	}

	public Splan(Integer planOid, Integer productOid, String planName, BigDecimal planPrice, BigDecimal planStockQty,
			BigDecimal planSaleQty, BigDecimal planWeight, String planUnit, String planMemo, Timestamp planStrTime,
			Timestamp planEndTime) {
		super();
		this.planOid = planOid;
		this.productOid = productOid;
		this.planName = planName;
		this.planPrice = planPrice;
		this.planStockQty = planStockQty;
		this.planSaleQty = planSaleQty;
		this.planWeight = planWeight;
		this.planUnit = planUnit;
		this.planMemo = planMemo;
		this.planStrTime = planStrTime;
		this.planEndTime = planEndTime;
	}

	public Integer getPlanOid() {
		return planOid;
	}

	public void setPlanOid(Integer planOid) {
		this.planOid = planOid;
	}

	public Integer getProductOid() {
		return productOid;
	}

	public void setProductOid(Integer productOid) {
		this.productOid = productOid;
	}

	public String getPlanName() {
		return planName;
	}

	public void setPlanName(String planName) {
		this.planName = planName;
	}

	public BigDecimal getPlanPrice() {
		return planPrice;
	}

	public void setPlanPrice(BigDecimal planPrice) {
		this.planPrice = planPrice;
	}

	public BigDecimal getPlanStockQty() {
		return planStockQty;
	}

	public void setPlanStockQty(BigDecimal planStockQty) {
		this.planStockQty = planStockQty;
	}

	public BigDecimal getPlanSaleQty() {
		return planSaleQty;
	}

	public void setPlanSaleQty(BigDecimal planSaleQty) {
		this.planSaleQty = planSaleQty;
	}

	public BigDecimal getPlanWeight() {
		return planWeight;
	}

	public void setPlanWeight(BigDecimal planWeight) {
		this.planWeight = planWeight;
	}

	public String getPlanUnit() {
		return planUnit;
	}

	public void setPlanUnit(String planUnit) {
		this.planUnit = planUnit;
	}

	public String getPlanMemo() {
		return planMemo;
	}

	public void setPlanMemo(String planMemo) {
		this.planMemo = planMemo;
	}

	public Timestamp getPlanStrTime() {
		return planStrTime;
	}

	public void setPlanStrTime(Timestamp planStrTime) {
		this.planStrTime = planStrTime;
	}

	public Timestamp getPlanEndTime() {
		return planEndTime;
	}

	public void setPlanEndTime(Timestamp planEndTime) {
		this.planEndTime = planEndTime;
	}

}
