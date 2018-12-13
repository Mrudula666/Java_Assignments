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
		String new_result[] = new String[count]; 
		String result_elements[] = new String[count];
		for(int i=0;i<test_elements.length;i++){
			if(isPalindrome(test_elements[i])){//checking whether the String is palindrome or not
				result_elements[k] = test_elements[i];
				++k;
			}
		}
		new_result=	sort(result_elements);//call for sorting the elements.
		for(int i=0;i<new_result.length;i++){
			if(i==new_result.length-1){
				System.out.print(new_result[i]+" ");
			}else
			System.out.print(new_result[i]+",");
		}
		return result_elements;
	}
	//Sorting the String array using the sequential sort
	private static String[] sort(String[] result_elements) {
		for(int i=0;i<result_elements.length;i++){
			for(int j=i+1;j<result_elements.length;j++){
				if(result_elements[i].charAt(0)<=result_elements[j].charAt(0)){
					String temp = result_elements[i];
					result_elements[i] = result_elements[j];
					result_elements[j] = temp;
				}
			}
		}
		
		return result_elements;
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
