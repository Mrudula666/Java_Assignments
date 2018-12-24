package com.cg.training.bascicollectiontests;

import static org.junit.Assert.*;

import java.lang.annotation.Native;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

import org.junit.Test;

import com.cg.training.basiccollections.Car;

public class CarComparableTests {
	private Car car1;
	private Car car2;
	private Car car3;
	private List<Car> carList = new ArrayList<Car>();
	@Test
	public void testForCarComparable() {
		car1 = new Car("Tata","Indica",2013,230000);
		car2 = new Car("Maruthi","santro",2015,560000);
		car3 = new Car("Hyundai","i10",2017,700000);
		//adds the cars in the list
		carList.add(car1);
		carList.add(car2);
		carList.add(car3);
		Collections.sort(carList);//calls the compareTo() method
		/*Iterator<Car> iterator = carList.iterator();
		while(iterator.hasNext())
			System.out.println(iterator.next());
			*/
		for (Car car : carList) {
			System.out.println(car);
		}
	}

}
