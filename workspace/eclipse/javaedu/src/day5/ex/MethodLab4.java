package day5.ex;

public class MethodLab4 {

	public static void main(String[] args) {
		int no1 = 0;
		int no2 = 0;

		for (int i = 1; i <= 5; i++) {
			no1 = (int) (Math.random() * 30) + 1;
			no2 = (int) (Math.random() * 30) + 1;
			System.out.printf("%d와 %d의 차는 %d입니다.\n", no1, no2, minus(no1, no2));
		}
	}

	static int minus(int x, int y) {
		if (x > y) {
			return x - y;
		} else {
			return y - x;
		}

	}

}
