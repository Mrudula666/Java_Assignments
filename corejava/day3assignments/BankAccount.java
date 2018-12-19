/**
 * 
 */
package corejava.day3assignments;

/**
 * @author mrnimmal
 *
 */
public class BankAccount {
	private final long accountNumber; 
	private String accountHolderName;
	private double initialBalance;
	private static long accountNumberGenerator;
	static {
		accountNumberGenerator = 110245600; 
	}
	//initialisers for account number that should be auto generated.
	{
		accountNumber = ++accountNumberGenerator;
	}
	/**
	 * 
	 * @param accountHolderName
	 * @param initialBalance
	 */
	public BankAccount( String accountHolderName,
			int initialBalance) {
		super();
		this.accountHolderName = accountHolderName;
		this.initialBalance = initialBalance;
	}
	public double getInitialBalance() {
		return initialBalance;
	}
	public void setInitialBalance(double initialBalance) {
		this.initialBalance = initialBalance;
	}
	public String getAccountHolderName() {
		return accountHolderName;
	}
	/**
	 */
	@Override
	public String toString() {
		return "BankAccount [accountNumber=" + accountNumber
				+ ", accountHolderName=" + accountHolderName
				+ ", initialBalance=" + initialBalance + "]";
	}
	public static long getNextAccountNumber() {
		return accountNumberGenerator;
	}
	
	public double depositAmount(double amount) {
		amount += getInitialBalance();
		return amount;
		
	}
	public double withDraw(int amountToBeWithdrawn) {
		double amount = 0;
		if ( amountToBeWithdrawn >= 0 && getInitialBalance() >= amountToBeWithdrawn)
			amount = depositAmount(-amountToBeWithdrawn);
		return amount;
	}
	
	

}
