package corejava.assignments_2;

public class MissingNumberInTheArray {

	public static int getResult(int[] number_array) {
		int result =0;
		int[] sorted_array = sort(number_array);//call for sort method.
		for(int i=sorted_array.length-1;i>0;i--){
			
			if(i!=sorted_array[i]){//checking for the missing number in the given array.
				result = i;
				//System.out.println(result);
				break;
			}
		}
		return result;//returning the result
	}
	private static int[] sort(int[] number_array) {
		for(int i=0;i<number_array.length;i++){
			for(int j=i+1;j<number_array.length;j++){//sorting the array.
				if(number_array[i]<=number_array[j]){
					int temp = number_array[i];//swapping the numbers if the condition satisfied
					number_array[i] = number_array[j];
					number_array[j] =temp;
				}
			}
		}
		return number_array;//returning the number array.
	}

}
