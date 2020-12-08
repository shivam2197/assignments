package com.example.demo.model;

public abstract class  BankAccount {
private String accountHolderName;
private Double currentBalance;
public String getAccountHolderName() {
    return accountHolderName;
}
public void setAccountHolderName(String accountHolderName) {
    this.accountHolderName = accountHolderName;
}
public Double getCurrentBalance() {
    return currentBalance;
}
public void setCurrentBalance(Double currentBalance) {
    this.currentBalance = currentBalance;
}
public abstract double deposit(double amount);

public abstract double withdraw(double amount);
}