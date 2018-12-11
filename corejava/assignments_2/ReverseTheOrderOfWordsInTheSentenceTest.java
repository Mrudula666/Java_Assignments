package corejava.assignments_2;

import static org.junit.Assert.*;

import java.util.Scanner;

import org.junit.Test;

public class ReverseTheOrderOfWordsInTheSentenceTest {

	@Test
	public void orderTest() {
		String reverse_sentence = ReverseTheOrderOfWordsInTheSentence.getReverse("Let's take LeetCode contest");
		System.out.println(reverse_sentence);
		assertEquals("s'teL ekat edoCteeL tsetnoc", reverse_sentence);
		
		
	}

}
