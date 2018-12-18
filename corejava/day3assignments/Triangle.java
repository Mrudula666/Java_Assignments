/**
 * 
 */
package corejava.day3assignments;

/**
 * @author mrnimmal
 *Write a class called Triangle that can be used to represent a triangle. 
 *It should include the following methods that return boolean values indicating if the particular property holds:

	isRight (a right triangle)
	isScalene (no two sides are the same length)
	isIsosceles (exactly two sides are the same length)
	isEquilateral (all three sides are the same length)
	Write a simple tester program that creates a few triangles and asks them about their type.

	NOTE: Write appropriate TestCases.
 */
public class Triangle {
	private int firstSide;
	private int secondSide;
	private int thirdSide;
	
	public Triangle() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Triangle(int firstSide, int secondSide, int thirdSide) {
		super();
		this.firstSide = firstSide;
		this.secondSide = secondSide;
		this.thirdSide = thirdSide;
	}
	//getters and setters for Triangle class
	public int getFirstSide() {
		return firstSide;
	}
	public void setFirstSide(int firstSide) {
		this.firstSide = firstSide;
	}
	public int getSecondSide() {
		return secondSide;
	}
	public void setSecondSide(int secondSide) {
		this.secondSide = secondSide;
	}
	public int getThirdSide() {
		return thirdSide;
	}
	public void setThirdSide(int thirdSide) {
		this.thirdSide = thirdSide;
	}
	public static boolean isTriangle(Triangle isTriangle) {
		boolean flag = false;
		if((isTriangle.getFirstSide()+isTriangle.getSecondSide())>isTriangle.getThirdSide())
			flag = true;
		else
			flag = false;
		return flag;
	}
	public static boolean isRightTriangle(Triangle isRightTriangle) {//checking whether the triangle is Right angle Triangle.
		boolean flag = false;
		//obtaining the squares of the each side.
		double firstSideSqaure = Math.pow(isRightTriangle.getFirstSide(),2);
		double secondSideSquare = Math.pow(isRightTriangle.getSecondSide(), 2);
		double thirdSideSquare = Math.pow(isRightTriangle.getThirdSide(), 2);
		//checking whether the sqaure of third side is equal to the sum of the first and second side.
		int i=0;
		while(i != 3){
		if(isTriangle(isRightTriangle)){
			if(firstSideSqaure+secondSideSquare == thirdSideSquare)
				flag = true;
			//System.out.println("For iteration "+i+": "+firstSideSqaure+" + "+secondSideSquare+" = "+thirdSideSquare);
		}
		firstSideSqaure = secondSideSquare;
		secondSideSquare = thirdSideSquare;
		i++;
		}
		return flag;
	}
	public static boolean isScaleneTriangle(Triangle scaleneTriangle) {
		boolean flag = false;
		
			if(isTriangle(scaleneTriangle)){
				if((scaleneTriangle.firstSide != scaleneTriangle.secondSide) && (scaleneTriangle.secondSide != scaleneTriangle.thirdSide) && (scaleneTriangle.thirdSide != scaleneTriangle.firstSide))
					flag= true;
			}
			
		
		return flag;
	}
	public static boolean isIsoscelesTriangle(Triangle isoscelesTriangle) {
		boolean flag =false;
		int firstSide = isoscelesTriangle.firstSide;
		int secondSide = isoscelesTriangle.secondSide;
		int thirdSide = isoscelesTriangle.thirdSide;
		if(isTriangle(isoscelesTriangle)){
			if(firstSide == secondSide && firstSide == thirdSide)
				flag = false;
			else if((firstSide == secondSide)&&(firstSide != thirdSide) || (secondSide == thirdSide) &&(secondSide != firstSide) || (thirdSide == firstSide) && (thirdSide != secondSide))
				flag = true;
		}
		return flag;
	}
	public static boolean isEquilateral(Triangle equilateral) {
		boolean flag = false;
		if(isTriangle(equilateral)){
			if(equilateral.firstSide == equilateral.secondSide && equilateral.firstSide == equilateral.thirdSide)
				flag = true;
		}
		return flag;
	}

}
