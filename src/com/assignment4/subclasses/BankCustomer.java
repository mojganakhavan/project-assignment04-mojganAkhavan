package com.assignment4.subclasses;

import java.util.ArrayList;
import com.assignment4.superclasses.BankAccount;
import com.assignment4.superclasses.Human;


/**
 * @author Mojgan
 *subclass to Human
 *It has one attribute customerAccounts that is an ArrayList of BankAccount.
 */
public class BankCustomer extends Human {
	
	ArrayList <BankAccount>  customerAccount= new ArrayList<BankAccount>(); 
	

	/**
	 * @param name
	 * @param age
	 */
	public BankCustomer(String name, int age) {
		super(name, age);
	}
	
	public void addAccount(BankAccount bankAccount){
		this.customerAccount.add(bankAccount);
	
	}
	public void withdrawMoneyFromAccount(String accountNumber, double amount){
		
	
			for (int i=0; i< customerAccount.size(); i++){
				if (customerAccount.get(i).getAccountNumber().equals(accountNumber))
					customerAccount.get(i).withdrawMoney(amount); 
				
			}
		
	}
	public void depositToAccount(String accountNumber, double amount){
		
		
		if (amount<0) 
			System.out.println("You cant deposite a negative value");
		else
		
			for (int i=0; i< customerAccount.size(); i++){
				
				if (customerAccount.get(i).getAccountNumber()==(accountNumber)){
						customerAccount.get(i).depositMoney(amount);
						
						}
				
			}
		
	}
	/*How I have had thought*/

	/*public BankCustomer(String name,int age) {
		
		super(name,age);
		customerAccount = null;
	}
	
	public void setCustomerAccount(BankAccount cA){
		this.customerAccount.add(cA);
	}
	public BankAccount getCustomerAccount(){
		return this.customerAccount.contains(getName());
	}*/

	/**
	 * @param customerAccount the customerAccount to set
	 */
	public void setCustomerAccounts(ArrayList<BankAccount> customerAccount) {
		this.customerAccount = customerAccount;
	}


	/**
	 * @return the customerAccount
	 */
	public ArrayList<BankAccount> getCustomerAccounts() {
		return customerAccount;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		 String ms="";
		 String ms2="";
		
		ms =" Customer: "+super.getName()+" Age: "+super.getAge() + customerAccount+"\n" ;
		
		int n=ms.length();
		for (int i=0; i< n;i++)
			if (ms.charAt(i)=='['){
				ms = ms.substring(0,i)+ms.substring(i+1);
				n=0;
			}
		int m=ms.length();
		for (int i=(m-1); i> 0;i--)
			if (ms.charAt(i)==']'){
				ms = ms.substring(0,i)+ms.substring(i+1);
				
				i=-1;
			}
		return  ms;
	} 

	
	
	
}
