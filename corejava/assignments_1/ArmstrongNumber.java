package corejava.assignments_1;


public class ArmstrongNumber {
	
	public static boolean isArmStrong(int number) {
		int sum = 0,original_number = number;
		while(number!=0){
			int remainder = number%10;
			sum +=Math.pow(remainder,getDigits(original_number));
			number = number/10;
		}
		if(sum == original_number)
			return true;
		else
			return false;
	}

	private static int getDigits(int number) {
		int count =0;
		while(number!=0){
			number = number/10;
			count ++;
		}
		return count;
	}
	

}
