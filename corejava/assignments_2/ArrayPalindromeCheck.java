package corejava.assignments_2;


public class ArrayPalindromeCheck {

	public static String[] getResult(String[] test_elements) {
		int j=0;
		
		int k=0;
		int count =0;
		for(int i=0;i<test_elements.length;i++){
			if(isPalindrome(test_elements[i])){//checking whether the String is palindrome or not
				count++;//getting palindrome count.
			}
			}
		int result[] = new int[count];
		for(int i=0;i<test_elements.length;i++){
			if(isPalindrome(test_elements[i])){//checking whether the String is palindrome or not
				result[j] = getCharCount(test_elements[i]);//calling for character count.
				++j;
			}
			}
		int new_result[] = new int[count]; 
		new_result=	sort(result);//call for sorting the elements.
		String result_elements[] = new String[count];
		for(int i=0;i<test_elements.length;i++){
			if(isPalindrome(test_elements[i])){//checking whether the String is palindrome or not
				result_elements[k] = test_elements[i];
				++k;
			}
		}
		return result_elements;
	}
	//Sorting the array using the sequential sort
	private static int[] sort(int[] result) {
		for(int i=0;i<result.length;i++){
			for(int j=i+1;j<result.length;j++){//sorting the array.
				if(result[i]<=result[j]){
					int temp = result[i];
					result[i] = result[j];
					result[j] =temp;
				}
			}
		}
		return result;
	}
//getting the character count of palindrome
	private static int getCharCount(String string) {
		int count = string.length();
		//System.out.print(count+" ");
		return count;
	}
//Checking for palindrome.
	private static boolean isPalindrome(String string) {
		String original = string;
		String reverse = new String("");
		char[] words = string.toCharArray();//converting the string to character array.
		for(int i=words.length-1;i>=0;i--){//reversing the character array.
			reverse+=words[i];
		}
		/*if(reverse == original)//checking for palindrome.
		return true;
		else
			return false;*/
		if(reverse.equalsIgnoreCase(original))
			return true;
			else
				return false;
	}

}
