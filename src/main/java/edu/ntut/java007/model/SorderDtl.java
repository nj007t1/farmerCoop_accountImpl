package edu.ntut.java007.model;

import java.math.BigDecimal;
import java.sql.Timestamp;

public class SorderDtl implements java.io.Serializable {
	private static final long serialVersionUID = 1L;
	
	private Integer orderDtlOid;
	private Integer orderOid;
	private Integer planOid;
	private BigDecimal orderDtlPrice;
	private BigDecimal orderDtlQty;
	private BigDecimal orderDtlTotal;
	private Timestamp orderDtlShipTime;
	private String orderDtlTrackno;
	private Timestamp orderDtlDelyTime;

	public SorderDtl() {
	}

	public SorderDtl(Integer orderOid, Integer planOid, BigDecimal orderDtlPrice, BigDecimal orderDtlQty,
			BigDecimal orderDtlTotal) {
		super();
		this.orderOid = orderOid;
		this.planOid = planOid;
		this.orderDtlPrice = orderDtlPrice;
		this.orderDtlQty = orderDtlQty;
		this.orderDtlTotal = orderDtlTotal;
	}

	public SorderDtl(Integer orderDtlOid, Integer orderOid, Integer planOid, BigDecimal orderDtlPrice,
			BigDecimal orderDtlQty, BigDecimal orderDtlTotal, Timestamp orderDtlShipTime, String orderDtlTrackno,
			Timestamp orderDtlDelyTime) {
		super();
		this.orderDtlOid = orderDtlOid;
		this.orderOid = orderOid;
		this.planOid = planOid;
		this.orderDtlPrice = orderDtlPrice;
		this.orderDtlQty = orderDtlQty;
		this.orderDtlTotal = orderDtlTotal;
		this.orderDtlShipTime = orderDtlShipTime;
		this.orderDtlTrackno = orderDtlTrackno;
		this.orderDtlDelyTime = orderDtlDelyTime;
	}

	public Integer getOrderDtlOid() {
		return orderDtlOid;
	}

	public void setOrderDtlOid(Integer orderDtlOid) {
		this.orderDtlOid = orderDtlOid;
	}

	public Integer getOrderOid() {
		return orderOid;
	}

	public void setOrderOid(Integer orderOid) {
		this.orderOid = orderOid;
	}

	public Integer getPlanOid() {
		return planOid;
	}

	public void setPlanOid(Integer planOid) {
		this.planOid = planOid;
	}

	public BigDecimal getOrderDtlPrice() {
		return orderDtlPrice;
	}

	public void setOrderDtlPrice(BigDecimal orderDtlPrice) {
		this.orderDtlPrice = orderDtlPrice;
	}

	public BigDecimal getOrderDtlQty() {
		return orderDtlQty;
	}

	public void setOrderDtlQty(BigDecimal orderDtlQty) {
		this.orderDtlQty = orderDtlQty;
	}

	public BigDecimal getOrderDtlTotal() {
		return orderDtlTotal;
	}

	public void setOrderDtlTotal(BigDecimal orderDtlTotal) {
		this.orderDtlTotal = orderDtlTotal;
	}

	public Timestamp getOrderDtlShipTime() {
		return orderDtlShipTime;
	}

	public void setOrderDtlShipTime(Timestamp orderDtlShipTime) {
		this.orderDtlShipTime = orderDtlShipTime;
	}

	public String getOrderDtlTrackno() {
		return orderDtlTrackno;
	}

	public void setOrderDtlTrackno(String orderDtlTrackno) {
		this.orderDtlTrackno = orderDtlTrackno;
	}

	public Timestamp getOrderDtlDelyTime() {
		return orderDtlDelyTime;
	}

	public void setOrderDtlDelyTime(Timestamp orderDtlDelyTime) {
		this.orderDtlDelyTime = orderDtlDelyTime;
	}

}
