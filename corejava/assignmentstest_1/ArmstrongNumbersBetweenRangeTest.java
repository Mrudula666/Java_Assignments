package corejava.assignmentstest_1;

import static org.junit.Assert.*;

import org.junit.Test;

import corejava.assignments_1.ArmstrongNumbersBetweenRange;

public class ArmstrongNumbersBetweenRangeTest {

	@Test
	public void test() {
		for(int i=100;i<=999;i++){
			if(ArmstrongNumbersBetweenRange.isArmstrong(i)){
				System.out.print(i+",");
			}
		}
	}

}
