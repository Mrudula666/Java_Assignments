package corejava.inheritance.assignmenttests;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import corejava.inheritance.assignments.Shape;
import corejava.inheritance.assignments.Triangle;

public class ShapeTest {
	private Shape triangle;
	private Shape polygon;
	private Shape circle;
	
	@Before
	public void setUp(){
		triangle = new Triangle();
	}

	@Test
	public void test() {
	}

}
