package com.codingdojo.bankaccount;

public class BankAccountTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BankAccount account = new BankAccount();
		System.out.print("Account number: ");
		System.out.println(account.getAccountNumber());
		account.depositChecking(20.02);
		account.depositSavings(130.89);
		account.myMoney();
	}

}
