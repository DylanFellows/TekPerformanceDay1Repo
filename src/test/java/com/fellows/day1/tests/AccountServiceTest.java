package com.fellows.day1.tests;

import static org.junit.Assert.assertTrue;

import java.util.HashMap;
import java.util.Map;

import org.junit.jupiter.api.Test;

import com.fellows.day1.model.BankAccount;
import com.fellows.day1.service.account.AccountService;
import com.fellows.day1.service.impl.AccountServiceImpl;

public class AccountServiceTest {

	@Test
	public void addAccounts() {
		AccountService accountService = new AccountServiceImpl();

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

		accountService.setAccounts(accounts);

		assertTrue(accountService.getAccounts().size() == 5);

	}

	@Test
	public void validDeposit() {
		AccountService accountService = new AccountServiceImpl();

		Map<String, BankAccount> accounts = new HashMap<>();

		BankAccount account1 = new BankAccount("13583020120", "Primary Checking", 2000);
		BankAccount account2 = new BankAccount("13583020121", "Primary Savings", 10000);
		
		accounts.put(account1.getId(), account1);
		accounts.put(account2.getId(), account2);
		
		accountService.setAccounts(accounts);
		accountService.deposit(account2.getId(), 500);
		
		assertTrue(accountService.getAccounts().get("13583020121").getBalance()==10500);
	}

}
