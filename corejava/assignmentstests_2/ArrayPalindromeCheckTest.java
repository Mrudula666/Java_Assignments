package corejava.assignmentstests_2;

import static org.junit.Assert.*;

import org.junit.Assert;
import org.junit.Test;

import corejava.assignments_2.ArrayPalindromeCheck;//importing corejava.assignments_2 package for ArrayPalindromeCheck class.

public class ArrayPalindromeCheckTest {
	

	@Test
	public void testForPalindromeAndChars() {
		String[] test_elements = {"amma","sas","pop","elle","tet","ele","Lost","dad","king","post"};//getting input
		String[] expected_result = {"tet","sas","pop","ele","elle","dad","amma"};
		String[] result = ArrayPalindromeCheck.getResult(test_elements);//call for the getResult() method in  ArrayPalindromeCheck class.
		Assert.assertArrayEquals(expected_result, result);
	}
	
	
	@Test
	public void testForNoPalindrome() {
		String[] test_elements = {"Mrudula","Vineela","Atchyuth"};//getting input
		String[] expected_result = {};
		String[] result = ArrayPalindromeCheck.getResult(test_elements);//call for the getResult() method in  ArrayPalindromeCheck class.
		Assert.assertArrayEquals(expected_result, result);
	}
	
	@Test
	public void testForNumberPalindromeAndChars() {
		String[] test_elements = {"121","676","1234"};//getting input
		String[] expected_result = {"676","121"};
		String[] result = ArrayPalindromeCheck.getResult(test_elements);//call for the getResult() method in  ArrayPalindromeCheck class.
		Assert.assertArrayEquals(expected_result, result);
	}
	
	@Test
	public void testForNumberAndStringPalindromeAndChars() {
		String[] test_elements = {"121","676","1234","sas","pop","elle","tet","ele","Lost"};//getting input
		String[] expected_result = {"tet","sas","pop","ele","elle","676","121"};
		String[] result = ArrayPalindromeCheck.getResult(test_elements);//call for the getResult() method in  ArrayPalindromeCheck class.
		Assert.assertArrayEquals(expected_result, result);
	}
			
	}
