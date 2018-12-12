package corejava.assignmentstests_2;

import static org.junit.Assert.*;

import org.junit.Test;
import corejava.assignments_2.*;//importing the corejava.assignments_2. package for MultiDemensionalArray

public class MultiDimensionalArrayTest {

	@Test
	public void testForNumberInTheMatrix() {
		int[][] number_matrix = {{2,3,1},{5,7,8}};//getting the number matrix.
		int numberToBeSearched = 8;
		int result = MultiDemensionalArray.getResult(number_matrix,numberToBeSearched);//call for the getResult method in the MultidemensionalArray class.
		System.out.println(result);
		assertEquals(numberToBeSearched, result);//checking the output
	}

}
