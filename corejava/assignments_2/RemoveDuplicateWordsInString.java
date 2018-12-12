package corejava.assignments_2;

public class RemoveDuplicateWordsInString {

	public static String getResult(String input) {
		String result = new String("");
		for(int i=0;i<input.length()-1;i++){
			if(!result.contains(String.valueOf(input.charAt(i)))){//checking and concating the characters in the result variable if condition satisfied. 
				result +=input.charAt(i);
			}
		}
		return result.trim();//returning the output
	}

}
