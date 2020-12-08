package com.assignment.one;

public class Loan {
	private double loanAmount;
	private double rateOfInterest;
	
	public Loan(double loanAmount) {
		// TODO Auto-generated constructor stub
		this.loanAmount=loanAmount;
	}
	public void findRateOfInterest(int cibilScore) {
		if(cibilScore>500) {
			this.rateOfInterest=7.5;
		}
		else {
			this.rateOfInterest=8.5;
		}
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Loan Amount:="+this.loanAmount+"\nRateOfInterest:="+this.rateOfInterest;
	}
	public double getLoanAmount() {
		return loanAmount;
	}
	public void setLoanAmount(double loanAmt) {
		this.loanAmount = loanAmt;
	}
	public double getRateOfInterest() {
		return rateOfInterest;
	}
	public void setRateOfInterest(int rateOfInterest) {
		this.rateOfInterest = rateOfInterest;
	}
	
	
}
