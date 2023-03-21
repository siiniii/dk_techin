package day003.ex;

public class ForLab8 {

	public static void main(String[] args) {
		final char STAR = '*';

		for (int i = 1; i <= 5; i++) {
			for (int j = 1; j <= 10; j++) {
				System.out.print(STAR);
			}
			System.out.println();
		}

		System.out.println("-- 다른코드 --");
		/////////////////////////////////////
		
		for (int col = 1; col <= 5; col++) {
			for (int row = 0; row < col - 1; row++) {
				System.out.print(' ');
			}
			for (int row = 1; row <= 10; row++) {
				System.out.print(STAR);
			}
			System.out.println();
		}
	}

}
