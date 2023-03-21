package sourceCode.day003;

public class WhileLab2 {
	public static void main(String[] args) {
		int pairNum1;
		int pairNum2;
		while (true) {
			pairNum1 = (int) (Math.random() * 6) + 1;
			pairNum2 = (int) (Math.random() * 6) + 1;
			if (pairNum1 > pairNum2) {
				System.out.println("pairNum1이 pairNum2 보다 크다.");
			} else if (pairNum1 < pairNum2) {
				System.out.println("pairNum1이 pairNum2 보다 작다.");
			} else {
				break;
			}
		}
		System.out.println("게임 끝");
	}
}
