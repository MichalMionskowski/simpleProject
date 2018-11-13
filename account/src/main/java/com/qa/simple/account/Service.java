package com.qa.simple.account;

import java.util.HashMap;



import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class Service {
	HashMap<Integer , Person> userList = new HashMap<Integer,Person>(); 
	private int AccountNumber = 0;
	
	public void addAccount(String firstName, String secondName) {
		this.userList.put(AccountNumber,new Person(firstName,secondName));
		System.out.println(this.AccountNumber);
		this.AccountNumber ++;
	}
	
	public String getFullName(int accountNumber) {
			Person member = userList.get(accountNumber);
			System.out.println(member.toString());
			
			return member.toString();
	}
	
	public  String printInJSON() throws JsonProcessingException {
		String returnString = new String();
		ObjectMapper mapper = new ObjectMapper();
		for(Person member : userList.values()) {
			returnString = mapper.writeValueAsString(member) ;
			System.out.println(mapper.writeValueAsString(member));
		}
		return returnString;
	}
}
