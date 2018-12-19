package corejava.inheritance.assignments;

public abstract class SavingAccount extends BankAccount {
	private boolean isSalaried;
	private final static float MINBAL = 500;
		
	public SavingAccount(int accountNumber, String accountHolderName,
			double accountBalance, boolean isSalaried) {
		super(accountNumber, accountHolderName, accountBalance);
		this.isSalaried = isSalaried;
	}


	@Override
	public void withDraw(double amountToBeWithdrawn) {
		if ( amountToBeWithdrawn >=  getAccountBalance() && amountToBeWithdrawn >= MINBAL)
			deposit(-amountToBeWithdrawn);
		
	}


	@Override
	public String toString() {
		return "SavingAccount [isSalaried=" + isSalaried + ", toString()="
				+ super.toString() + "]";
	}

}
