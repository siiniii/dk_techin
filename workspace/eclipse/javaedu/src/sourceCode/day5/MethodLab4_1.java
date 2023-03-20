package sourceCode.day5;

public class MethodLab4_1 {
	public static void main(String[] args) {
		int num1 = 0;
		int num2 = 0;
		for (int i = 0; i < 5; i++) {
			num1 = (int) (Math.random() * 30) + 1;
			num2 = (int) (Math.random() * 30) + 1;
			System.out.printf("%d 와 %d의 차는 %d 입니다.\n", num1, num2, minus(num1, num2));
		}
	}

	static int minus(int num1, int num2) {
		if (num1 > num2)
			return num1 - num2;
		else
			return num2 - num1;
	}
}
