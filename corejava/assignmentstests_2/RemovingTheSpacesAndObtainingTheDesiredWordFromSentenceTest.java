package corejava.assignmentstests_2;

import static org.junit.Assert.*;

import org.junit.Test;

import corejava.assignments_2.RemovingTheSpacesAndObtainingTheDesiredWordFromSentence;//importing corejava.assignments_2 package for RemovingTheSpacesAndObtainingTheDesiredWordFromSentence class.

public class RemovingTheSpacesAndObtainingTheDesiredWordFromSentenceTest {

	@Test
	public void test() {
		//getting the input
		String sentence ="  A    MORNING WALK IS A IS BLESSING FOR   THE  WHOLE DAY.";
		String wordToBeDeleted="IS";
		int position = 6;
		String result = RemovingTheSpacesAndObtainingTheDesiredWordFromSentence.getPosition(sentence,wordToBeDeleted,position);//implementing the getPosition() method to get the desired sentence
		assertEquals("A MORNING WALK IS A BLESSING FOR THE WHOLE DAY.", result);
		System.out.println(result);//displaying the result
	}

}
