/**
 * 
 */
package corejava.inheritance.assignments;

import corejava.inheritance.assignments.exceptions.InsuffientFundsException;

/**
 * @author mrnimmal
 *
 */
public class MMCurrentAccount extends CurrentAccount{

	public MMCurrentAccount(int accountNumber, String accountHolderName,
			double accountBalance, double creditLimit) {
		super(accountNumber, accountHolderName, accountBalance, creditLimit);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void withDraw(double amountToBeWithdrawn)
			throws InsuffientFundsException {
		// TODO Auto-generated method stub
		super.withDraw(amountToBeWithdrawn);
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString();
	}

}
