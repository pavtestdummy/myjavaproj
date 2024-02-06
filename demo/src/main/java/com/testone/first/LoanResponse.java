package com.testone.first;

public class LoanResponse {
	
	int loanAmount;
	int years;
	int status;
	public int getLoanAmount() {
		return loanAmount;
	}
	public void setLoanAmount(int loanAmount) {
		this.loanAmount = loanAmount;
	}
	public int getYears() {
		return years;
	}
	public void setYears(int years) {
		this.years = years;
	}
	public int getStatus() {
		return status;
	}
	public void setStatus(int status) {
		this.status = status;
	}
	public LoanResponse(int loanAmount, int years, int status) {
		super();
		this.loanAmount = loanAmount;
		this.years = years;
		this.status = status;
	}
	public LoanResponse() {
		super();
		// TODO Auto-generated constructor stub
	}

}
