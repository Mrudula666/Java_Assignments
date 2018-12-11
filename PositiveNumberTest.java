import static org.junit.Assert.*;

import org.junit.Test;


public class PositiveNumberTest {
	int number = 12;

	@Test
	public void NumberTest() {
		boolean flag = PositiveNumbers.isPositive(number);
		assertTrue(flag);	
		
	}

}
