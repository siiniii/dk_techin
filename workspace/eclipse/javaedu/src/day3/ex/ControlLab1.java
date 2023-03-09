package day3.ex;

public class ControlLab1 {

	public static void main(String[] args) {

		int sum = 0;
		int count = 0;

		while (true) {
			int no = (int) (Math.random() * 11) + 10;
			if (no % 3 == 0 || no % 5 == 0) {
				for (int i = 1; i <= no; i++) {
					sum += no;
				}
				System.out.println(sum);
				count++;
				sum = 0;
			} else if (no == 11 || no == 17 || no == 19) {
				System.out.printf("%d회 반복함", count);
				break;
			} else {
				System.out.println("재수행");
				// continue;
			}
		}
	}

}

