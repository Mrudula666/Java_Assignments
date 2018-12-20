package corejava.day3assignmentstests;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import corejava.day3assignments.BankAccount;
import corejava.day3assignments.PaymentGateway;
import corejava.inheritance.assignments.exceptions.InvalidAmountException;

public class SavingAccountTests {
	private BankAccount savingAccountForCustomer1;
	private BankAccount savingAccountForCustomer2;
	
	
	@Before
	public void setUp(){
		savingAccountForCustomer1 =  new BankAccount("Mrudula",1000);
		savingAccountForCustomer2 =  new BankAccount("Vineela",7000);
	}

	@Test
	public void testForCustomerDetails() {
		String customerDetails = savingAccountForCustomer1.toString();
		assertEquals("BankAccount [accountNumber=110245603, accountHolderName=Mrudula, initialBalance=1000.0]", customerDetails);
		}
	@Test
	public void testForGetNextAccountNumber() {
		long nextAccountNumber = BankAccount.getNextAccountNumber();
		assertEquals(110245608, nextAccountNumber);
	}
	
	@Test
	public void testForDeposit(){
		double currentBalance;
		try {
			currentBalance = savingAccountForCustomer1.depositAmount(5000);
			assertEquals(6000, currentBalance,0.0);
		} catch (InvalidAmountException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	@Test
	public void testForWithDraw() {
		double withdrawnAmount;
		try {
			withdrawnAmount = savingAccountForCustomer1.withDraw(50);
			assertEquals(950, withdrawnAmount,0.0);
		} catch (InvalidAmountException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	@Test
	public void testForTranferFunds() {
		boolean flag;
		try {
			flag = PaymentGateway.transfer(savingAccountForCustomer1,savingAccountForCustomer2,500);
			assertTrue(flag);
		} catch (InvalidAmountException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	@Test
	public void testForTranferFundsForInsuffientFunds() {
		boolean flag;
		try {
			flag = PaymentGateway.transfer(savingAccountForCustomer1,savingAccountForCustomer2,5000);
			assertFalse(flag);
		} catch (InvalidAmountException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	

}
