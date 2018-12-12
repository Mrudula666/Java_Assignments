package corejava.assignmentstests_2;

import static org.junit.Assert.*;

import org.junit.Test;

import corejava.assignments_2.MissingNumberInTheArray;//importing corejava.assignments_2 package for MissingNumberInTheArray class.

public class MissingNumberTheArrayTest {

	@Test
	public void test() {
		int[] number_array = {3,0,1};//getting the input
		int answer = 2;
		int result = MissingNumberInTheArray.getResult(number_array);//call for the getResult() method in MissingNumberInTheArray class
		System.out.println(result);//displaying the output
		assertEquals(answer, result);
	}
	
	@Test
	public void test2() {
		int[] number_array = {9,6,4,2,3,5,7,0,1};//getting the input
		int answer = 8;
		int result = MissingNumberInTheArray.getResult(number_array);//call for the getResult() method in MissingNumberInTheArray class
		System.out.println(result);//displaying the output.
		assertEquals(answer, result);
	}

}
