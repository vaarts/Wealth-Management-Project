package com.funds;

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
	private String fundAmc;
	private String fundRisk;
	private String fundType;
	private long fundAum;
	private float fundNav;
	private String fundMgr;
	private String fundDesc;
	

	public Funds() {
		// TODO Auto-generated constructor stub
	}
	
	

	public Funds(Integer fundId, String fundName, String fundAmc, String fundRisk, String fundType, long fundAum,
			float fundNav, String fundMgr, String fundDesc) {
		super();
		this.fundId = fundId;
		this.fundName = fundName;
		this.fundAmc = fundAmc;
		this.fundRisk = fundRisk;
		this.fundType = fundType;
		this.fundAum = fundAum;
		this.fundNav = fundNav;
		this.fundMgr = fundMgr;
		this.fundDesc = fundDesc;
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

	
	public String getFundAmc() {
		return fundAmc;
	}



	public void setFundAmc(String fundAmc) {
		this.fundAmc = fundAmc;
	}



	public String getFundRisk() {
		return fundRisk;
	}



	public void setFundRisk(String fundRisk) {
		this.fundRisk = fundRisk;
	}



	public String getFundType() {
		return fundType;
	}



	public void setFundType(String fundType) {
		this.fundType = fundType;
	}



	public long getFundAum() {
		return fundAum;
	}



	public void setFundAum(long fundAum) {
		this.fundAum = fundAum;
	}



	public float getFundNav() {
		return fundNav;
	}



	public void setFundNav(float fundNav) {
		this.fundNav = fundNav;
	}



	public String getFundMgr() {
		return fundMgr;
	}



	public void setFundMgr(String fundMgr) {
		this.fundMgr = fundMgr;
	}



	public String getFundDesc() {
		return fundDesc;
	}



	public void setFundDesc(String fundDesc) {
		this.fundDesc = fundDesc;
	}



	@Override
	public String toString() {
		return "Funds [fundId=" + fundId + ", fundName=" + fundName + ", fundAmc=" + fundAmc + ", fundRisk=" + fundRisk
				+ ", fundType=" + fundType + ", fundAum=" + fundAum + ", fundNav=" + fundNav + ", fundMgr=" + fundMgr
				+ ", fundDesc=" + fundDesc + "]";
	}
	
	


}
