package day002.ex;

public class ForLab4 {

	public static void main(String[] args) {
		int evenNum = 0;
		int oddNum = 0;

		for (int i = 1; i < 101; i++) {
			if (i % 2 == 0) {
				evenNum += i;
			} else {
				oddNum += i;
			}

		}

		System.out.println("1부터 100까지의 숫자들 중에서");
		System.out.printf("짝수의 합은 %d 이고", evenNum);
		System.out.println();
		System.out.printf("홀수의 합은 %d 이다.", oddNum);

	}

}
