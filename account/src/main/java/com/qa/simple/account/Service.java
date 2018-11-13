package com.qa.simple.account;

import java.util.HashMap;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class Service {
	HashMap<Integer , Person> userList = new HashMap<Integer,Person>(); 
	public  int AccountNumber = 0;
	
	public void addAccount(String firstName, String secondName) {
		this.userList.put(this.AccountNumber,new Person(firstName,secondName));
		this.AccountNumber ++;
	}
	
	public void getFullName(int accountNumber) {
			Person member = userList.get(accountNumber);
			System.out.println(member.toString());
	}
	
	public void printInJSON() throws JsonProcessingException {
		ObjectMapper mapper = new ObjectMapper();
		for(Person member : userList.values()) {
			System.out.println(mapper.writerWithDefaultPrettyPrinter().writeValueAsString(member));
		}
	}
}
