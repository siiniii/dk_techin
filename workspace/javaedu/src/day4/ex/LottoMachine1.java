package day4.ex;

public class LottoMachine1 {

	public static void main(String[] args) {
		System.out.print("오늘의 로또 번호 - ");
		int[] numbers = new int[6];
		for (int i = 0; i < numbers.length; i++) {
			numbers[i] = (int) (Math.random() * 45) + 1;
			for (int j = 0; j < i; j++) {
				if (numbers[i] == numbers[j]) {
					i--;
				}
			}

		}
		for (int i = 0; i < numbers.length - 1; i++) {
			System.out.print(numbers[i] + ",");
		}
		System.out.println(numbers[numbers.length - 1]);
	}

}
