package sourceCode.day004;

public class TwoArrayLab5_5 {

	public static void main(String[] args) {
		int[][] twoArr = new int[5][3];
		for (int i = 0; i < twoArr.length; i++) {
			for (int j = 0; j < twoArr[0].length; j++) {
				System.out.print(twoArr[i][j] + "\t");
			}
			System.out.println();
		}

		int cnt = 1;
		int jCnt = 0;

		for (int i = 0; i < twoArr[0].length; i++) { // 0 ~ 2 : 3
			for (int j = jCnt; j < twoArr.length - jCnt; j++) { // 0 ~ 4 : 5
				twoArr[j][i] = cnt;
				cnt++;
			}
			jCnt++;
		}

		System.out.println();
		for (int i = 0; i < twoArr.length; i++) {
			for (int j = 0; j < twoArr[0].length; j++) {
				System.out.print(twoArr[i][j] + "\t");
			}
			System.out.println();
		}
	}

}
