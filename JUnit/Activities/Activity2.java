package junit;

import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.Test;

import junit.BankAccount.NotEnoughFundsException;

public class Activity2 {
	
	@Test
	void notEnoughFunds() {
		// Object of BankAccount
		BankAccount acc = new BankAccount(10);
		// Assertion
		assertThrows(NotEnoughFundsException.class, () -> acc.withdraw(15), "Balance must be greater than amount of withdrawal");
	}
	
	@Test
	void enoughFunds() {
		// Object of BankAccount
		 BankAccount acc = new BankAccount(100);
		 // Assertion
		 assertDoesNotThrow(() -> acc.withdraw(100));
	}
}
