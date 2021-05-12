package com.assignM09;

public class Account {
	 int account_no;
	 double balance;
	 float interest_rate;
	Customer customer;
	public Account(int account_no, double balance, float interest_rate, Customer customer) {
		super();
		this.account_no = account_no;
		this.balance = balance;
		this.interest_rate = interest_rate;
		this.customer = customer;
	}
	
	void deposit(int amount) {
		balance += amount;
	}
	
	void withdraw(int amount) {
		if(balance > amount) {
			System.out.println(balance - amount);
		}
		else {
			System.out.println("Insufficiet balance");
		}
	}

	@Override
	public String toString() {
		return "Account [account_no=" + account_no + ", balance=" + balance + ", interest_rate=" + interest_rate
				+ ", customer=" + customer + "]";
	}
	

}

