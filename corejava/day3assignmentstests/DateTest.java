package corejava.day3assignmentstests;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import corejava.day3assignments.Date;

public class DateTest {
	private Date date;
	private Date date1;
	
	@Before
	public void setUp(){
		date = new Date(18,12,2018);
		date1 = new Date(5,1,1987);
		
	}

	@Test
	public void testForDate() {
		System.out.println(date.toString());
	}
	
	@Test
	public void testForSmallerDate() {
		boolean result = Date.isSmaller(date);//checking for the smaller date
		System.out.println(result);
		//assertTrue(result);
		assertTrue(result);
	}
	
	@Test
	public void testForDifferenceOfDate() {
		int[] result = Date.diff(date1);
		for(int i=0;i<result.length;i++){
			System.out.print(result[i]+" ");//printing the difference of the two dates
		}
		System.out.println();
		
	}

}
