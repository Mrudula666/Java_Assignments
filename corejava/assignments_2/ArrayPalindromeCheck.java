package corejava.assignments_2;



public class ArrayPalindromeCheck {

	public static int[] getResult(String[] test_elements) {
		int result[] = new int[10];
		int j=0;
		for(int i=0;i<test_elements.length;i++){
			if(isPalindrome(test_elements[i])){//checking whether the String is palindrome or not
				result[++j] = getCharCount(test_elements[i]);//calling for character count.
			}
			
		}
		int new_result[] = sort(result);//call for sorting the elements.
		return new_result;
	}

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

	private static int getCharCount(String string) {
		int count = string.length();
		System.out.println(count);
		
		return count;
	}

	private static boolean isPalindrome(String string) {
		String original = string;
		String reverse = new String("");
		char[] words = string.toCharArray();//converting the string to character array.
		for(int i=words.length-1;i>=0;i--){//revering the character array.
			reverse+=words[i];
		}
		if(reverse == original)//checking for palindrome.
		return true;
		else
			return false;
	}

}
