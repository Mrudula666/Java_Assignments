package corejava.assignments_2;

public class StringArray {

	public static int getOccurance(String[] names, String name) {
		int count =0;
		for(int i=0;i<names.length;i++){
			if(names[i].equals(name))//counting the occurance of the name given
				count++;
		}
		return count;//returning the count.
	}

}
