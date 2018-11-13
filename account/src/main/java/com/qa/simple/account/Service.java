package com.qa.simple.account;

import java.util.HashMap;

public class Service {
	HashMap<Integer , Person> userList = new HashMap<Integer,Person>(); 
	public static int accountNumber = 0;
	
	public void addAccount(String firstName, String secondName) {
		Person newPerson = new Person(firstName,secondName);
		this.userList.put(accountNumber,newPerson);
		Service.accountNumber ++;
	}
	
	public void getFullName(int accountNumber) {
		for(Integer  accnumber: userList.keySet()) {
			if(accnumber == accountNumber) {
				Person member = userList.get(accnumber);
				System.out.printf("The first name is %s and the second name %s\n", member.getFirstName(),member.getLastName());
			}
		}
	}
}
