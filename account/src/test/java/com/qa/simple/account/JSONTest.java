package com.qa.simple.account;
import static org.junit.Assert.*;

import org.junit.*;
import org.skyscreamer.jsonassert.JSONAssert;

import com.fasterxml.jackson.core.JsonProcessingException;
public class JSONTest {

	@Test
	public void testJSON() throws JsonProcessingException {
    	Service accounts = new Service();
    	accounts.addAccount("Michal", "Mionskowski");
		String expected = "{\"firstName\":\"Michal\",\"lastName\":\"Mionskowski\"}";
		assertEquals(expected,accounts.printInJSON());
	}
	@Test
	public void testJSON1() throws JsonProcessingException {
    	Service accounts = new Service();
    	accounts.addAccount("bob", "skas");
		String expected = "{\"firstName\":\"bob\",\"lastName\":\"skas\"}";
		assertEquals(expected,accounts.printInJSON());
	}
	@Test
	public void testJSON2() throws JsonProcessingException {
    	Service accounts = new Service();
    	accounts.addAccount("ope", "Mionskowski");
		String expected = "firstName=ope, lastName=Mionskowski";
		assertEquals(expected,accounts.getFullName(0));
	}
}
