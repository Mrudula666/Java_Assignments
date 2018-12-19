/**
 * 
 */
package corejava.inheritance.assignments;

import corejava.inheritance.assignments.exceptions.InsuffientFundsException;



/**
 * @author mrnimmal
 *
 */
public abstract class BankAccount {
	private final int accountNumber;
	private String accountHolderName;
	private double accountBalance;
	public BankAccount(int accountNumber, String accountHolderName,
			double accountBalance) {
		super();
		this.accountNumber = accountNumber;
		this.accountHolderName = accountHolderName;
		this.accountBalance = accountBalance;
	}
	

	public String getAccountHolderName() {
		return accountHolderName;
	}

	public double getAccountBalance() {
		return accountBalance;
	}

	@Override
	public String toString() {
		return "BankAcc [accountNumber=" + accountNumber
				+ ", accountHolderName=" + accountHolderName
				+ ", accountBalance=" + accountBalance + "]";
	}


	public void setAccountBalance(double accountBalance) {
		this.accountBalance = accountBalance;
	}
	
	public abstract void withDraw(double amountToBeWithdrawn) throws InsuffientFundsException;
	
	public void deposit(double amountToBeDeposited){
		if(amountToBeDeposited > 0)
			accountBalance += amountToBeDeposited;
	}

}
