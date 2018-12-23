package com.cg.training.assignments.basiccollectionstests;

import static org.junit.Assert.*;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

import org.junit.Test;

import com.cg.training.assignments.basiccollections.Laptop;

public class TestForLaptop {
	// data members for latop.
		private Laptop lenovo;
		private Laptop lenovo1;
		private Laptop hp;
		private Laptop apple;
		private Set<Laptop> laptopSets = new HashSet<Laptop>();

		@Test 
		 public void testForDuplicateValues() { 
		/**
			 * Checking wheter the set is taking the duplicate values are not.
			 * before writing the equals() and hashcode() method.
			 */

		
		  System.out.println("Checking For duplicate values");
		  lenovo = new Laptop("Lenovo","320-15ISK","Windows","i7");
		  hp = new Laptop("hp","Pavillion","Windows","i7-8550U"); 
		  apple = new Laptop("apple","MMGF2HN/A","MACBOOK","i5"); 
		  lenovo = new Laptop("Lenovo","320-15ISK","Windows","i7"); 
		  lenovo1 = new Laptop("Lenovo","320-15ISK","Linux","i8"); 
		  laptopSets.add(apple);
		  laptopSets.add(lenovo); 
		  laptopSets.add(hp);
		  laptopSets.add(lenovo);
		  laptopSets.add(lenovo1); 
		  Iterator iterator = laptopSets.iterator();
		  while(iterator.hasNext()){
		  System.out.println(iterator.next().toString()); }
		  
		  }
		  		  
		  @Test
		  public void testForEqualityForTwo() { 
		 /**
			 * checking for the equality of the two objects in set.
			 */
			  System.out.println("Checking for equality of company and model");
			  lenovo = new Laptop("Lenovo","320-15ISK","Windows","i7"); 
			  hp = new  Laptop("hp","Pavillion","Windows","i7-8550U"); 
			  apple =new Laptop("apple","MMGF2HN/A","MACBOOK","i5"); 
			  lenovo1 = new Laptop("Lenovo","320-15ISK","Linux","i8"); 
			  laptopSets.add(apple);
			  laptopSets.add(lenovo);
			  laptopSets.add(hp); 
			  laptopSets.add(lenovo1);
			  Iterator iterator = laptopSets.iterator(); 
			  while(iterator.hasNext()){
			  System.out.println(iterator.next().toString()); }
			  
			 }

}
