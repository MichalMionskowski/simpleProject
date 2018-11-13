package com.qa.simple.account;

import com.fasterxml.jackson.core.JsonProcessingException;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) throws JsonProcessingException
    {
    	Service accounts = new Service();
    	accounts.addAccount("Michal", "Mionskowski");
    	accounts.addAccount("Vince", "one");
    	accounts.addAccount("John", "two" );
    	accounts.printInJSON();
    }
}
