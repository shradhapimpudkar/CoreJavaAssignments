package com.corejava.InhertAndPolyAssg2of2;
public   class Account {

	protected double accountNumber;
	protected String accountType;
	protected double cash;
    
	public Account() {
		
	}
   
	public Account(double accountNumber, String accountType, double cash) {
		super();
		this.accountNumber = accountNumber;
		this.accountType = accountType;
		this.cash = cash;
	}

	public double getAccountNumber() {
		return accountNumber;
	}

	public void setAccountNumber(double accountNumber) {
		this.accountNumber = accountNumber;
	}

	public String getAccountType() {
		return accountType;
	}

	public void setAccountType(String accountType) {
		this.accountType = accountType;
	}

	public double getCash() {
		return cash;
	}

	public void setCash(double cash) {
		this.cash = cash;
	}

	@Override
	public String toString() {
		return "Account [accountNumber=" + accountNumber + ", accountType=" + accountType + ", cash=" + cash + "]";
	}

	public static void main(String args[]) {
		
		SavingsAccount sb = new SavingsAccount(101,"saving", 50,5000.00);
		sb.availableCash(sb);
		CurrentAccount ca = new CurrentAccount(102,"current", 75,10000.00);
		ca.availableCash(ca);
		Account ac = new Account();
		ac.cash = sb.cash + ca.cash;
		System.out.println("\t Total Cash in Bank\t"+ac.cash );
	}

}

