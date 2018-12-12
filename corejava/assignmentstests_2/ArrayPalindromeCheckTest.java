package corejava.assignmentstests_2;

import static org.junit.Assert.*;

import org.junit.Test;

import corejava.assignments_2.ArrayPalindromeCheck;//importing corejava.assignments_2 package for ArrayPalindromeCheck class.

public class ArrayPalindromeCheckTest {
	

	@Test
	public void test() {
		String[] test_elements = {"amma","sas","pop","elle","tet","ele","Lost","DAD","king","post"};//getting input
		//String[] expected_result = {"amma","sas","pop","tet","ele","DAD"};
		String[] result = ArrayPalindromeCheck.getResult(test_elements);//call for the getResult() method in  ArrayPalindromeCheck class.
		for(int i=0;i<result.length;i++){
			System.out.print(result[i]+" ");//displaying the obtainted output
		}
		
	}

}
