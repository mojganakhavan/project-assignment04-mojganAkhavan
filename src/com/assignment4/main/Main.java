package com.assignment4.main;

import com.assignment4.subclasses.BankCustomer;
import com.assignment4.subclasses.PersonalAccount;
import com.assignment4.subclasses.SavingAccount;
import com.assignment4.superclasses.BankAccount;

/**
 * @author Mojgan
 *Main class
 */
public class Main {

	public static void main(String[] args) {
		BankAccount bk= new BankAccount();
		String account = "";

		
		BankCustomer bc = new BankCustomer("rafael",30);
		bc.addAccount(new  BankAccount());
		bc.addAccount(new  PersonalAccount()); 
		bc.addAccount(new  SavingAccount());
		System.out.println(bc.toString());

		account = bc.getCustomerAccounts().get(0).getAccountNumber();
		System.out.println("Deposeting 30.0 to the first account“");
		bc.depositToAccount(account,30.0);
		System.out.println(bc.toString());

		System.out.println(" withdraw 200.0 to the first acccount");
		account = bc.getCustomerAccounts().get(1).getAccountNumber();
		bc.withdrawMoneyFromAccount(account,200.0);
		System.out.println(bc.toString());


		System.out.println("Deposeting 200.0 to the first account");
		account = bc.getCustomerAccounts().get(2).getAccountNumber();
		bc.depositToAccount(account,200.0);
		System.out.println(bc.toString());

		
		
	}

}
