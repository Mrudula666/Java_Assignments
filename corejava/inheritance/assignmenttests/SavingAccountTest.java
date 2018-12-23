package corejava.inheritance.assignmenttests;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import corejava.inheritance.assignments.BankAccount;
import corejava.inheritance.assignments.BankFactory;
import corejava.inheritance.assignments.CurrentAccount;
import corejava.inheritance.assignments.MMBankFacotry;
import corejava.inheritance.assignments.MMCurrentAccount;
import corejava.inheritance.assignments.MMSavingAccount;
import corejava.inheritance.assignments.SavingAccount;

import corejava.inheritance.assignments.exceptions.InsuffientFundsException;
import corejava.inheritance.assignments.exceptions.InvalidAmountException;

public class SavingAccountTest {
	private BankFactory bankAccount;
	private SavingAccount savingAccountCustomer;
	
	
	
	@Before
	public void setUp(){
		bankAccount = new MMBankFacotry();
		savingAccountCustomer = bankAccount.getNewSavingAccount( "Mrudula", 8851.0, true);
	}
	
	@Test
	public void testForSavingAccountWithDraw(){
		try {
			savingAccountCustomer.withDraw(500);
			assertEquals(8351, savingAccountCustomer.getAccountBalance(),0.0);
		} catch (InvalidAmountException | InsuffientFundsException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
			
	}
	@Test
	public void testForSavingAccountWithDrawForInvalidAmount(){
		try {
			savingAccountCustomer.withDraw(-500);
		} catch (InvalidAmountException | InsuffientFundsException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
			
	}
	@Test
	public void testForSavingAccountWithDrawForInsuffientAmount(){
		try {
			savingAccountCustomer.withDraw(9500);
		} catch (InvalidAmountException | InsuffientFundsException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
			
	}
	
	@Test
	public void testForDeposit(){
		savingAccountCustomer.deposit(100);
		assertEquals(8951, savingAccountCustomer.getAccountBalance(),0.0);
		
	}

	

}
