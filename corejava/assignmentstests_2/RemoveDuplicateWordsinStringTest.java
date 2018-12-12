package corejava.assignmentstests_2;

import static org.junit.Assert.*;

import org.junit.Test;

import corejava.assignments_2.RemoveDuplicateWordsInString;//importing corejava.assignments_2 package for RemoveDuplicateWordsInString class.

public class RemoveDuplicateWordsinStringTest {

	@Test
	public void test() {
		String input = "abcabcabc";//getting the input
		String ex_output = "abc";//expected output
		String output = RemoveDuplicateWordsInString.getResult(input);//call for the getResult() method in RemoveDuplicateWordsInString class
		System.out.println(output);//displaying the output
	}

}
