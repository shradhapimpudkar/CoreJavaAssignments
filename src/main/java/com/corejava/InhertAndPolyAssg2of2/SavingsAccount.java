package com.corejava.InhertAndPolyAssg2of2;
import com.corejava.InhertAndPolyAssg2of2.Account;
import com.corejava.InhertAndPolyAssg2of2.CashCalcutate;

public class SavingsAccount extends Account implements CashCalcutate{

	protected double fixedDeposits;
	
	public SavingsAccount() {
		
	}
	
	public SavingsAccount(double accountNumber, String accountType, double cash, double fixedDeposits) {
		super(accountNumber, accountType, cash);
		this.cash = cash + fixedDeposits;
		this.fixedDeposits = fixedDeposits;
	}

	@Override
	public void availableCash(Account account) {
		System.out.println("\t account Number "+account.accountNumber+"\t account Type "+account.accountType +"\t account cash Saving account \t"+account.cash+"\t Fixed Deposit "+this.fixedDeposits);
	}
	}
