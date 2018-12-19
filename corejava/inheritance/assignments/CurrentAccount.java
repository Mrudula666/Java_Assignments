package corejava.inheritance.assignments;

import corejava.inheritance.assignments.exceptions.InsuffientFundsException;

public abstract class CurrentAccount extends BankAccount {
	private final double creditLimit; 

	public CurrentAccount(int accountNumber, String accountHolderName,
			double accountBalance, double creditLimit) {
		super(accountNumber, accountHolderName, accountBalance);
		this.creditLimit = creditLimit;//lazy initialisation for credit limit
		
	}

	@Override
	public void withDraw(double amountToBeWithdrawn) throws InsuffientFundsException {
		if ( amountToBeWithdrawn <= getAccountBalance() )
			deposit(-amountToBeWithdrawn);
		else if ( amountToBeWithdrawn <= (getAccountBalance()+creditLimit) && !(creditLimit <= 0) )
			deposit(-amountToBeWithdrawn);
		else 
			throw new InsuffientFundsException("Insuffient Funds");
	}

	@Override
	public String toString() {
		return "CurrentAccount [creditLimit=" + creditLimit + ", toString()="
				+ super.toString() + "]";
	}

	

}
