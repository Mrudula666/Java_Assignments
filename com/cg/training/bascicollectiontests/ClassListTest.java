package com.cg.training.bascicollectiontests;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

import org.junit.Test;

public class ClassListTest {
	private List< String> myClassList = new ArrayList<String>();
	@Test
	public void testForArrayList() {
		System.out.println("Elements in the arraylist:");
		String message = "";
		myClassList.add("Mrudula");
		myClassList.add("Ujwala");
		myClassList.add("Hema");
		myClassList.add("Priyanka");
		myClassList.add("Bhanu");
		myClassList.add("Jaffer");
		myClassList.add("Ankitha");
		myClassList.add("Deepika");
		Iterator<String> iterator = myClassList.iterator();
		//Arraylist supports the insertion order.
		while(iterator.hasNext()){
			System.out.print(iterator.next()+" ");
		}
		System.out.println();
	}
	
	@Test
	public void testForNaturalOrder() {
		System.out.println("The names in natural order: ");
		myClassList.add("Mrudula");
		myClassList.add("Ujwala");
		myClassList.add("Hema");
		myClassList.add("Priyanka");
		myClassList.add("Bhanu");
		myClassList.add("Jaffer");
		myClassList.add("Ankitha");
		myClassList.add("Deepika");
		/**
		 * to get the elements in the natural order or lexiographical order we user sort() method which is in the Collections package 
		 * that is used to sort the elements in the lexiographical order.
		 *  
		 */
		Collections.sort(myClassList);
		Iterator<String> iterator = myClassList.iterator();
		//Printing in the natural order
		while(iterator.hasNext()){
			System.out.print(iterator.next()+" ");
		}
	}

}
