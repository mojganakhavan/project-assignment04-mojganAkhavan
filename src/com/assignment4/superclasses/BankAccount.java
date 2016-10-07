package com.assignment4.superclasses;
import java.util.UUID;

/**
 * @author Mojgan
 *Implements the interface BankOperations and has three attributes
 *String accountNumber
 *String accountType 
 *double balance
 */
public class BankAccount {
	private String accountNumber = "";
	private double balance =0;
	private String accountType="";
 
	public BankAccount(){
		this.accountNumber = UUID.randomUUID().toString().substring(0,6);
		this.balance=0;
		this.accountType ="Bank account";
	}
	

	public String getAccountNumber() {
		return accountNumber;
	}

	public void setAccountNumber(String accountNumber) {
		this.accountNumber = accountNumber;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	public String getAccountType() {
		return accountType;
	}

	public void setAccountType(String accountType) {
		this.accountType = accountType;
		
	}
 
	public void withdrawMoney(double amount){
		if (amount >= 0){
			
			setBalance(getBalance()-amount);//also correct this.balance=this.balance-amount

		}
		else
			System.out.println("You cant withdraw a negative value");
		
	}
	public void depositMoney(double amount){
		if (amount<0)
			System.out.println("You cant deposite a negative value");
		else
			setBalance(getBalance()+amount);
		
	}

	@Override
	public String toString() {
		return "\n BankAccount [accountNumber=" + accountNumber + ", balance=" + balance + ","
				+ "  accountType=" + accountType+"]";
	} 

	
	
 
}
