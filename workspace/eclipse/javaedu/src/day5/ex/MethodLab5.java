package day5.ex;

public class MethodLab5 {

	public static void main(String[] args) {

		for (int i = 1; i <= 5; i++) {
			if (i == 5) {
				System.out.print(getRandom(10));
			} else {
				System.out.print(getRandom(10) + ", ");
			}
		}

		System.out.println();
		for (int i = 1; i <= 5; i++) {
			if (i == 5) {
				System.out.print(getRandom(10, 20));
			} else {
				System.out.print(getRandom(10, 20) + ",");
			}
		}
	}

	public static int getRandom(int n) {
		int no1 = (int) (Math.random() * n) + 1;
		return no1;

	}

	public static int getRandom(int n1, int n2) {
		int no2 = (int) (Math.random() * (n2 - n1 + 1)) + n1;
		return no2;
	}
}
