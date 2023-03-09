package day4.ex;

public class TwoArrayLab4 {

	public static void main(String[] args) {
		int no[][] = {
		         { 10, 20, 30, 40, 50},
		         { 5, 10, 15},
		         { 11, 22, 33, 44},
		         { 9, 8, 7, 6, 5, 4, 3, 2, 1}
              };

		int[] row = new int[4];
		for (int i = 0; i < no.length; i++) {
			for (int j = 0; j < no[i].length; j++) {
				row[i] += no[i][j];
			}
			
			System.out.printf("%d행의 합은 %d입니다.\n", i+1 ,row[i]);
			
		}
		
	}

}
