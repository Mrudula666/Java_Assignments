package corejava.day2assignmentstests;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import corejava.day2assignments.RectangleClass;

public class RectangleClassTest {
	private RectangleClass rectangle;
	private RectangleClass rectangle1;
	
	@Before
	public void setUp(){
		rectangle = new RectangleClass(12,13);//creating the rectangle instance using argumented constructor.
		rectangle1 = new RectangleClass(15,17);
		
	}
	@Test
	public void testForsettingLength() {
		int expectedLength = 666;
		rectangle.setLength(666);
		int length = rectangle.getLength();
		assertEquals(expectedLength, length);
	}
	
	@Test
	public void testForsettingBreadth() {
		int expectedBreadth = 176;
		rectangle.setBreadth(176);
		int breadth = rectangle.getBreadth();
		assertEquals(expectedBreadth, breadth);
	}

	@Test
	public void testForAreaOfRectangle() {
		double expectedArea = 156;
		double area = rectangle.areaCalculator();
		assertEquals(expectedArea, area, 2);
		
	}
	
	@Test
	public void testForPerimeterOfRectangle() {
		double expectedPerimeter = 50;
		double perimeter = rectangle.perimeterCalculator();
		assertEquals(expectedPerimeter, perimeter, 2);
		
	}
	@Test
	public void testForDifferentAreaOfTwoRectangles() {
		boolean flag = RectangleClass.areaComparator(rectangle.areaCalculator(),rectangle1.areaCalculator());
		System.out.println(flag);
		assertFalse(flag);
		
	}
	@Test
	public void testForSameAreaOfTwoRectangles() {
		boolean flag = RectangleClass.areaComparator(rectangle.areaCalculator(),rectangle.areaCalculator());
		assertTrue(flag);
		
	}

}
