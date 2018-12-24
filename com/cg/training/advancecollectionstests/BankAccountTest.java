package com.cg.training.advancecollectionstests;

import static org.junit.Assert.*;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.junit.Before;
import org.junit.Test;

import com.cg.training.advancecollections.SavingAccount;
import com.cg.training.fileio.Employee;

public class BankAccountTest {
	private SavingAccount savingAccountCustomer1;
	private SavingAccount savingAccountCustomer2;
	private SavingAccount savingAccountCustomer3;
	private SavingAccount savingAccountCustomer4;
	private SavingAccount savingAccountCustomer5;
	private List<SavingAccount> savingAccountCustomers = new ArrayList<SavingAccount>();

	@Before
	public void setUp() {
		savingAccountCustomer1 = new SavingAccount(116098754, "Mrudulaa",
				15000, true);
		savingAccountCustomer2 = new SavingAccount(116098753, "Vineela", 7000,
				true);
		savingAccountCustomer3 = new SavingAccount(116098752, "Ujwala", 15000,
				true);
		savingAccountCustomer4 = new SavingAccount(116098751, "Hema", 15000,
				true);
		savingAccountCustomer5 = new SavingAccount(116098750, "Priyanka",
				15000, true);
		savingAccountCustomers.add(savingAccountCustomer1);
		savingAccountCustomers.add(savingAccountCustomer2);
		savingAccountCustomers.add(savingAccountCustomer3);
		savingAccountCustomers.add(savingAccountCustomer4);
		savingAccountCustomers.add(savingAccountCustomer5);
	}

	@Test
	public void testForDisplayingTheList() {
		System.out.println("List Of Customers: ");
		Iterator<SavingAccount> iterator = savingAccountCustomers.iterator();
		while (iterator.hasNext()) {
			System.out.println(iterator.next());
		}
	}

	@Test
	public void testForReadingAndWritingTheSutomerListInTheFile() {
		File listFile = new File("C:/Users/mrnimmal/Downloads/BankCustomerArrayList.txt");
		//String filePath = "C:/Users/mrnimmal/Downloads/BankCustomerArrayList.txt";
			 
			File file=SavingAccount.getWriteCustomerArrayList(savingAccountCustomers,listFile);
			System.out.println(file.exists());
			
	}
	
	@Test
	public void testForWritingTheFiles() {
		//File listFile = new File("C:/Users/mrnimmal/Downloads/BankCustomerArrayList.txt");
		String filePath = "C:/Users/mrnimmal/Downloads/BankCustomerArrayList.txt";
			 
			try {
				List<SavingAccount> list = SavingAccount.getReadList(filePath);
				Iterator<SavingAccount> iterator = list.iterator();
				while (iterator.hasNext()) {
					System.out.println(iterator.next());
					
				}
			} catch (ClassNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			
	}

}
