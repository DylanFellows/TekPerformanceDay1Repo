package com.fellows.day1.app;

import java.util.HashMap;
import java.util.Map;

import com.fellows.day1.model.BankAccount;
import com.fellows.day1.service.account.AccountService;
import com.fellows.day1.service.impl.AccountServiceImpl;

public class AccountApp {
	public static void main(String[] args) {
		AccountService accountService = new AccountServiceImpl();
		
		accountService.setAccounts(createAccounts());
		
		accountService.deposit("13583020122", 10);
		
		for (Map.Entry<String, BankAccount> account : accountService.getAccounts().entrySet()) {
			BankAccount bankAccount = account.getValue();
			System.out.println(
					account.getKey() + " " + bankAccount.getAccountHolderName() + " " 
							+ bankAccount.getBalance());
		}
	}

	private static Map<String, BankAccount> createAccounts() {
		Map<String, BankAccount> accounts = new HashMap<>();

		BankAccount account1 = new BankAccount("13583020120", "Primary Checking", 2000);
		BankAccount account2 = new BankAccount("13583020121", "Primary Savings", 10000);
		BankAccount account3 = new BankAccount("13583020122", "Vacation Fund", 1000);
		BankAccount account4 = new BankAccount("13583020123", "College Fund", 4000);
		BankAccount account5 = new BankAccount("13583020124", "Misc Fund", 800);

		accounts.put(account1.getId(), account1);
		accounts.put(account2.getId(), account2);
		accounts.put(account3.getId(), account3);
		accounts.put(account4.getId(), account4);
		accounts.put(account5.getId(), account5);

		return accounts;

	}
}
