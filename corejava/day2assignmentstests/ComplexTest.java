package corejava.day2assignmentstests;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import corejava.day2assignments.Complex;

public class ComplexTest {
	private Complex complexNumber1;
	private Complex complexNumber2;
	private Complex complexSum;
	
	//created three complex objects
	@Before
	public void main(){
		complexNumber1 = new Complex();
		complexNumber2 = new Complex();
		complexSum = new Complex();
	}
	@Test
	public void testForPositiveRealNumbersAndPositiveImaginary() {
		complexNumber1.set(1, -9);
		complexNumber1.disp();
	}
                                    
	@Test
	public void testForNegativeRealNumbersAndNegativeImaginary() {
		complexNumber1.set(-1, -9);
		complexNumber1.disp();
	}
	
	@Test
	public void testForPositiveRealNumbersAndNegativeImaginary() {
		complexNumber1.set(1, -9);
		complexNumber1.disp();
	}
	
	@Test
	public void testForsumfunction() {
		complexNumber1.set(3.56f, 4.50f);
		complexNumber2.set(3.45f, 7.89f);
		complexSum = Complex.sum(complexNumber1,complexNumber2);
		complexSum.disp();
	}
	
	@Test
	public void testForsumfunctionForNegitiveRealAndImaginaryNumbers() {
		complexNumber1.set(-3.56f, -4.50f);
		complexNumber2.set(-3.45f, -7.89f);
		complexSum = Complex.sum(complexNumber1,complexNumber2);
		complexSum.disp();
	}
	
	@Test
	public void testForsumfunctionForOnePositiveAndOneNegativeRealAndImaginaryNumbers() {
		complexNumber1.set(3.56f, 4.50f);
		complexNumber2.set(-3.45f, -7.89f);
		complexSum = Complex.sum(complexNumber1,complexNumber2);
		complexSum.disp();
	}

}
