package corejava.assignmentstests_2;

import static org.junit.Assert.*;

import org.junit.Test;

import corejava.assignments_2.RemovingTheSpacesAndObtainingTheDesiredWordFromSentence;//importing corejava.assignments_2 package for RemovingTheSpacesAndObtainingTheDesiredWordFromSentence class.

public class RemovingTheSpacesAndObtainingTheDesiredWordFromSentenceTest {

	@Test
	public void test1() {
		//getting the input
		String sentence ="  A    MORNING WALK IS A IS BLESSING FOR   THE  WHOLE DAY.";
		String wordToBeDeleted="IS";
		int position = 6;
		String result = RemovingTheSpacesAndObtainingTheDesiredWordFromSentence.getPosition(sentence,wordToBeDeleted,position);//implementing the getPosition() method to get the desired sentence
		assertEquals("A MORNING WALK IS A BLESSING FOR THE WHOLE DAY.", result);
		
	}
	
	@Test
	public void test2() {
		//getting the input
		String sentence =" AS YOU    SOW, SO   SO YOU REAP.";
		String wordToBeDeleted="SO";
		int position = 4;
		String result = RemovingTheSpacesAndObtainingTheDesiredWordFromSentence.getPosition(sentence,wordToBeDeleted,position);//implementing the getPosition() method to get the desired sentence
		assertEquals("AS YOU SOW, SO YOU REAP.", result);
	}

}
