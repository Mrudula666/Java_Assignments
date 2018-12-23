package com.cg.training.assignments.basiccollectionstests;

import static org.junit.Assert.*;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

import org.junit.Before;
import org.junit.Test;

import com.cg.training.assignments.basiccollections.CellPhone;
import com.cg.training.assignments.basiccollections.Laptop;
import com.cg.training.assignments.basiccollections.Television;

public class TestForTelevision {
	
	// data members for television
	private Television plasma;
	private Television lcd;
	private Television led;
	private Set<Television> televisionList = new HashSet<Television>();
	// datamembers for cellphone
	private CellPhone samsung;
	private CellPhone onePlus6T;
	private CellPhone redmi;

	@Test
	public void testForTelevsionTest() {
		System.out.println("Check For class television:");
		led = new Television("Samsung", "LED", true, 130000);
		lcd = new Television("Hitachi", "LCD", false, 60000);
		plasma = new Television("LG", "plasma", true, 25000);
		televisionList.add(led);
		televisionList.add(lcd);
		televisionList.add(plasma);
		Iterator iterator = televisionList.iterator();
		while (iterator.hasNext()) {
			System.out.println(iterator.next().toString());
		}
	}

	@Test
	public void DuplicateValuesForDiffrentObjectsHavingSameDataUsingEqualsAndHasCodeMethods() {
		System.out.println("Check For diffrent objects having same data using equals() and hashCode() Methods:");
		led = new Television("Samsung", "LED", true, 130000);
		lcd = new Television("Hitachi", "LCD", false, 60000);
		plasma = new Television("LG", "plasma", true, 25000);
		Television plasma1 = new Television("LG", "plasma", false, 25000);
		televisionList.add(led);
		televisionList.add(lcd);
		televisionList.add(plasma);
		Iterator iterator = televisionList.iterator();
		while (iterator.hasNext()) {
			System.out.println(iterator.next().toString());
		}
	}

}
