package sourceCode.day4;

public class TwoArrayLab5_3 {
	public static void main(String[] args) {
		int array[][] = new int[5][3];
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[0].length; j++) {
				System.out.print(array[i][j] + "\t");
			}
			System.out.println();
		}
		System.out.println();
		int number = 1;
		for (int i = 0; i < array[0].length; i++) {
			for (int j = 0; j < array.length; j++) {
				if (i <= j && i + j < 5) {
					array[j][i] = number;
					number++;
				}
			}
		}
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[0].length; j++) {
				System.out.print(array[i][j] + "\t");
			}
			System.out.println();
		}
	}
}
