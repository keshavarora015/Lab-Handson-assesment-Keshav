package com.accountapp;

public class AccountTester {

	public static void main(String[] args) {
		
		Date date_one= new Date(15,05,2000);
		Date date_two= new Date(01,02,1999);
		
		Owner keshav = new Owner("Keshav Arora",date_one,"ABC123");
		Owner raghav = new Owner("Sweta Tripathy ",date_two,"XYZ456");
		
		
		Account account1 = new SavingAccount(keshav,10000,"1234");
		Account account2 = new CurrentAccount(raghav,10000,"5678");
		
		System.out.println(account1.getBalance());
		account1.deposit(5000);
		System.out.println(account1.getBalance());
		
		
		System.out.println(account1.getBalance());
		account1.withdraw(500);
		System.out.println(account1.getBalance());
		account1.withdraw(100);
	}
}
