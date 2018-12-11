import static org.junit.Assert.*;

import org.junit.Test;


public class PrimeNumberTest {
	
	int number = 11;

	@Test
	public void primeTest() {
		boolean flag = PrimeNumber.isPrime(number);
		assertTrue(flag);
	}

}
