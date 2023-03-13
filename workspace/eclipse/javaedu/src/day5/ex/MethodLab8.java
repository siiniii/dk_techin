package day5.ex;

public class MethodLab8 {

	public static void main(String[] args) {
		System.out.printf("호출 1 : %d\n", addEven(10, 2, 5, 13, 7));
		System.out.printf("호출 2 : %d\n", addEven(11, 22, 33, 44, 55, 66));
		System.out.printf("호출 3 : %d\n", addEven());
		System.out.printf("호출 4 : %d", addEven(100, 101, 103));
	}

	// 매기변수에만 사용가능하다 int ... == int[] (int 데이터 0개이상 전달받을것이다)
	static int addEven(int... p) {
		int sum = -1;
		for (int i = 0; i < p.length; i++) {
			if (p[i] % 2 == 0)
				sum += p[i];
		}
		if (p.length == 0) {
			return sum;
		} else {
		return sum + 1;
		}
	}
	
}
