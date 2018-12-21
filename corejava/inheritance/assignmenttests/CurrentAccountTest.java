package corejava.inheritance.assignmenttests;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import corejava.inheritance.assignments.BankFactory;
import corejava.inheritance.assignments.CurrentAccount;
import corejava.inheritance.assignments.MMBankFacotry;
import corejava.inheritance.assignments.exceptions.InsuffientFundsException;
import corejava.inheritance.assignments.exceptions.InvalidAmountException;

public class CurrentAccountTest {
	private BankFactory bankAccount;
	private CurrentAccount currentAccountCustomer;
	
	
	@Before
	public void setUp(){
			bankAccount = new MMBankFacotry();
			currentAccountCustomer = bankAccount.getNewCurrentAccount( "Vineela", 7000.0, 150);
		
	}

	@Test
	public void testForWithDraw() {
		try {
			currentAccountCustomer.withDraw(100);
			assertEquals(6900.0, currentAccountCustomer.getAccountBalance(),0.0);
		} catch (InsuffientFundsException | InvalidAmountException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
			
	}
	
	@Test
	public void testForInvalidWithDraw() {
		try {
			currentAccountCustomer.withDraw(-100);
		} catch (InsuffientFundsException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (InvalidAmountException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
			
	}
	
	@Test
	public void testForInsuffientFunds() {
		try {
			currentAccountCustomer.withDraw(10100);
		} catch (InsuffientFundsException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (InvalidAmountException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
			
	}
	@Test
	public void testForDeposit() {
			currentAccountCustomer.deposit(100);
			assertEquals(7100.0, currentAccountCustomer.getAccountBalance(),0.0);
	}
}
