package sourceCode.day005;

public class MethodLab2 {
	public static void main(String[] args) {
		printTriangle('@', 3);
		printTriangle('%', 4);
		printTriangle('A', 5);

		printchar('@', 3);
		printchar('%', 4);
		printchar('A', 5);
	}

	static void printTriangle(char c, int row) {
		for (int i = 0; i < row; i++) {
			for (int blackCount = row; blackCount > i; blackCount--) {
				System.out.print(" ");
			}
			for (int charCount = 0; charCount <= i; charCount++) {
				System.out.print(c);
			}
			System.out.println();
		}
		System.out.println();
	}

	static void printchar(char arg1, int arg2) {
		for (int i = 0; i < arg2; i++) {
			// 공백넣기
			for (int k = 0; k < arg2 - i; k++) {
				System.out.print(" ");
			}
			// 문자 출력
			for (int j = 0; j < i + 1; j++) {
				System.out.print(arg1);
			}
			System.out.println();
		}
		System.out.println();
	}
}
