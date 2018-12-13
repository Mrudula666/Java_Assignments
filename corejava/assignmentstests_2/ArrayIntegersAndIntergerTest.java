package corejava.assignmentstests_2;

import static org.junit.Assert.*;

import org.junit.Test;

import corejava.assignments_2.ArrayIntegerAndInteger;//importing corejava.assignments_2 package for ArrayIntegerAndInteger class.

public class ArrayIntegersAndIntergerTest {

	@Test
	public void ResultValueShouldBeAtmostK() {
		int[] number_array = {1,2,4,5,6,1,7,8,9,10};//getting input
		int k=2;//getting the value of k.
		int result = ArrayIntegerAndInteger.getResult(number_array,k);//call for the getResult() in ArrayIntgerAndInteger class
		if(result<=k){
			k=result;
		}
		System.out.println(result);
		assertEquals(k, result);
	}
	
	@Test
	public void ResultValueForDistictValues() {
		int[] number_array = {1,2,4,5,6,7,8,9,10};
		int k=2;
		int result = ArrayIntegerAndInteger.getResult(number_array,k);
		System.out.println(result);
	}
	
	@Test
	public void ResultValueForMoreThanOneSimilarValues() {
		int[] number_array = {1,2,4,4,1,5,6,7,8,9,10};
		int k=2;
		int result = ArrayIntegerAndInteger.getResult(number_array,k);
		System.out.println(result);
	}
	

}
