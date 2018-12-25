/**
 * 
 */
package com.cg.training.advancecollections;

import java.util.List;
import java.util.Set;
import java.util.TreeSet;


/**
 *Mrurudla Nimmala
 *c.Create class BankAccountList which will maintain SavingAccount objects. Ensure that 
 *this class should not allow duplicates as well as data should be displayed in sorted order. (as per acc_ID).
 *
 */
public class BankAccountList extends SavingAccount{

	public Set<SavingAccount> addListElements(List<SavingAccount> savingAccountCustomers) {
		Set<SavingAccount> savingCustomersSet = new TreeSet<SavingAccount>(savingAccountCustomers);
		return savingCustomersSet;
		
		
	}

	

	

}
