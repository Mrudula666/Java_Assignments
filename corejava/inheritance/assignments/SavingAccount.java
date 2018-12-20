package corejava.inheritance.assignments;

import corejava.inheritance.assignments.exceptions.InsuffientFundsException;
import corejava.inheritance.assignments.exceptions.InvalidAmountException;

public abstract class SavingAccount extends BankAccount {
	protected boolean isSalaried;
	private final static double MINBAL = 500;
		
	public SavingAccount( String accountHolderName,
			double accountBalance, boolean isSalaried) {
		super( accountHolderName, accountBalance);
		this.isSalaried = isSalaried;
	}


	@Override
	public abstract void withDraw(double amountToBeWithdrawn) throws InvalidAmountException, InsuffientFundsException;


	@Override
	public String toString() {
		return "SavingAccount [isSalaried=" + isSalaried
				+ ", getAccountHolderName()=" + getAccountHolderName()
				+ ", getAccountBalance()=" + getAccountBalance()
				+ ", toString()=" + super.toString() + ", getClass()="
				+ getClass() + ", hashCode()=" + hashCode() + "]";
	}


	

}
