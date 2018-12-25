package com.cg.training.advancecollections;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;

import com.cg.training.fileio.Employee;

/**
 * 
 * Mrudula Nimmala 1) Create a Class SavingAccount with field’s acc_balance,
 * acc_ID, accountHoldername, isSalaryAccount. Also add setter and getter
 * methods with business method like withdraw and deposit. a.Create 5 different
 * object of SavingAccount and add them into ArrayList, now interate the
 * arraylist and display all SavingAccount’s object one by one. b.Now save the
 * ArrayList which contains SavingAccount’s object into a file and read the file
 * and display all savingAccount Object one by one. c.Create class
 * BankAccountList which will maintain SavingAccount objects. Ensure that this
 * class should not allow duplicates as well as data should be displayed in
 * sorted order. (as per acc_ID)
 *
 */

public class SavingAccount implements Serializable,Comparable<SavingAccount> {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	/**
	 * 
	 * @param accountNumber
	 * @param accountName
	 * @param accountBalance
	 * @param isSalaryAccount
	 */

	private int accountNumber;
	private String accountName;
	private int accountBalance;
	private boolean isSalaryAccount;

	public SavingAccount(int accountNumber, String accountName,
			int accountBalance, boolean isSalaryAccount) {
		this.accountNumber = accountNumber;
		this.accountName = accountName;
		this.accountBalance = accountBalance;
		this.isSalaryAccount = isSalaryAccount;
	}

	public SavingAccount() {
		super();
		// TODO Auto-generated constructor stub
	}

	public int getAccountNumber() {
		return accountNumber;
	}

	public void setAccountNumber(int accountNumber) {
		this.accountNumber = accountNumber;
	}

	public String getAccountName() {
		return accountName;
	}

	public void setAccountName(String accountName) {
		this.accountName = accountName;
	}

	public int getAccountBalance() {
		return accountBalance;
	}

	public void setAccountBalance(int accountBalance) {
		this.accountBalance = accountBalance;
	}

	public boolean isSalaryAccount() {
		return isSalaryAccount;
	}

	public void setSalaryAccount(boolean isSalaryAccount) {
		this.isSalaryAccount = isSalaryAccount;
	}

	public int withDraw(int amount) {
		if (amount > 0)
			return (deposit(-amount));
		else
			return 0;

	}

	public int deposit(int amount) {
		accountBalance += amount;
		return accountBalance;
	}

	@Override
	public String toString() {
		return "SavingAccount [accountNumber=" + accountNumber
				+ ", accountName=" + accountName + ", accountBalance="
				+ accountBalance + ", isSalaryAccount=" + isSalaryAccount + "]";
	}

	public static File getWriteCustomerArrayList(
			List<SavingAccount> savingAccountCustomers, File listFile) {
		FileOutputStream fos = null;
		ObjectOutputStream oos = null;
		try {
			fos = new FileOutputStream(listFile);
			oos = new ObjectOutputStream(fos);
			oos.writeObject(savingAccountCustomers);
			oos.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
		return listFile;
	}

	public static List<SavingAccount> getReadList(String filePath)
			throws ClassNotFoundException {
		List<SavingAccount> listInFile = new ArrayList<SavingAccount>();
		FileInputStream fis = null;
		ObjectInputStream ois = null;
		try {
			fis = new FileInputStream(filePath);
			ois = new ObjectInputStream(fis);
			listInFile = (ArrayList<SavingAccount>) ois.readObject();// typecasting the object type to ArrayList
			ois.close();
			return listInFile;
		} catch (IOException e) {
			e.printStackTrace();
		}

		return null;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + accountBalance;
		result = prime * result
				+ ((accountName == null) ? 0 : accountName.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		SavingAccount other = (SavingAccount) obj;
		if (accountBalance != other.accountBalance)
			return false;
		if (accountName == null) {
			if (other.accountName != null)
				return false;
		} else if (!accountName.equals(other.accountName))
			return false;
		return true;
	}

	@Override
	public int compareTo(SavingAccount arg0) {
		// TODO Auto-generated method stub
		return (this.accountNumber - arg0.getAccountNumber());
	}

}
