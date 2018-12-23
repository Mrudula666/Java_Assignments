package corejava.assignments_2;

public class RemovingTheSpacesAndObtainingTheDesiredWordFromSentence {

	public static String getPosition(String sentence, String wordToBeDeleted,int position) {
		sentence = sentence.trim();
		String new_sentence = new String(" "); 
		sentence = sentence.replaceAll("\\s+"," ");//removing the extra spaces in between the sentence.
		String[] parts= sentence.split(" ");//spliting the sentence into parts
		position--;
		for(int i=0;i<parts.length;i++){
			if(i == position && parts[i].equals(wordToBeDeleted))//checking for the poisition in the array of the parts.
				continue;
				//System.out.println(parts[i]);
			new_sentence += parts[i]+" ";//adding the remaining words to the new_sentence except the position word given.
		}
		System.out.println(new_sentence.trim());//displaying the result
		return new_sentence.trim();
	}
}
