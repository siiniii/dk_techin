package sourceCode.day5;

public class MethodLab3 {
	public static void main(String[] args) {
		boolean answer1 = isEven(10);
		System.out.printf("%d은 %s 입니다.", 10, answer1 ? "짝수" : "홀수");

		System.out.println();

		// boolean answer2 = isEven(13);
		System.out.printf("%d은 %s 입니다.", 13, isEven(13) ? "짝수" : "홀수");
	}

	static boolean isEven(int num) {
		if (num % 2 == 0) {
			return true;
		}
		return false;
	}
}
