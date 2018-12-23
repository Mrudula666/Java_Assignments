/**
 * 
 */
package corejava.day2assignments;

/**
 * @author mrnimmal
 Consider a Rectangle Shape.
Identify its properties and behaviours and implement the same.
Write a Test Cases to check if the behaviours(methods) are implemented properly.
If their are 2 Rectangle objects of different sizes than we should be able to check if they are having same area or not.

Test the Program with different combinations test cases possible.
*
 */
public class RectangleClass {
	private int length;
	private int breadth;
	//Non_argument constructor.
	public RectangleClass() {
		super();
		// TODO Auto-generated constructor stub
	}
	//Argumented constructor.
	public RectangleClass(int length, int breadth) {
		super();
		this.length = length;
		this.breadth = breadth;
	}
	//setters and getters for rectangle class.
	public int getLength() {
		return length;
	}
	public void setLength(int length) {
		this.length = length;
	}
	public int getBreadth() {
		return breadth;
	}
	public void setBreadth(int breadth) {
		this.breadth = breadth;
	}
	
	//calculating the area of the rectangle
	public double areaCalculator(){
		double area = (length*breadth);
		
		return area;
	}
	//calculating the perimeter of the rectangle.
	public double perimeterCalculator(){
		double perimeter = 2*(length+breadth);
		return perimeter;
	}
	//comparing the two rectangle instances based on the area.
	public static boolean areaComparator(double areaCalculator,
			double areaCalculator2) {
		boolean flag = false;
		if(areaCalculator == areaCalculator2)
			flag = true;
		else
			flag = false;
		return flag;
	}

}
