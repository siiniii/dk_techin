package day003.ex;

public class WhileLab1 {

	public static void main(String[] args) {
		int no = (int) (Math.random() * 6) + 5;

		System.out.println("[for 결과]");
		for (int i = 1; i <= no; i++) {
			System.out.println(i + "->" + i * i);

		}

		System.out.println("[while 결과]");
		int i = 1;
		while (i <= no) {
			System.out.println(i + "->" + i * i);
			i++;
		}

	}

}
