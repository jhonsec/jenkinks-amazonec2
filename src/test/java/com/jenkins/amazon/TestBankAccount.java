package com.jenkins.amazon;

import junit.framework.Assert;
import org.junit.Before;
import org.junit.Test;

public class TestBankAccount {

	@Test
	public void testDebitWithSufficientFunds() {
		BankAccount acc = new BankAccount(10);
		double amount = acc.debit(5);
		Assert.assertEquals(5.0, amount);
	}
}
