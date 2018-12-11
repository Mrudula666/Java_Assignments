package corejava.assignments_1;

public class ArmstrongNumbersBetweenRange {

	public static boolean isArmstrong(int number) {//defining the isArmstrong().
			int sum = 0, original_number = number;
			while(number !=0){
			int remainder = number%10;//getting the remainder from number
			sum +=(remainder*remainder*remainder);//obtaining and cubing of the remainders
			number = number/10;//getting the remaining number
			}
		if(original_number == sum)//checking whether the number is equal to the original number. 
			return true;
		else
		return false;
	}
		
}
