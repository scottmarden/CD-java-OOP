package com.codingdojo.bankaccount;
import java.util.*;

public class BankAccount {
	private String acctNum;
	private long checkingBal = 0;
	private long savingsBal= 0;
	public static int numberOfAccts = 0;
	public static long totalAmtStored = 0;
	
	public BankAccount() {
		acctNum = assignAcctNum();
		numberOfAccts++;
	}
	
	private String assignAcctNum() {
		Random rand = new Random();
		String candidateChars = "ABCDEFGHIJKLMNOPQRSTUVWZYZ1234567890";
		StringBuilder randString = new StringBuilder();
		while(randString.length() < 10) {
			randString.append(candidateChars.charAt(rand.nextInt(candidateChars.length())));
		}
		return randString.toString();
	}

	public long getCheckingBal() {
		return checkingBal;
	}

	private void setCheckingBal(long checkingsBal) {
		this.checkingBal = checkingsBal;
	}

	public long getSavingsBal() {
		return savingsBal;
	}

	private void setSavingsBal(long savingsBal) {
		this.savingsBal = savingsBal;
	}
	
	public void deposit(String acct, long depositAmt) {
		if(acct.toLowerCase() == "checking") {
			this.setCheckingBal(this.getCheckingBal() + depositAmt); 
			System.out.println("Thank you for your deposit! The current balance in " + acct + " is: $" + this.getCheckingBal());
		}
		if(acct.toLowerCase() == "savings") {
			this.setSavingsBal(this.getSavingsBal() + depositAmt);
			System.out.println("Thank you for your deposit! The current balance in " + acct + " is: $" + this.getSavingsBal());
		}
	}
	
	public void withdraw(String acct, long withdrawAmt) {
		if(acct.toLowerCase() == "checking") {
			long availBal = this.getCheckingBal();
			if(withdrawAmt <= availBal) {
				this.setCheckingBal(availBal - withdrawAmt);
				System.out.println("Withdrawal complete. Current balance in " + acct + " is: $" + this.getCheckingBal());
			}
			else {
				System.out.println("Insufficient funds. Unable to complete transaction");
			}
			
		}
		if(acct.toLowerCase() == "savoings") {
			long availBal = this.getSavingsBal();
			if(withdrawAmt <= availBal) {
				this.setSavingsBal(availBal - withdrawAmt);
				System.out.println("Withdrawal complete. Current balance in" + acct + " is: $"  + this.getSavingsBal());
			}
			else {
				System.out.println("Insufficient funds. Unable to complete transaction");
			}
		}
	}
	
	public void checkBalances() {
		System.out.println("Account balances for Account Number: " + this.acctNum);
		System.out.println("The current balance in checking is: $" + this.getCheckingBal());
		System.out.println("The current balance in savings is: $" + this.getSavingsBal());
	}
	
	
}
