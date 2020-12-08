package com.assignment.one;

public class Application {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Loan loan=new Loan(10000);
		int cibilScore=450;
		loan.findRateOfInterest(cibilScore);
		
		HouseLoan houseLoan=new HouseLoan(20000);
		int year=2;
		houseLoan.findRateOfInterest(year);
		System.out.println(loan.toString());
		System.out.println(houseLoan.toString());
	}

}
