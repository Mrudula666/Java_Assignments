package com.cg.training.bascicollectiontests;

import static org.junit.Assert.*;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

import org.junit.Test;

import com.cg.training.basiccollections.CellPhone;

public class TestForPhoneClass {
	// datamembers for cellphone
			private CellPhone samsung;
			private CellPhone onePlus6T;
			private CellPhone redmi;
			private Set<CellPhone> cellphoneList = new HashSet<CellPhone>();

			@Test
			public void testForSet() {
				System.out.println("Check for set: ");
				samsung = new CellPhone("Samsung","J7","25000mh","Android",16000);
				onePlus6T = new CellPhone("OnePlus","6T","28000mh","Android",15000);
				redmi = new CellPhone("Redmi","note 5","25000mh","Marshmellow Android",21000);
				cellphoneList.add(samsung);
				cellphoneList.add(onePlus6T);
				cellphoneList.add(redmi);
				Iterator iterator = cellphoneList.iterator();
				while (iterator.hasNext()) {
					System.out.println(iterator.next().toString());
				}
			}
			@Test
			public void testForEqualitySet() {
				System.out.println("Test for equals method.");
				samsung = new CellPhone("Samsung","J7","25000mh","Android",16000);
				onePlus6T = new CellPhone("OnePlus","6T","28000mh","Android",15000);
				redmi = new CellPhone("Redmi","note5","25000mh","Marshmellow Android",21000);
				CellPhone redmi1 = new CellPhone("Redmi", "note5", "25000mh", "Marshmellow Android", 22000);
				cellphoneList.add(samsung);
				cellphoneList.add(onePlus6T);
				cellphoneList.add(redmi);
				cellphoneList.add(redmi1);
				Iterator iterator = cellphoneList.iterator();
				while (iterator.hasNext()) {
					System.out.println(iterator.next().toString());
				}
			}


}
