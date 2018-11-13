package com.qa.simple.account;

public class Person {
	private String firstName;
	private String lastName;
	
	public Person(String first, String last ) {
		this.firstName = first;
		this.lastName = last;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	@Override
	public String toString() {
		return "firstName=" + firstName + ", lastName=" + lastName + "";
	}	
	
}
