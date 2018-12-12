package corejava.assignments_2;

public class MultiDemensionalArray {

	public static int getResult(int[][] number_matrix,
			int numberToBeSearched) {
		int number = 0;
		for(int i=0;i<number_matrix.length;i++){
			for(int j=0;j<number_matrix[i].length;j++){
				if(number_matrix[i][j] == numberToBeSearched)//checking for number in the matrix.
					number = number_matrix[i][j];//assigning the number found to the number variable.
			}
		}
		return number;//returning the number.
	}

}
