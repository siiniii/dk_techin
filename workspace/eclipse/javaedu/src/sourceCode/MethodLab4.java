package sourceCode;

public class MethodLab4 {
	public static void main(String[] args) {
		int executeCount = 5;
		while (executeCount > 0) {
			int randomNum1 = (int) (Math.random() * 30 + 1);
			int randomNum2 = (int) (Math.random() * 30 + 1);
			int biggerNum = getDifference(randomNum1, randomNum2);
			System.out.printf("%d 와 %d 의 차는 %d 입니다.\n", randomNum1, randomNum2, biggerNum);
			executeCount--;
		}
	}

	static int getDifference(int num1, int num2) {
		if (num1 > num2) {
			return num1 - num2;
		} else if (num1 < num2) {
			return num2 - num1;
		} else {
			return 0;
		}
	}
}
