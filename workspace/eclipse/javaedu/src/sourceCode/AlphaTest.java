package sourceCode;

public class AlphaTest {

	public static void main(String[] args) {
		double rand = Math.random();
		int num = (int) (rand * 26) + 1;

		char eng = (char) (num + 64); // 65는 아스키에서 A, '@'

		System.out.println("추출된 숫자 : " + num);
		System.out.println(eng);
		System.out.println(num + 64);
		System.out.println((char) (num + 64));
	}

}
