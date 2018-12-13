package corejava.assignmentstests_2;

import static org.junit.Assert.*;

import org.junit.Test;

import corejava.assignments_2.Discount;//importing corejava.assignments_2 package for Discount class.

public class DiscountTest {

	@Test
	public void testForPositiveDiscount() {
		int newItem =2500;//getting the new item price
		int discount_percent = 35;//discount percent.
		double answer = 2499.65;
		double new_price = Discount.getNewPrice(newItem,discount_percent);//implementing the method to get the discount and price of the item 
		System.out.println(new_price);//printing the output
	}
	
	@Test
	public void testForDiscount() {
		int newItem =2500;//getting the new item price
		int discount_percent = 55;//discount percent.
		double new_price = Discount.getNewPrice(newItem,discount_percent);//implementing the method to get the discount and price of the item 
		System.out.println(new_price);//printing the output
	}
	
	@Test
	public void testForNoDiscount() {
		int newItem =2500;//getting the new item price
		int discount_percent = 0;//discount percent.
		double new_price = Discount.getNewPrice(newItem,discount_percent);//implementing the method to get the discount and price of the item 
		System.out.println(new_price);//printing the output
	}

}
