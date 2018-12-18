package corejava.day3assignmentstests;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import corejava.day3assignments.Person;

public class PersonTest {
	private Person person;
	private Person person1;
	
	@Before
	public void setUp(){
		person = new Person("Mrudula", 6, 2,1996);
		person1 = new Person("Vineela", 17,9,1999);
		
	}

	@Test
	public void testForDisplay() {
		person.display();
		person1.display();
	}
	@Test
	public void testForOlderOne() {
	person.olderOne(person1);
	}

}
