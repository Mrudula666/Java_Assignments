/**
 * 
 */
package corejava.inheritance.assignments;

/**
 * @author mrnimmal
 *
 */
public abstract class BankFactory {
	public abstract SavingAccount getNewSavingAccount(int accountNumber,String accountHolderName, double accountBalance,boolean isSalaried);
	public  abstract CurrentAccount getNewCurrentAccount(int accountNumber,String accountHolderName, double accountBalance,double creditLimit);

}
