package corejava.inheritance.assignmenttests;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import corejava.inheritance.assignments.BankAccount;
import corejava.inheritance.assignments.CurrentAccount;
import corejava.inheritance.assignments.MMSavingAccount;
import corejava.inheritance.assignments.SavingAccount;
import corejava.inheritance.assignments.exceptions.InsuffientFundsException;

public class MMBankTest {
	private CurrentAccount customer1;
	private BankAccount customer2;
	
	
	@Before
	public void setUp(){
		//customer2 = new CurrentAccount(102, "Mrudula", 3000, 500);
	}

	@Test
	public void testForCreditLimit() {
		System.out.println(customer2.toString());
	}
	@Test
	public void testForWithDrawAmount() {
		try {
			customer2.withDraw(3450);
		} catch (InsuffientFundsException e) {
			e.printStackTrace();
		}
	}
		
		@Test
		public void testForMMBankSavingAccount() {
			try {
				customer2.withDraw(3450);
			} catch (InsuffientFundsException e) {
				e.printStackTrace();
			}
		
	}

}
