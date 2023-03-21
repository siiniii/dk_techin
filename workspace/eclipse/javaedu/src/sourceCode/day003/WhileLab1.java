package sourceCode.day003;

public class WhileLab1 {
	public static void main(String[] args) {
		int num = (int) (Math.random() * 6) + 5;
		// for
		System.out.println("[ for 결과 ]");
		for (int i = 1; i <= num; i++) {
			System.out.println(i + " -> " + i * i);
		}
		// while
		System.out.println("[ while 결과 ]");
		int init = 1;
		while (init <= num) {
			System.out.println(init + " -> " + init * init);
			init++;
		}
	}
}
