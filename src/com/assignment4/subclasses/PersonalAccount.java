package com.assignment4.subclasses;
import java.util.UUID;
import com.assignment4.superclasses.BankAccount;

/**
 * @author Mojgan
 *It extends BankAccount. 
 *It has an own constructor
 */
public class PersonalAccount extends BankAccount{
	
	public PersonalAccount(){
		super();
		this.setAccountNumber (UUID.randomUUID().toString().substring(0,6));
		this.setBalance(0.0);
		this.setAccountType("personal account");
		}

	

}
