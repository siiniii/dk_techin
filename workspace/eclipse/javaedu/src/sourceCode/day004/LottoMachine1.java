package sourceCode.day004;

public class LottoMachine1 {
	public static void main(String[] args) {
		int[] lotto = new int[6];
		for (int i = 0; i < lotto.length; i++) {
			lotto[i] = (int) (Math.random() * 45) + 1;
			for (int j = 0; j < i; j++) {
				if (lotto[i] == lotto[j])
					i--;
			}
		}
		System.out.print("오늘의 로또 번호 - ");
		for (int i = 0; i < lotto.length - 1; i++) {
			System.out.print(lotto[i] + ", ");
		}
		System.out.println(lotto[lotto.length - 1]);
	}
}
