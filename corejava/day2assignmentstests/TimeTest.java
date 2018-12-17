package corejava.day2assignmentstests;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import corejava.day2assignments.Time;

public class TimeTest {
	private Time time1;
	private Time time2;
	private Time timeSum;

	@Before
	public void main(){
		time1 = new Time();
		time2 = new Time();
		timeSum = new Time();
	}
	
	@Test
	public void testforPositiveHoursAndMinutes(){
		time1.setTime(6, 00);
		time1.showTime();
		
	}
	
	@Test
	public void testforInvalidHoursAndMinutes(){
		time1.setTime(44, 00);
		time1.showTime();
	}
	@Test
	public void testForAddingTheTime(){
		time1.setTime(6, 00);
		time2.setTime(13, 30);
		timeSum = Time.add(time1,time2);
		timeSum.showTime();
		
	}
	@Test
	public void testForAddingTheInvalidTime(){
		time1.setTime(24, 00);
		time2.setTime(13, 30);
		timeSum = Time.add(time1,time2);
		timeSum.showTime();
		
	}

}
