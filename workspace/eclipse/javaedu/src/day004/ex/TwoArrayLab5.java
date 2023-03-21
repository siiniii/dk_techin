package day004.ex;

public class TwoArrayLab5 {

	public static void main(String[] args) {
		int[][] no = new int[5][3];
		
		for (int i = 0; i < no.length; i++) {
			for (int j = 0; j < no[i].length; j++)
				System.out.print(no[i][j] + "\t");
			System.out.println();
		}
		
		System.out.println();
		
		for (int i = 0; i < no[0].length; i++) {
			for (int j = i; j < no.length - i; j++) {
				no[j][i] = i * (no.length - i) + j + 1;
			}
		}
		
		for (int i = 0; i < no.length; i++) {
			for (int j = 0; j < no[i].length; j++) {
				System.out.print(no[i][j] + "\t");
			}
			System.out.println();
		}
		
		
		
		
	}

}
