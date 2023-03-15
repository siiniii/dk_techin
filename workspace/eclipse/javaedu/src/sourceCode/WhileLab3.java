package sourceCode;

public class WhileLab3 {
	public static void main(String[] args) {
		int num;
		int count = 0;
		while (true) {
			num = (int) (Math.random() * 31);
			if (num >= 1 && num <= 26) {
				System.out.printf("%d-%c, %2$d, 0x%2$x\n", num, num + 64);
				count++;
			} else {
				System.out.printf("출력횟수는 %d 번입니다.", count);
				break;
			}
		}
	}
}
