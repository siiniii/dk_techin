package sourceCode.day006;

import java.util.Scanner;

public class GradeTest {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		int count = scanner.nextInt();
		int[] arr = new int[count];
		for (int i = 0; i < count; i++) {
			arr[i] = scanner.nextInt();
		}

		GradeExpr gradeExpr = new GradeExpr(arr);

		System.out.printf("점수들 : %d", arr[0]);
		for (int i = 1; i < arr.length; i++) {
			System.out.printf(", %d", arr[i]);
		}
		System.out.println();
		System.out.printf("총점 : %d\n", gradeExpr.getTotal());
		System.out.printf("평균 : %f\n", gradeExpr.getAverage());
		System.out.printf("최고점수 : %d\n", gradeExpr.getGoodScore());
		System.out.printf("최저점수 : %d\n", gradeExpr.getBadScore());
		scanner.close();
	}
}
