package corejava.day2assignmentstests;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import corejava.day2assignments.Distance;

public class DistanceTest {
	private Distance distance1;
	private Distance distance2;
	private Distance distanceSum;
	
	@Before
	public void main(){
		distance1 = new Distance();
		distance2 = new Distance();
		distanceSum = new Distance();
	}
	//testing for positive values.
	@Test
	public void testforPositiveFeetAndInches() {
		distance1.set(5, 5);
		distance1.disp();
		distance2.set(3,5);
		distance2.disp();
		
	}
	//testing for negative values.
	@Test
	public void testforNegativeFeetAndInches() {
		distance1.set(-9,-8);
		
	}
	//test for adding the two distance
	@Test
	public void testForAddingTheDistance() {
		distance1.set(3, 5);
		distance2.set(5,5);
		distanceSum = Distance.add(distance1,distance2);
		distanceSum.disp();
	}
	
	//test for adding the two distance
		@Test
		public void testForAddWhenNegativeDistanceAreGiven() {
			distance1.set(-3, -5);
			distance2.set(5,5);
			distanceSum = Distance.add(distance1,distance2);
		}
	

}
