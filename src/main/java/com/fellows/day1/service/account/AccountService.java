package com.fellows.day1.service.account;

import java.util.Map;

import com.fellows.day1.model.BankAccount;

public interface AccountService {
	public void setAccounts(Map<String, BankAccount> accounts);
	public void deposit(String accountId, double amount);
	public Map<String, BankAccount> getAccounts();
}
