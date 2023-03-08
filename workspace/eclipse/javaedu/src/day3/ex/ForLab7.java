package day3.ex;

public class ForLab7 {

	public static void main(String[] args) {
		final char STAR = '*';

		for (int i = 1; i <= 7; i++) {
			for (int j = i; j <= 7; j++) {
				System.out.print(STAR);
			}
			System.out.println();
		}
	}

}
