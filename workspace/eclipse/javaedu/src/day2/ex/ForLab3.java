package day2.ex;

public class ForLab3 {

	public static void main(String[] args) {
		int x = (int) (Math.random() * 10) + 1;
		int y = (int) (Math.random() * 11) + 30;

		int sum = 0;

		for (int i = x; i <= y; i++) {
			if (i % 2 == 0)
				sum += i;
		}
		System.out.printf("%d부터 %d까지의 짝수의 합 : " + sum, x, y);
	}

}
