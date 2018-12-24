package com.cg.training.bascicollectiontests;

import static org.junit.Assert.*;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

import org.junit.Test;

import com.cg.training.basiccollections.Car;

public class TestForCarClasses {
	private Car car1;
	private Car car2;
	private Car car3;
	private Car car4;
	private Set<Car> carList = new HashSet<Car>();


	@Test
	public void testForDuplicateObjects() {
		car1 = new Car("Ford", "xcent", 2013, 600000);
		car2 = new Car("Hyundai", "xcent", 2015, 700000);
		car3 = new Car("Hyundai", "i10", 2017, 700000);
		carList.add(car1);
		carList.add(car2);
		carList.add(car3);
		carList.add(car1);// Checking the property of set by assigning the
							// duplicate objects:
		System.out.println("Checking the property of set by giveing the duplicate objects: ");
		Iterator iterator = carList.iterator();
		while (iterator.hasNext()) {
			System.out.println(iterator.next().toString());
		}
	}
	@Test
	public void testForTheDuplicateValuesForDiffrentObjectsHavingSameDataUsingEqualsAndHasCodeMethods() {
		car1 = new Car("Ford", "xcent", 2013, 600000);
		car3 = new Car("Hyundai", "i10", 2017, 700000);
		car4 = new Car("Hyundai", "xcent", 2016, 750000);
		car2 = new Car("Hyundai", "xcent", 2015, 700000);
		carList.add(car1);
		carList.add(car2);
		carList.add(car3);
		carList.add(car4);
		//checking the list after clalling the equals and hashcode() methods.
		System.out.println("The given cars carlist are: ");
		Iterator iterator = carList.iterator();
		while (iterator.hasNext()) {
			System.out.println(iterator.next().toString());
		}
	}

}
