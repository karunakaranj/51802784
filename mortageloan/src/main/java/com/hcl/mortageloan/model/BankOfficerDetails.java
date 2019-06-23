package com.hcl.mortageloan.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class BankOfficerDetails {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int officerId;
	private String officerName;
	private String officerLevel="Officer";
	public int getOfficerId() {
		return officerId;
	}
	public void setOfficerId(int officerId) {
		this.officerId = officerId;
	}
	public String getOfficerName() {
		return officerName;
	}
	public void setOfficerName(String officerName) {
		this.officerName = officerName;
	}
	public String getOfficerLevel() {
		return officerLevel;
	}
	public void setOfficerLevel(String officerLevel) {
		this.officerLevel = officerLevel;
	}
	
}
