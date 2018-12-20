package corejava.inheritance.assignments;

import corejava.inheritance.assignments.exceptions.InsuffientFundsException;

public abstract class CurrentAccount extends BankAccount {
	protected final double creditLimit; 

	public CurrentAccount( String accountHolderName,
			double accountBalance, double creditLimit) {
		super( accountHolderName, accountBalance);
		this.creditLimit = creditLimit;//lazy initialisation for credit limit
		
	}

	@Override
	public abstract void withDraw(double amountToBeWithdrawn) throws InsuffientFundsException;

	@Override
	public String toString() {
		return "CurrentAccount [creditLimit=" + creditLimit
				+ ", getAccountNumber()=" + getAccountNumber()
				+ ", getAccountHolderName()=" + getAccountHolderName()
				+ ", getAccountBalance()=" + getAccountBalance()
				+ ", toString()=" + super.toString() + ", getClass()="
				+ getClass() + ", hashCode()=" + hashCode() + "]";
	}

	

}
