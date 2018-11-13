package com.qa.simple.account;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	Service accounts = new Service();
    	accounts.addAccount("Michal", "Mionskowski");
    	accounts.addAccount("Vince", "one");
    	accounts.addAccount("John", "two" );
    	accounts.getFullName(1);
    }
}
