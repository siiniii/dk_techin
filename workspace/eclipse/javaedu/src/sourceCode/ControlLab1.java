package sourceCode;

public class ControlLab1 {
	public static void main(String[] args) {
		int num;
		int sum = 0;
		int count = 0;
		while (true) {
			num = (int) (Math.random() * 11) + 10;
			if (num % 3 == 0 || num % 5 == 0) {
				for (int i = 1; i <= num; i++) {
					sum += i;
				}
				System.out.println(sum);
				sum = 0;
				count++;
			} else if (num == 11 || num == 17 || num == 19) {
				break;
			} else {
				System.out.println("재수행");
				continue;
			}
		}
		System.out.printf("%d회 반복함", count);
	}
}
