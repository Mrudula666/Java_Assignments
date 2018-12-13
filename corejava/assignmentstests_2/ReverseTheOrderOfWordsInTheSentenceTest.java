package corejava.assignmentstests_2;

import static org.junit.Assert.*;


import org.junit.Test;

import corejava.assignments_2.ReverseTheOrderOfWordsInTheSentence;//importing corejava.assignments_2 package for ReverseTheOrderOfWordsInTheSentence class.

public class ReverseTheOrderOfWordsInTheSentenceTest {

	@Test
	public void orderTest() {
		String reverse_sentence = ReverseTheOrderOfWordsInTheSentence.getReverse("Let's take LeetCode contest");//call for getReverse() from ReverseTheOrderOfWordsInTheSentence class.
		System.out.println(reverse_sentence);//displaying the result
		assertEquals("s'teL ekat edoCteeL tsetnoc", reverse_sentence);//checking the output
		
		
	}
	
	@Test
	public void orderForNumberStringTest() {
		String reverse_sentence = ReverseTheOrderOfWordsInTheSentence.getReverse("1234");//call for getReverse() from ReverseTheOrderOfWordsInTheSentence class.
		System.out.println(reverse_sentence);//displaying the result
		assertEquals("4321", reverse_sentence);//checking the output
		
		
	}
	
	@Test
	public void orderForNoStringTest() {
		String reverse_sentence = ReverseTheOrderOfWordsInTheSentence.getReverse("");//call for getReverse() from ReverseTheOrderOfWordsInTheSentence class.
		System.out.println(reverse_sentence);//displaying the result
		assertEquals("", reverse_sentence);//checking the output
		
		
	}

}
