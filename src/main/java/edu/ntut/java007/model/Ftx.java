package edu.ntut.java007.model;

import java.math.BigDecimal;
import java.sql.Timestamp;

public class Ftx implements java.io.Serializable {
	private static final long serialVersionUID = 1L;

	private Integer txOid;
	private String bnkCode;
	private String txAcctno;
	private String txType;
	private String transferBnkCode;
	private String txTransferAcctno;
	private BigDecimal txAmount;
	private BigDecimal txBalance;
	private BigDecimal txFee;
	private Timestamp txTime;
	private String txMemo;

	public Ftx() {
	}

	public Ftx(String bnkCode, String txAcctno, String txType, BigDecimal txAmount, BigDecimal txBalance,
			Timestamp txTime) {
		super();
		this.bnkCode = bnkCode;
		this.txAcctno = txAcctno;
		this.txType = txType;
		this.txAmount = txAmount;
		this.txBalance = txBalance;
		this.txTime = txTime;
	}

	public Ftx(Integer txOid, String bnkCode, String txAcctno, String txType, String transferBnkCode,
			String txTransferAcctno, BigDecimal txAmount, BigDecimal txBalance, BigDecimal txFee, Timestamp txTime,
			String txMemo) {
		super();
		this.txOid = txOid;
		this.bnkCode = bnkCode;
		this.txAcctno = txAcctno;
		this.txType = txType;
		this.transferBnkCode = transferBnkCode;
		this.txTransferAcctno = txTransferAcctno;
		this.txAmount = txAmount;
		this.txBalance = txBalance;
		this.txFee = txFee;
		this.txTime = txTime;
		this.txMemo = txMemo;
	}

	public Integer getTxOid() {
		return txOid;
	}

	public void setTxOid(Integer txOid) {
		this.txOid = txOid;
	}

	public String getBnkCode() {
		return bnkCode;
	}

	public void setBnkCode(String bnkCode) {
		this.bnkCode = bnkCode;
	}

	public String getTxAcctno() {
		return txAcctno;
	}

	public void setTxAcctno(String txAcctno) {
		this.txAcctno = txAcctno;
	}

	public String getTxType() {
		return txType;
	}

	public void setTxType(String txType) {
		this.txType = txType;
	}

	public String getTransferBnkCode() {
		return transferBnkCode;
	}

	public void setTransferBnkCode(String transferBnkCode) {
		this.transferBnkCode = transferBnkCode;
	}

	public String getTxTransferAcctno() {
		return txTransferAcctno;
	}

	public void setTxTransferAcctno(String txTransferAcctno) {
		this.txTransferAcctno = txTransferAcctno;
	}

	public BigDecimal getTxAmount() {
		return txAmount;
	}

	public void setTxAmount(BigDecimal txAmount) {
		this.txAmount = txAmount;
	}

	public BigDecimal getTxBalance() {
		return txBalance;
	}

	public void setTxBalance(BigDecimal txBalance) {
		this.txBalance = txBalance;
	}

	public BigDecimal getTxFee() {
		return txFee;
	}

	public void setTxFee(BigDecimal txFee) {
		this.txFee = txFee;
	}

	public Timestamp getTxTime() {
		return txTime;
	}

	public void setTxTime(Timestamp txTime) {
		this.txTime = txTime;
	}

	public String getTxMemo() {
		return txMemo;
	}

	public void setTxMemo(String txMemo) {
		this.txMemo = txMemo;
	}

}
