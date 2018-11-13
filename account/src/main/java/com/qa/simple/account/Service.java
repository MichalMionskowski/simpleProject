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
	
	public String getFullName(int accountNumber) {
			Person member = userList.get(accountNumber);
			System.out.println(member.toString());
			return member.toString();
	}
	
	public String printInJSON() throws JsonProcessingException {
		ObjectMapper mapper = new ObjectMapper();
		String output = "";
		for(Person member : userList.values()) {
			System.out.println(mapper.writerWithDefaultPrettyPrinter().writeValueAsString(member));
			output += mapper.writeValueAsString(member);
		}
		return output;
	}
	
	public int countNameOccurances(String name) {
		return
				(int) userList.entrySet()
				.stream()
				.filter(member -> member.getValue().getFirstName().equals(name))
				.count();
	}
}
