package corejava.assignments_1;

import static org.junit.Assert.*;

import org.junit.Test;

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
