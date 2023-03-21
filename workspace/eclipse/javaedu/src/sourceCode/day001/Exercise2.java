package sourceCode.day001;

public class Exercise2 {

	public static void main(String[] args) {
		int num1 = 35;
		int num2 = 10;

		System.out
				.println(num1 + " 를 " + num2 + " 으로 나눈 결과 몫은 " + (num1 / num2) + " 이고 나머지는 " + (num1 % num2) + " 입니다.");

		int x = 35;
		int y = 10;
		int divide = x / y;
		int remain = x % y;

		System.out.printf("%d 를 %d 으로 나눈 결과 몫은 %d 이고 나머지는 %d 입니다.", x, y, divide, remain);
	}
}
