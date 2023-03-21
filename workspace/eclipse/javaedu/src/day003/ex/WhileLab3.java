package day003.ex;

public class WhileLab3 {

	public static void main(String[] args) {

		int count = 0;
		while (true) {
			int no = (int) (Math.random() * 31);
			if (no >= 1 && no <= 26) {
				char alpha = (char) (no + 64);
				System.out.printf("%d-" + alpha + "," + (no + 64) + ",0x%X\n", no, (int) alpha);
				// System.out.printf("%d-%c, %2$d,0x%2$x\n", no,no+64);
				count++;
			} else {
				System.out.printf("출력횟수는 %d번입니다.", count);
				break;
			}

		}

	}

}
