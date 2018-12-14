package corejava.day2assignmentstests;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import corejava.day2assignments.Complex;

public class ComplexTest {
	private Complex complexNumber1;
	private Complex complexNumber2;
	private Complex complexSum;
	
	@Before
	public void main(){
		complexNumber1 = new Complex();
		complexNumber2 = new Complex();
		complexSum = new Complex();
		complexNumber1.set(3.56f, 4.50f);
		complexNumber2.set(3.45f, 7.89f);
	}
                                    
	@Test
	public void testForsetfunction() {
		complexNumber1.set(3.56f, 4.50f);
		complexNumber2.set(3.45f, 7.89f);
	}
	
	@Test
	public void testFordispfunction() {
		complexNumber1.disp();
		complexNumber2.disp();
	}
	
	@Test
	public void testForsumfunction() {
		complexSum = Complex.sum(complexNumber1,complexNumber2);
		complexSum.disp();
	}

}
