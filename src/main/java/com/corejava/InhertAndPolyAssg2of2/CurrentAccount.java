package com.corejava.InhertAndPolyAssg2of2;
public class CurrentAccount extends Account implements CashCalcutate {

	protected double cashCredit;

	public CurrentAccount(double accountNumber, String accountType, double cash, double cashCredit) {
		super(accountNumber, accountType, cash);
		this.cash = cash + cashCredit;
		this.cashCredit = cashCredit;

	}
	
  

	@Override
	public void availableCash(Account account) {

		System.out.println("\t account Number "+account.accountNumber+"\t account Type "+account.accountType +"\t account cash current account \t" + account.cash+"\t Cash Credit "+this.cashCredit );
	}
}

