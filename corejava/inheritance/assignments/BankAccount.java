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
public abstract class BankAccount {
	private int accountNumber;
	private String accountHolderName;
	private double accountBalance;
	private static int accountNumberGenerator;
	static{
		accountNumberGenerator= 110245600;
	}
	{
		accountNumber = ++accountNumberGenerator;
	}
	public BankAccount( String accountHolderName,
			double accountBalance) {
		super();
		this.accountHolderName = accountHolderName;
		this.accountBalance = accountBalance;
	}
	

	public int getAccountNumber() {
		return accountNumber;
	}




	public String getAccountHolderName() {
		return accountHolderName;
	}

	public double getAccountBalance() {
		return accountBalance;
	}

	@Override
	public String toString() {
		return "BankAccount [accountNumber=" + accountNumber
				+ ", accountHolderName=" + accountHolderName
				+ ", accountBalance=" + accountBalance + "]";
	}

	
	public abstract void withDraw(double amountToBeWithdrawn) throws InsuffientFundsException, InvalidAmountException;
	
	public void deposit(double amountToBeDeposited){
			accountBalance = accountBalance+amountToBeDeposited;
	}


}
