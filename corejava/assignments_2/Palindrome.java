package corejava.assignments_2;

public class Palindrome {

	public static boolean isPalindrome(int i) {
		int reverse = 0,remainder =0,number = i;//Initializing and declaring the necessary variables.
		boolean flag =false;
		if(i<0){
			flag = false;
		}else{
		while(i!=0){//reversing the number 
			remainder = i%10;
			reverse = (reverse*10)+(remainder);
			i = i/10;
		}
		if(reverse == number) {//checking for original number.
			flag = true;
		}else
			flag = false;
		}
		System.out.println(flag);
		return flag;
		
	}

}
