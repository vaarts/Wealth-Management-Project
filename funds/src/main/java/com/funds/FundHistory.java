package com.funds;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity(name = "fundHistory")
public class FundHistory {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer fhId;
	private Integer fundId;
	private float fh1Month;
	private float fh1Year;
	private float fhTotal;
	
	public FundHistory() {
		// TODO Auto-generated constructor stub
	}

	public FundHistory(Integer fhId, Integer fundId, float fh1Month, float fh1Year, float fhTotal) {
		super();
		this.fhId = fhId;
		this.fundId = fundId;
		this.fh1Month = fh1Month;
		this.fh1Year = fh1Year;
		this.fhTotal = fhTotal;
	}

	public Integer getFhId() {
		return fhId;
	}

	public void setFhId(Integer fhId) {
		this.fhId = fhId;
	}

	public Integer getFundId() {
		return fundId;
	}

	public void setFundId(Integer fundId) {
		this.fundId = fundId;
	}

	public float getFh1Month() {
		return fh1Month;
	}

	public void setFh1Month(float fh1Month) {
		this.fh1Month = fh1Month;
	}

	public float getFh1Year() {
		return fh1Year;
	}

	public void setFh1Year(float fh1Year) {
		this.fh1Year = fh1Year;
	}

	public float getFhTotal() {
		return fhTotal;
	}

	public void setFhTotal(float fhTotal) {
		this.fhTotal = fhTotal;
	}

	@Override
	public String toString() {
		return "FundHistory [fhId=" + fhId + ", fundId=" + fundId + ", fh1Month=" + fh1Month + ", fh1Year=" + fh1Year
				+ ", fhTotal=" + fhTotal + "]";
	}
	
	
	

}
