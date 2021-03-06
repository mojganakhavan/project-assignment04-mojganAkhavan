package com.assignment4.superclasses;

/**
 * @author Mojgan
 *Has two attributes
 *String name
 *integer age
 */
public class Human {
	
	private String name = "";
	private int   age   = 0;
	
	
	/**
	 * @param name
	 * @param age
	 */
	public Human(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}
	
	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}
	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}
	/**
	 * @return the age
	 */
	public int getAge() {
		return age;
	}
	/**
	 * @param age the age to set
	 */
	public void setAge(int age) {
		this.age = age;
	}
	

}
