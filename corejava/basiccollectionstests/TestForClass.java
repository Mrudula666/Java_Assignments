package com.cg.training.assignments.basiccollectionstests;

import static org.junit.Assert.*;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

import org.junit.Test;

import com.cg.training.assignments.basiccollections.SchoolClass;

public class TestForClass {
	private SchoolClass school1;
	private SchoolClass school2;
	private SchoolClass school3;
	private Set<SchoolClass> schoolClassList  = new HashSet<SchoolClass>(0);

	@Test
	public void testForDuplicateValues() {
		school1 = new SchoolClass("Global Schools","Macherla","Guntur",10);
		school2 = new SchoolClass("Kids Patasala","Macherla","Guntur",1);
		school3 = new SchoolClass("Euro Schools","Guntur","Guntur",2);
		schoolClassList.add(school1);
		schoolClassList.add(school2);
		schoolClassList.add(school3);
		Iterator iterator = schoolClassList.iterator();
		while(iterator.hasNext()){
			System.out.println(iterator.next().toString());
		}
	}
	@Test
	public void testForEqualitySetss() {
		System.out.println("Test for equality sets: ");
		school1 = new SchoolClass("Global Schools","Macherla","Guntur",10);
		school2 = new SchoolClass("Kids Patasala","Macherla","Guntur",1);
		school3 = new SchoolClass("Euro Schools","Guntur","Guntur",2);
		SchoolClass school4 = new SchoolClass("Global Schools", "Macherla", "Guntur", 3); 
		schoolClassList.add(school1);
		schoolClassList.add(school2);
		schoolClassList.add(school3);
		schoolClassList.add(school4);
		Iterator iterator = schoolClassList.iterator();
		while(iterator.hasNext()){
			System.out.println(iterator.next().toString());
		}
	}


}
