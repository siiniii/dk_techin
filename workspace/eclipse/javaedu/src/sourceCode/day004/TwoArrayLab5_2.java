package sourceCode.day004;

public class TwoArrayLab5_2 {
	public static void main(String[] args) {
		int[][] ary = new int[5][3];
		for (int i = 0; i < ary.length; i++) {
			for (int j = 0; j < ary[i].length; j++) {
				System.out.print(ary[i][j] + "\t");
			}
			System.out.println();
		}
		System.out.println();

		for (int i = 0; i < ary[0].length; i++) {
			for (int j = i; j < ary.length - i; j++) {
				ary[j][i] = i * (ary.length - i) + j + 1;
			}
		}
		for (int i = 0; i < ary.length; i++) {
			for (int j = 0; j < ary[i].length; j++) {
				System.out.print(ary[i][j] + "\t");
			}
			System.out.println();
		}
	}
}
