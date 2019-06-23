package com.hcl.mortageloan.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class LoanDetails {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int loanId;
	private Long loanAccountNumber;
	private String securityaddress;
	private Long securityAmount;
	public Long getSecurityAmount() {
		return securityAmount;
	}
	public void setSecurityAmount(Long securityAmount) {
		this.securityAmount = securityAmount;
	}
	private boolean loanStatus;
	private long loanAmount;
	private int approveManagerId;
	
	public int getLoanId() {
		return loanId;
	}
	public void setLoanId(int loanId) {
		this.loanId = loanId;
	}
	public Long getLoanAccountNumber() {
		return loanAccountNumber;
	}
	public void setLoanAccountNumber(Long loanAccountNumber) {
		this.loanAccountNumber = loanAccountNumber;
	}
	public String getSecurityaddress() {
		return securityaddress;
	}
	public void setSecurityaddress(String securityaddress) {
		this.securityaddress = securityaddress;
	}
	public boolean isLoanStatus() {
		return loanStatus;
	}
	public void setLoanStatus(boolean loanStatus) {
		this.loanStatus = loanStatus;
	}
	public long getLoanAmount() {
		return loanAmount;
	}
	public void setLoanAmount(long loanAmount) {
		this.loanAmount = loanAmount;
	}
	public int getApproveManagerId() {
		return approveManagerId;
	}
	public void setApproveManagerId(int approveManagerId) {
		this.approveManagerId = approveManagerId;
	}
	
}
