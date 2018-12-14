/**
 * 
 */
package corejava.day2assignments;

/**
 * @author mrnimmal
 * Write the definition for a class called Distance that has properties feet as integer  and inches as float. 
 * The class has the following behaviours/services/methods:
	void set(int, float) to give value to object
	void disp() to display distance in feet and inches
	Distance add(Distance) to sum two distances & return distance
	1. Write the definitions for each of the above member functions.
	2. Write DistanceTest class with main function to create three Distance objects.
	 Set the value in two objects and call add() to calculate sum and assign it in third object. 
	Display all distances.
 */
public class Distance { 
	private int feet;
	private float inches;
	public void set(int feet,float inches){
		if(feet>0 || inches>0){
		this.feet = feet;
		this.inches = inches;
		}else
			System.out.println("Invalid details...");
	}
	public void disp(){
		System.out.println("Feet: "+feet+" "+"Inches: "+inches);
	}
	public static Distance add(Distance distance1, Distance distance2) {
		System.out.print("Adding the distances: ");
		Distance distanceSum = new Distance();
		distanceSum.feet = distance1.feet+distance2.feet;
		distanceSum.inches = distance1.inches+distance2.inches;
		return distanceSum;
	}
	

}
