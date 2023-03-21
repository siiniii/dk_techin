package sourceCode.day001;

public class Exercise1 {
	public static void main(String[] args) {
		int num1 = 10;
		int num2 = 25;
		int num3 = 33;

		System.out.println("합계 : " + (num1 + num2 + num3));
		System.out.println("평균 : " + (num1 + num2 + num3) / 3);

		int sum = num1 + num2 + num3;
		int avg = sum / 3;

		System.out.println("합계 : " + sum);
		System.out.println("평균 : " + avg);

		int x = 10;
		int y = 25;
		int z = 33;
		sum = x + y + z;
		System.out.println("합계 : " + sum);
		System.out.println("평균 : " + sum / 3);
	}
}
