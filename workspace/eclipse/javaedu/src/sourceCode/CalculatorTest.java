package sourceCode;

import java.util.Scanner;

public class CalculatorTest {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num1, num2;
		System.out.println("숫자 두 개를 입력하세요");
		num1 = sc.nextInt();
		num2 = sc.nextInt();
		CalculatorExpr calc = new CalculatorExpr(num1, num2);
		System.out.printf("입력된 숫자 : %d, %d\n", num1, num2);
		System.out.printf("덧셈 : %d\n", calc.getAddition());
		System.out.printf("뺄셈 : %d\n", calc.getSubtraction());
		System.out.printf("곱셈 : %d\n", calc.getMultiplication());
		System.out.printf("나눗셈 : %.2f\n", calc.getDivision());
		System.out.println("계속 하려면 1번 아니면 0번을 누르세요");
		int stop = sc.nextInt();
		if (stop == 0) {
			sc.close();
			return;
		}

		while (true) {
			System.out.println("숫자 두 개를 입력하세요");
			num1 = sc.nextInt();
			num2 = sc.nextInt();
			calc.setNum1(num1);
			calc.setNum2(num2);
			System.out.printf("입력된 숫자 : %d, %d\n", num1, num2);
			System.out.printf("덧셈 : %d\n", calc.getAddition());
			System.out.printf("뺄셈 : %d\n", calc.getSubtraction());
			System.out.printf("곱셈 : %d\n", calc.getMultiplication());
			System.out.printf("나눗셈 : %.2f\n", calc.getDivision());

			System.out.println("계속 하려면 1번 아니면 0번을 누르세요");
			stop = sc.nextInt();
			if (stop == 0)
				break;
		}

		sc.close();
	}

}
