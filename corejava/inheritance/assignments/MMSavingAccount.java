/**
 * 
 */
package corejava.inheritance.assignments;

import corejava.inheritance.assignments.exceptions.InsuffientFundsException;
import corejava.inheritance.assignments.exceptions.InvalidAmountException;

/**
 * @author mrnimmal
 *
 */
public class MMSavingAccount extends SavingAccount {
	private static final double MINBAL = 50;

	public MMSavingAccount( String accountHolderName,
			double accountBalance, boolean isSalaried) {
		super( accountHolderName, accountBalance, isSalaried);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void withDraw(double amountToBeWithdrawn) throws InvalidAmountException, InsuffientFundsException {
		if ( amountToBeWithdrawn > 0 && amountToBeWithdrawn <=  super.getAccountBalance() && amountToBeWithdrawn >= MINBAL){
			deposit(-amountToBeWithdrawn);
		}
		else if(amountToBeWithdrawn < 0 )
			throw new InvalidAmountException("Amount is not valid");
		else
			throw new InsuffientFundsException("Insuffient funds.");
			
	}

	@Override
	public String toString() {
		return "MMSavingAccount [isSalaried=" + isSalaried + ", toString()="
				+ super.toString() + "]";
	}

}
