package corejava.inheritance.assignmenttests;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import corejava.inheritance.assignments.BankFactory;
import corejava.inheritance.assignments.CurrentAccount;
import corejava.inheritance.assignments.exceptions.InsuffientFundsException;

public class CurrentAccountTest {
	private BankFactory bankAccount;
	private CurrentAccount currentAccountCustomer;
	
	
	@Before
	public void setUp(){
			currentAccountCustomer = bankAccount.getNewCurrentAccount( "Vineela", 7000.0, 150.0);
		
	}

	@Test
	public void testForWithDraw() {
		try {
			currentAccountCustomer.withDraw(100);
		} catch (InsuffientFundsException e) {
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
		}
			
	}
	
	@Test
	public void testForInsufientFunds() {
		try {
			currentAccountCustomer.withDraw(-100);
		} catch (InsuffientFundsException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
			
	}
	@Test
	public void testForDeposit() {
			currentAccountCustomer.deposit(100);
	}
}
