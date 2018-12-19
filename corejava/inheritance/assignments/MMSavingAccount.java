/**
 * 
 */
package corejava.inheritance.assignments;

/**
 * @author mrnimmal
 *
 */
public class MMSavingAccount extends SavingAccount {
	private static final double MINBAL = 50;

	public MMSavingAccount(int accountNumber, String accountHolderName,
			double accountBalance, boolean isSalaried) {
		super(accountNumber, accountHolderName, accountBalance, isSalaried);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void withDraw(double amountToBeWithdrawn) {
		// TODO Auto-generated method stub
		super.withDraw(amountToBeWithdrawn);
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString();
	}

}
