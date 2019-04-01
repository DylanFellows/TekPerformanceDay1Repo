package com.fellows.day1.service.impl;

import java.util.HashMap;
import java.util.Map;

import com.fellows.day1.model.BankAccount;
import com.fellows.day1.service.account.AccountService;

public class AccountServiceImpl implements AccountService {

	private Map<String, BankAccount> accounts = new HashMap<>();
	

	public Map<String, BankAccount> getAccounts() {
		return accounts;
	}


	public void setAccounts(Map<String, BankAccount> accounts) {
		this.accounts = accounts;
	}


	@Override
	public void deposit(String accountId, double amount) {
		double currentBalance = accounts.get(accountId).getBalance();
		accounts.get(accountId).setBalance(currentBalance + amount);
	}


	
	
	

}
