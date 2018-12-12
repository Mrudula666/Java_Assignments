package corejava.assignmentstests_2;

import static org.junit.Assert.*;

import org.junit.Test;

import corejava.assignments_2.StringArray;//importing the corejava.assignments_2 package for StringArray.

public class StringArrayTest {

	@Test
	public void testForOccurance() {
		String[] names = {"Dave", "Ann", "George", "Sam", "Ted", "Gag", "Saj", "Agati", "Mary", "Sam", 
					"Ayan", "Dev", "Kity", "Meery", "Smith", "Johnson", "Bill", "Williams","Ayan",
					"Jones", "Brown", "Davis", "Miller", "Wilson","George","Jackson","Ayan","Ayan",
						"Moore", "Taylor", "Anderson", "Thomas", "Jackson"};//getting the string array with the names.
		String name = "Ayan";
		int countOfOccurrence = StringArray.getOccurance(names,name);//calling the getOccurance() method in the StringArray class.
		System.out.println(countOfOccurrence);//printing the occurences.
		assertEquals(4, countOfOccurrence);//checking for the number of occurences.
	}

}
