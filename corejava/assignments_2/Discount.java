package corejava.assignments_2;

public class Discount {

	public static double getNewPrice(int newItem, int discount_percent) {
		double discount = (double)discount_percent/100;//calculating the discount amount.
		double newItemPrice = (double)newItem-discount;//item price after removing the discount amount from item price.
		return newItemPrice;//returning the result
	}

}
