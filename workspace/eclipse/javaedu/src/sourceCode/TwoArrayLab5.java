package sourceCode;

public class TwoArrayLab5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] arr = new int[5][3];

		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				System.out.print(arr[i][j] + "\t");
			}
			System.out.println();
		}

		System.out.println("------------------------");
		int num = 0;
		int len = arr.length;
		for (int i = 0; i < arr[0].length; i++) { // 열
			for (int j = i; j < len; j++) { // 행
				arr[j][i] = ++num;
			}
			len--;
		}

		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[0].length; j++) {
				System.out.print(arr[i][j] + "\t");

			}
			System.out.println();
		}
	}
}
