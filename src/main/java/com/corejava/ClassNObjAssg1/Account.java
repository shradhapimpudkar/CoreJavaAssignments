package com.corejava.ClassNObjAssg1;

//3. Write a class Account & add methods like deposit, withdraw, print etc.
public class Account {
	private int id;
	private double balance; //balance for account

	// no arg constructor for default account 
	Account() {
	    id = 0;
	    balance = 0.0;
	}
	//constructor with specfic id and initial balance
	Account (int newId, double newBalance) {
	id = newId;
	balance = newBalance;
	}
	
	//accessor and mutator methods
	public int getId() {
	    return id;
	}
	
	public double getBalance() {
	    return balance;
	}
	
	public void setId (int newId) { 
	    id = newId;
	}
	public void setBalance (double newBalance) {
	    balance = newBalance;
	}
	
	//Define method withdraw
	double withdraw (double amount) {  
	    return balance -= amount;
	}
	//Define method deposit 
	double deposit(double amount) {
	    return balance += amount;
	}

	    public static void main(String[] args) {
	        Account account1 = new Account (1122, 20000); 
	        //account1.withdraw(2500);
	        //account1.deposit(3000);
	        System.out.println("----------------------------------------");
	        System.out.println("Welcome to Zensar online account!");
	        System.out.println("Please find your account details below");
	        System.out.println("----------------------------------------");

	        System.out.println("Account ID:" + " " + account1.id);
	        System.out.println("Initial Balance:" + account1.getBalance());

	        System.out.println("Balance after Withdraw:" + " " + account1.withdraw(20000));
	        System.out.println("Balance after deposit" + " " + account1.deposit(3000));
	   
	        System.out.println("------------------------");
	        System.out.println("The Process is complete");
	        System.out.println("------------------------");
	    }

	}