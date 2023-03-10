package day5.ex;

public class MethodLab6 {

	public static void main(String[] args) {
		int[][] numArr = { { 10, 20, 30 }, 
						   { 100, 500, 300, 200, 400 }, 
						   { 1, 10, 3, 4, 5, 8, 7, 6, 9, 2 } };

		for (int i = 0; i < numArr.length; i++) {
			System.out.printf("가장 큰 값은 %d 입니다.\n", maxNumArray(numArr[i]));
		}
	}

	static int maxNumArray(int[] numArr) {

		int max = numArr[0];
		for (int i = 1; i < numArr.length; i++) {
			if (max < numArr[i]) {
				max = numArr[i];
			}
		}
		return max;

	}
}
