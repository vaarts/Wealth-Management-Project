package com.postbook;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity(name = "funds")
public class Funds {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer fundId;
	private String fundName;

	public Funds() {
		// TODO Auto-generated constructor stub
	}
	
	public Funds(Integer fundId, String fundName) {
		super();
		this.fundId = fundId;
		this.fundName = fundName;
	}

	public Integer getFundId() {
		return fundId;
	}

	public void setFundId(Integer fundId) {
		this.fundId = fundId;
	}

	public String getFundName() {
		return fundName;
	}

	public void setFundName(String fundName) {
		this.fundName = fundName;
	}

	@Override
	public String toString() {
		return "Funds [fundId=" + fundId + ", fundName=" + fundName + "]";
	}


}
