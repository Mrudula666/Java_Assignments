package corejava.day2assignmentstests;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import corejava.day2assignments.Distance;

public class DistanceTest {
	private Distance distance1;
	private Distance distance2;
	private Distance distance3;
	
	@Before
	public void main(){
		distance1 = new Distance();
		distance2 = new Distance();
		distance3 = new Distance();
		distance1.set(3, 5);
		distance2.set(5,5);
	}
	//testing for positive values.
	@Test
	public void testforPositiveFeetAndInches() {
		distance1.set(5, 5);
		distance1.disp();
		
	}
	//testing for negative values.
	@Test
	public void testforNegativeFeetAndInches() {
		distance1.set(-9,-8);
		distance1.disp();
		
	}
	//test for adding the two distance
	@Test
	public void testForadd() {
		Distance distance3 = Distance.add(distance1,distance2);
		distance3.disp();
	}
	

}
