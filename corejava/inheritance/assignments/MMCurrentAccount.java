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

	public MMCurrentAccount( String accountHolderName,
			double accountBalance, double creditLimit) {
		super( accountHolderName, accountBalance, creditLimit);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void withDraw(double amountToBeWithdrawn)
			throws InsuffientFundsException {
		if ( amountToBeWithdrawn <= getAccountBalance() )
			deposit(-amountToBeWithdrawn);
		else if ( amountToBeWithdrawn <= (getAccountBalance()+creditLimit)  )
			deposit(-amountToBeWithdrawn);
		else 
			throw new InsuffientFundsException("Insuffient Funds");
	}

	@Override
	public String toString() {
		return "MMCurrentAccount [creditLimit=" + creditLimit + ", toString()="
				+ super.toString() + "]";
	}


}
