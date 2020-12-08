package com.example.demo.model;

 

public class SavingsAccount extends BankAccount {
    
    private int accountNumber;
    private String nominee;
    

 

    public void setNominee(String nominee) {
        this.nominee = nominee;
    }
    
    

 

    public SavingsAccount(int accountNumber,String accountHolderName,double currentBalance,String nominee) {
        // TODO Auto-generated constructor stub
        super.setAccountHolderName(accountHolderName);
        super.setCurrentBalance(currentBalance);
        this.accountNumber = accountNumber;
        this.nominee = nominee;
    }

 

    
    public String getNominee() {
        return nominee;
    }

 

    public int getAccountNumber() {
        return accountNumber;
    }

 

    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }
    
    @Override
    public double deposit(double amount) {
        if(amount+this.getCurrentBalance()<10000) {
        this.setCurrentBalance(amount+this.getCurrentBalance());
        }// TODO Auto-generated method stub
        else{
            System.out.println("maximun balance cna't be greater than 100000");
        }
        return this.getCurrentBalance();
    }

 

    @Override
    public double withdraw(double amount) {
        // TODO Auto-generated method stub
        if(this.getCurrentBalance()-amount>=5000) {
        this.setCurrentBalance(this.getCurrentBalance()-amount);
        }else{
            System.out.println("can't withdraw");
        }
        return this.getCurrentBalance();
    }

 

}