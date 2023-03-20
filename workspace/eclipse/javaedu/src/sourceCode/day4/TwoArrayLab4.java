package sourceCode.day4;

/*1. TwoArrayLab4 라는 클래스를 만든다.
2. 다음 사양의 int 타입 2차원 배열을 생성한다.

    1행   10, 20, 30, 40, 50
    2행   5, 10, 15
    3행  11, 22, 33, 44
    4행  9, 8, 7, 6, 5, 4, 3, 2, 1

3. 행단위 합을 구하여 다음과 같이 출력한다.

    1행의 합은 x 입니다.
    2행의 합은 x 입니다.
    3행의 합은 x 입니다.
    4행의 합은 x 입니다.
*/
public class TwoArrayLab4 {

	public static void main(String[] args) {
		int[][] arr = { { 10, 20, 30, 40, 50 }, { 5, 10, 15 }, { 11, 22, 33, 44 }, { 9, 8, 7, 6, 5, 4, 3, 2, 1 } };
		int[] sum = new int[arr.length];

		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				sum[i] += arr[i][j];
			}
			System.out.printf("%d행의 합은 %d 입니다.\n", i + 1, sum[i]);
		}

		int sumV = 0;
		for (int i = 0; i < arr.length; i++) {
			sumV = 0;
			for (int j = 0; j < arr[i].length; j++) {
				sumV += arr[i][j];
			}
			System.out.printf("%d행의 합은 %d 입니다.\n", i + 1, sumV);
		}
	}

}
