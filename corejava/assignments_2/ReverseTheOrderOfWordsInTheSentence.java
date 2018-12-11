package corejava.assignments_2;

public class ReverseTheOrderOfWordsInTheSentence {

	public static String getReverse(String sentence) {
		String words[] = sentence.split(" ");//obtaining the words in the sentence
		String reverse_string = new String("");
		String word = new String("");
		for(int i=0;i<words.length;i++){//tracing the words in the sentence
			word = words[i];
			if(i==words.length-1)
				reverse_string += getReverseWord(word);
			else
				reverse_string += getReverseWord(word)+" ";
		}
		return reverse_string;
	}

	private static String getReverseWord(String word) {//reversing the each word.
		String reverse = new String("");
		char[] words = word.toCharArray();
		for(int i=words.length-1;i>=0;i--){
			reverse+=words[i];
		}
		return reverse;
	}

}
