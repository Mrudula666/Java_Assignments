import static org.junit.Assert.*;

import org.junit.Test;


public class sample {

	@Test
	public void test() {
		String message = Message.getMessage();
		assertEquals("Hello",message );
	}
}
