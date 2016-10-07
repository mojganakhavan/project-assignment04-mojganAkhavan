package com.assignment4.subclasses;
import java.util.UUID;

import com.assignment4.superclasses.BankAccount;

/**
 * @author Mojgan
 * It extends BankAccount
 * No attributes
 *
 */
public class SavingAccount extends BankAccount {
	
	public SavingAccount(){
	this.setAccountNumber (UUID.randomUUID().toString().substring(0,6));
	this.setBalance(0.0);
	this.setAccountType("Saving account");
	}

}
