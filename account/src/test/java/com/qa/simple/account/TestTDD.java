package com.qa.simple.account;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestTDD {
	
		@Test
		public void testNameOccurances() {
			Service accounts = new Service();
			accounts.addAccount("Michal", "Mionskowski");
			assertEquals(1,accounts.countNameOccurances("Michal"));
		}
		
		@Test
		public void testNameOccurances() {
			Service accounts = new Service();
			accounts.addAccount("Michal", "Mionskowski");
			accounts.addAccount("Michal", "Mionskowski1");
			accounts.addAccount("Michal", "Mionskowski2");
			assertEquals(3,accounts.countNameOccurances("Michal"));
		}
		
		@Test
		public void testNameOccurances() {
			Service accounts = new Service();
			accounts.addAccount("Michal", "Mionskowski");
			accounts.addAccount("Michal", "Mionskowski1");
			accounts.addAccount("Michal", "Mionskowski2");
			assertEquals(0,accounts.countNameOccurances("John"));
		}
		@Test
		public void testNameOccurances() {
			Service accounts = new Service();
			accounts.addAccount("Michal", "Mionskowski");
			accounts.addAccount("Michal", "Mionskowski1");
			accounts.addAccount("Michal", "Mionskowski2");
			accounts.addAccount("John", "Mionskowski2");
			assertEquals(1,accounts.countNameOccurances("John"));
		}
	

}
