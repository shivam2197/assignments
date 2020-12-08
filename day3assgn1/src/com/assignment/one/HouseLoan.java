package com.assignment.one;

public class HouseLoan extends Loan {

	private double interestAmount;
	public HouseLoan(double loanAmount) {
		// TODO Auto-generated constructor stub
		super(loanAmount);
	}

	@Override
	public void findRateOfInterest(int noOfYears) {
		// TODO Auto-generated method stub
		double principle=this.getLoanAmount();
		double rate=5.0;
		double interestAmt=(principle*rate*noOfYears)/100;
		this.setInterestAmount(interestAmt);
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Loan Amount:="+this.getLoanAmount()+"\nInterestAmount:="+this.interestAmount;
	}
	public double getInterestAmount() {
		return interestAmount;
	}
	public void setInterestAmount(double interestAmt) {
		this.interestAmount = interestAmt;
	}
}
