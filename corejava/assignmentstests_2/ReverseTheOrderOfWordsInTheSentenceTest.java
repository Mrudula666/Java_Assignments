package corejava.assignmentstests_2;

import static org.junit.Assert.*;


import org.junit.Test;

import corejava.assignments_2.ReverseTheOrderOfWordsInTheSentence;//importing corejava.assignments_2 package for ReverseTheOrderOfWordsInTheSentence class.

public class ReverseTheOrderOfWordsInTheSentenceTest {

	@Test
	public void orderTest() {
		String reverse_sentence = ReverseTheOrderOfWordsInTheSentence.getReverse("Let's take LeetCode contest");//call for getReverse() from ReverseTheOrderOfWordsInTheSentence class.
		System.out.println(reverse_sentence);//displaying the result
		assertEquals("s'teL ekat edoCteeL tsetnoc", reverse_sentence);
		
		
	}

}
