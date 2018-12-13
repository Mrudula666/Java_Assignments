package corejava.assignments_2;

public class ArrayIntegerAndInteger {

	public static int getResult(int[] number_array, int k) {
		int absolute_difference = 0;
		for(int i=0;i<number_array.length;i++){
			for(int j=i+1;j<number_array.length;j++){
				if(number_array[i] == number_array[j]){//checking for equal numbers
					absolute_difference = i-j;//obtaining the absolute difference 
				}
			}			
		}
		int result =0;
		if(absolute_difference<=k)
		result=absolute_difference;//checking whether absolute difference is atmost k value. 
		
		return result;//returning the aboslute_difference
		
	}

}
