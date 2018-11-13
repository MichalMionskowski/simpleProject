package com.qa.simple.account;

import java.util.HashMap;

public class Service {
	HashMap<Integer , Person> userList = new HashMap<Integer,Person>(); 
	public static int AccountNumber = 0;
	
	public void addAccount(String firstName, String secondName) {
		this.userList.put(AccountNumber,new Person(firstName,secondName));
		Service.AccountNumber ++;
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
