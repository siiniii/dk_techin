package day3.ex;

public class ForLab5 {

	public static void main(String[] args) {

		int x = (int) (Math.random() * 8) + 3;
		int y = (int) (Math.random() * 3) + 1;

		if (y == 1) {
			for (int i = 1; i <= x; i++) {
				System.out.print("*");
			}
		} else if (y == 2) {
			for (int i = 1; i <= x; i++) {
				System.out.print("&");
			}
		} else {
			for (int i = 1; i <= x; i++)
				System.out.print("#");
		}
		
		System.out.println();
		System.out.println("-- 다른코드 --");
		
		//////////////////////////////////////
		
		char c;
		if (x == 1) c = '*';
		else if(x == 2) c = '&';
		else c = '#';
		
		for (int i = 1; i <= x; i++) {
			System.out.print(c);
		}
	}

}
