/**
 * 
 */
package corejava.day2assignments;

/**
 * @author mrnimmal
 * Write the definition for a class called Time that has hours and minutes as integer. 
 * The class has the following behaviours/services/methods:
	void setTime(int, int) to set the specified value in object
	void showTime() to display time object
	time sum(time) to sum two time object & return time
	1. Write the definitions for each of the above member functions.
	2. Write main function to create three time objects. 
	Set the value in two objects and call sum() to calculate sum and assign it in third object. 
	Display all time objects.
 *
 */
public class Time {
	private int hours;
	private int minutes;
	public void setTime(int hours,int minutes) {
		if(hours <= 24 && minutes <= 60) {
		this.hours = hours;
		this.minutes = minutes;
		}
	}
	public void showTime() {
		System.out.println("Hours: "+hours+" Minutes: "+minutes);
	}
	public static Time add(Time time1, Time time2) {
		Time timeSum = new Time();
		System.out.println("Add the time sum: ");
		timeSum.hours = time1.hours+time2.hours;
		timeSum.minutes = time1.minutes+time2.minutes;
		Time finalTime = new Time();
		if(timeSum.hours <= 24 && timeSum.minutes <=60){
			finalTime.hours = timeSum.hours;
			finalTime.minutes = timeSum.minutes;
		}
		
		return finalTime;
	}
}
