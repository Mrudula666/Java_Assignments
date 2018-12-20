/**
 * 
 */
package corejava.inheritance.assignments;



/**
 * @author mrnimmal
 *
 */
public abstract class BankFactory {
	public abstract SavingAccount getNewSavingAccount(String accountHolderName, double accountBalance,boolean isSalaried);
	public  abstract CurrentAccount getNewCurrentAccount(String accountHolderName, double accountBalance,double creditLimit);
}
