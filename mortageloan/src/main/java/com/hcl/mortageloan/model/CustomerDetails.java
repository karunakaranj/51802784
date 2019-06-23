package com.hcl.mortageloan.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class CustomerDetails {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int id;
	private String custName;
	private int custAge;	
	private String custGender;
	private String custMaritalStatus;
	private Long custCreditScore;
	
public String getCustName() {
	return custName;
}
public void setCustName(String custName) {
	this.custName = custName;
}
public int getCustAge() {
	return custAge;
}
public void setCustAge(int custAge) {
	this.custAge = custAge;
}
public String getCustGender() {
	return custGender;
}
public void setCustGender(String custGender) {
	this.custGender = custGender;
}
public String getCustMaritalStatus() {
	return custMaritalStatus;
}
public void setCustMaritalStatus(String custMaritalStatus) {
	this.custMaritalStatus = custMaritalStatus;
}
public Long getCustCreditScore() {
	return custCreditScore;
}
public void setCustCreditScore(Long custCreditScore) {
	this.custCreditScore = custCreditScore;
}
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}

}
