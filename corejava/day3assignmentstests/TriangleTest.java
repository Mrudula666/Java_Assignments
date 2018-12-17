package corejava.day3assignmentstests;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import corejava.day3assignments.Triangle;

public class TriangleTest {
	private Triangle triangle;
	private Triangle rightTriangle;
	private Triangle scaleneTriangle;
	private Triangle isoscelesTriangle;
	private Triangle equilateral;
	
	
	@Before
	public void setUp(){
		triangle = new Triangle(2,7,12);
		rightTriangle = new Triangle(4,3,5);
		scaleneTriangle = new Triangle(5,6,7);
		isoscelesTriangle = new Triangle(5,6,7);
		equilateral = new Triangle(6,6,6);		
	}

	@Test
	public void testForTriangle() {
		boolean result = Triangle.isTriangle(triangle);
		assertFalse(result);
	}
	
	@Test
	public void testForRightTriangle() {
		boolean result = Triangle.isRightTriangle(rightTriangle);
		System.out.println(result);
		assertTrue(result);
	}
	
	@Test
	public void testForScaleneTriangle() {
		boolean result = Triangle.isScaleneTriangle(scaleneTriangle);
		System.out.println(result);
		assertTrue(result);
	}
	
	@Test
	public void testForIsoscelesTriangle() {
		boolean result = Triangle.isIsoscelesTriangle(isoscelesTriangle);
		System.out.println(result);
		assertTrue(result);
	}
	
	

}
