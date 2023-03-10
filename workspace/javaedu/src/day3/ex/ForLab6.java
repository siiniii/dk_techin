package day3.ex;

public class ForLab6 {

	public static void main(String[] args) {

		final char AND = '&';
		int no = (int) (Math.random() * 6) + 5;

		for (int i = 1; i <= no; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print(AND);
			}
			System.out.println();
		}

	}

}
