package com.lumen;
class MobileBill{
	static String[] plans= {"Silver","Gold","Platinum"};
	static String[] price= {"100","150","200"};
	String customerName;
	String mobileNo;
	String planName;
	String billAmount;
	public MobileBill() {
		this.planName="Silver";
		this.billAmount=price[0];
	}
	public MobileBill(String planType) {
		this.planName=planType;
		for(int i=0;i<plans.length;i++) {
			if(plans[i]==planType) {
				this.billAmount=price[i];
				break;
			}
		}
	}
	
	public static void main(String args[]) {
		MobileBill b1=new MobileBill();
		b1.customerName="MD. Zaid";
		b1.mobileNo="9485671656";
		MobileBill b2=new MobileBill("Platinum");
		b2.customerName="Sangmesh Patil";
		b2.mobileNo="95654854314";
		System.out.println(b1.customerName);
		System.out.println(b1.mobileNo);
		System.out.println(b1.planName);
		System.out.println(b1.billAmount);
		System.out.println(b2.customerName);
		System.out.println(b2.mobileNo);
		System.out.println(b2.planName);
		System.out.println(b2.billAmount);
	}
}