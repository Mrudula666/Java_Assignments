package corejava.assignments_2;

import static org.junit.Assert.*;

import java.util.Scanner;

import org.junit.Test;

public class ArrayPalindromeCheckTest {
	

	@Test
	public void test() {
		String[] test_elements = {"amma","sas","pop","rest","test","ele","Lost","DAD","king","post"};
		int[] result = ArrayPalindromeCheck.getResult(test_elements);
		/*for(int i=0;i<result.length;i++){
			System.out.print(result[i]+" ");
		}*/
		
	}

}
