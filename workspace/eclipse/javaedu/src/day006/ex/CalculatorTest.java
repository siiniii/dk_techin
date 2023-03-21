package day006.ex;

import java.util.Scanner;

class CalculatorExpr {
	private int num1;
	private int num2;

	CalculatorExpr(int num1, int num2) {
		this.num1 = num1;
		this.num2 = num2;
	}

	int getAddition() {
		return num1 + num2;
	}

	int getSubtraction() {
		return num1 - num2;
	}

	int getMultiplication() {
		return num1 * num2;
	}

	double getDivision() {
		return num1 / num2;
	}

	void setNum1(int num1) {
		this.num1 = num1;
	}

	void setNum2(int num2) {
		this.num2 = num2;
	}
}

public class CalculatorTest {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int end = 1;
		while (end == 1) {
			System.out.println("계산하고자하는 숫자 두개를 입력해주세요 : ");
			int number1 = sc.nextInt();
			int number2 = sc.nextInt();
			CalculatorExpr ce = new CalculatorExpr(number1, number2);
			System.out.printf("입력된 숫자 : %d, %d\n", number1, number2);
			System.out.printf("덧셈 : %d\n", ce.getAddition());
			System.out.printf("뺄셈 : %d\n", ce.getSubtraction());
			System.out.printf("곱셈 : %d\n", ce.getMultiplication());
			System.out.printf("나눗셈 : %f\n", ce.getDivision());
			System.out.println("계속하려면 숫자 1을 입력해주세요");
			sc.nextLine();
			end = sc.nextInt();
		}
		sc.close();
	}
}
