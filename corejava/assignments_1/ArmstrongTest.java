package corejava.assignments_1;

import static org.junit.Assert.*;

import java.util.Scanner;

import org.junit.Test;

public class ArmstrongTest {
	Scanner scan = new Scanner(System.in);
	int number = scan.nextInt();
	@Test
	public void armstrongTest() {
		boolean flag = ArmstrongNumber.isArmStrong(number);
		assertTrue(flag);
	}

}
