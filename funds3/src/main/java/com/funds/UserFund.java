package com.funds;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity(name = "userFund")
public class UserFund {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer ufId;
	private Integer userId;
	private Integer fundId;
	private String ufType;
	private float ufAmount;
	private String ufDate;
	
	public UserFund() {
		// TODO Auto-generated constructor stub
	}

	public UserFund(Integer ufId, Integer userId, Integer fundId, String ufType, float ufAmount, String ufDate) {
		super();
		this.ufId = ufId;
		this.userId = userId;
		this.fundId = fundId;
		this.ufType = ufType;
		this.ufAmount = ufAmount;
		this.ufDate = ufDate;
	}

	public Integer getUfId() {
		return ufId;
	}

	public void setUfId(Integer ufId) {
		this.ufId = ufId;
	}

	public Integer getUserId() {
		return userId;
	}

	public void setUserId(Integer userId) {
		this.userId = userId;
	}

	public Integer getFundId() {
		return fundId;
	}

	public void setFundId(Integer fundId) {
		this.fundId = fundId;
	}

	public String getUfType() {
		return ufType;
	}

	public void setUfType(String ufType) {
		this.ufType = ufType;
	}

	public float getUfAmount() {
		return ufAmount;
	}

	public void setUfAmount(float ufAmount) {
		this.ufAmount = ufAmount;
	}

	public String getUfDate() {
		return ufDate;
	}

	public void setUfDate(String ufDate) {
		this.ufDate = ufDate;
	}

	@Override
	public String toString() {
		return "UserFund [ufId=" + ufId + ", userId=" + userId + ", fundId=" + fundId + ", ufType=" + ufType
				+ ", ufAmount=" + ufAmount + ", ufDate=" + ufDate + "]";
	}
	
	
	
	
}
