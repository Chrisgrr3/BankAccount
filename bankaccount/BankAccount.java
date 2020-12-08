package com.codingdojo.bankaccount;

import java.util.Random;

public class BankAccount {

	private String accountNumber;
	private double checkingBalance;
	private double savingsBalance;
	public static int numberOfAccounts = 0;
	public static double allMoney = 0;
	
	public BankAccount() {
		// TODO Auto-generated constructor stub
		this.accountNumber = this.randomAcct();
		numberOfAccounts += 1;
	}
	
	private String randomAcct() {
		Random r = new Random();
		String acct = new String();
		for(int num = 1; num <= 10; num++) {
			acct += Integer.toString(r.nextInt(9));
		}
		return acct;
	}
	
	public void depositChecking(double amount) {
		this.checkingBalance += amount;
		allMoney += amount;
		System.out.println("Deposited $" + Double.toString(amount) + " to your checking account");
	}
	
	public void depositSavings(double amount) {
		this.savingsBalance += amount;
		allMoney += amount;
		System.out.println("Deposited $" + Double.toString(amount) + " to your savings account");
	}
	
	public void withdrawChecking(double amount) {
		if(this.checkingBalance >= amount) {
			this.checkingBalance -= amount;
		}
		else {
			System.out.println("Insufficient funds. Please try again.");
		}
	}
	
	public void withdrawSavings(double amount) {
		if(this.savingsBalance >= amount) {
			this.savingsBalance -= amount;
		}
		else {
			System.out.println("Insufficient funds. Please try again.");
		}
	}
	
	public void myMoney() {
		System.out.println("Savings: $" + Double.toString(this.savingsBalance) + 
				" Checking: $" + Double.toString(this.checkingBalance) + " Total: $" + 
				Double.toString(this.checkingBalance + this.savingsBalance));
	}

	public String getAccountNumber() {
		return accountNumber;
	}

	public double getCheckingBalance() {
		return checkingBalance;
	}


	public double getSavingsBalance() {
		return savingsBalance;
	}

	
	
	
	

}
