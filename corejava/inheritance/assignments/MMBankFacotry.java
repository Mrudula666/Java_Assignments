/**
 * 
 */
package corejava.inheritance.assignments;

/**
 * @author mrnimmal
 *
 */
public class MMBankFacotry extends BankFactory{
	private SavingAccount savingAccountCustomer;
	private CurrentAccount currentAccountCustomer;
	public MMBankFacotry() {
		super();
		// TODO Auto-generated constructor stub
	}


	@Override
	public SavingAccount getNewSavingAccount(String accountHolderName, double accountBalance, boolean isSalaried) {
		savingAccountCustomer = new MMSavingAccount(  accountHolderName, accountBalance, isSalaried);
		return savingAccountCustomer;
	}

	@Override
	public CurrentAccount getNewCurrentAccount(String accountHolderName, double accountBalance, double creditLimit)  {
			currentAccountCustomer = new MMCurrentAccount( accountHolderName, accountBalance, creditLimit);
			return currentAccountCustomer;
		
	}

	
}
