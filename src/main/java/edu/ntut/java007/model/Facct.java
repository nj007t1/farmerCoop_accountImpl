package edu.ntut.java007.model;

import java.math.BigDecimal;

public class Facct implements java.io.Serializable {
	private static final long serialVersionUID = 1L;

	private String acctAcctno;
	private String acctLastName;
	private String acctFirstName;
	private String acctEmail;
	private BigDecimal acctBalance;
	private String acctType;
	private String acctCcn;
	private String acctCcExpYear;
	private String acctCcExpMonth;

	public Facct() {
	}

	public Facct(String acctAcctno, String acctLastName, String acctFirstName, String acctEmail, BigDecimal acctBalance,
			String acctType) {
		this.acctAcctno = acctAcctno;
		this.acctLastName = acctLastName;
		this.acctFirstName = acctFirstName;
		this.acctEmail = acctEmail;
		this.acctBalance = acctBalance;
		this.acctType = acctType;
	}

	public Facct(String acctAcctno, String acctLastName, String acctFirstName, String acctEmail, BigDecimal acctBalance,
			String acctType, String acctCcn, String acctCcExpYear, String acctCcExpMonth) {
		this.acctAcctno = acctAcctno;
		this.acctLastName = acctLastName;
		this.acctFirstName = acctFirstName;
		this.acctEmail = acctEmail;
		this.acctBalance = acctBalance;
		this.acctType = acctType;
		this.acctCcn = acctCcn;
		this.acctCcExpYear = acctCcExpYear;
		this.acctCcExpMonth = acctCcExpMonth;
	}

	public String getAcctAcctno() {
		return this.acctAcctno;
	}

	public void setAcctAcctno(String acctAcctno) {
		this.acctAcctno = acctAcctno;
	}

	public String getAcctLastName() {
		return this.acctLastName;
	}

	public void setAcctLastName(String acctLastName) {
		this.acctLastName = acctLastName;
	}

	public String getAcctFirstName() {
		return this.acctFirstName;
	}

	public void setAcctFirstName(String acctFirstName) {
		this.acctFirstName = acctFirstName;
	}

	public String getAcctEmail() {
		return this.acctEmail;
	}

	public void setAcctEmail(String acctEmail) {
		this.acctEmail = acctEmail;
	}

	public BigDecimal getAcctBalance() {
		return this.acctBalance;
	}

	public void setAcctBalance(BigDecimal acctBalance) {
		this.acctBalance = acctBalance;
	}

	public String getAcctType() {
		return this.acctType;
	}

	public void setAcctType(String acctType) {
		this.acctType = acctType;
	}

	public String getAcctCcn() {
		return this.acctCcn;
	}

	public void setAcctCcn(String acctCcn) {
		this.acctCcn = acctCcn;
	}

	public String getAcctCcExpYear() {
		return this.acctCcExpYear;
	}

	public void setAcctCcExpYear(String acctCcExpYear) {
		this.acctCcExpYear = acctCcExpYear;
	}

	public String getAcctCcExpMonth() {
		return this.acctCcExpMonth;
	}

	public void setAcctCcExpMonth(String acctCcExpMonth) {
		this.acctCcExpMonth = acctCcExpMonth;
	}

}
