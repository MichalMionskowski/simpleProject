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
		public void testNameOccurances1() {
			Service accounts = new Service();
			accounts.addAccount("Michal", "Mionskowski");
			accounts.addAccount("Michal", "Mionskowski1");
			accounts.addAccount("Michal", "Mionskowski2");
			assertEquals(3,accounts.countNameOccurances("Michal"));
		}
		
		@Test
		public void testNameOccurances2() {
			Service accounts = new Service();
			accounts.addAccount("Michal", "Mionskowski");
			accounts.addAccount("Michal", "Mionskowski1");
			accounts.addAccount("Michal", "Mionskowski2");
			assertEquals(0,accounts.countNameOccurances("John"));
		}
		@Test
		public void testNameOccurances3() {
			Service accounts = new Service();
			accounts.addAccount("Michal", "Mionskowski");
			accounts.addAccount("Michal", "Mionskowski1");
			accounts.addAccount("Michal", "Mionskowski2");
			accounts.addAccount("John", "Mionskowski2");
			assertEquals(1,accounts.countNameOccurances("John"));
		}
		@Test
		public void testJSON() throws Exception  {
	    	Service accounts = new Service();
	    	accounts.addAccount("Michal", "Mionskowski");
			String expected = "{\"firstName\":\"Michal\",\"lastName\":\"Mionskowski\"}";
			assertEquals(expected,accounts.printInJSON());
		}
		@Test
		public void testJSON1() throws Exception   {
	    	Service accounts = new Service();
	    	accounts.addAccount("bob", "skas");
			String expected = "{\"firstName\":\"bob\",\"lastName\":\"skas\"}";
			assertEquals(expected,accounts.printInJSON());
		}
		@Test
		public void testJSON2()   {
	    	Service accounts = new Service();
	    	accounts.addAccount("ope", "Mionskowski");
			String expected = "firstName=ope, lastName=Mionskowski";
			assertEquals(expected,accounts.getFullName(0));
		}

}
