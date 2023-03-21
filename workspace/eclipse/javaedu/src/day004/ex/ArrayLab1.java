package day004.ex;

public class ArrayLab1 {

	public static void main(String[] args) {
		int[] ary = new int[10];
		// 1
		for (int e : ary)
			System.out.print(e + " ");

		System.out.println();
		// 2
		// ary = new int[] { 10, 20, 30, 40, 50, 60, 70, 80, 90, 100 };
		for (int i = 0; i < ary.length; i++) {
			ary[i] = 10 * (i + 1);
		}

		int sum = ary[0] + ary[ary.length - 1];

		System.out.println("첫 번째 : " + ary[0]);
		System.out.println("마지막 : " + ary[ary.length - 1]);
		System.out.println("합 : " + sum);

		// 3
		for (int i = 0; i < ary.length; i++)
			System.out.print(ary[i] + " ");
		System.out.println();

		// 4
		for (int i = ary.length - 1; i >= 0; i--)
			System.out.print(ary[i] + " ");
		System.out.println();

		// 5
		// += : 2씩 증가하기
		for (int i = 1; i < ary.length; i += 2)
			System.out.print(ary[i] + " ");
		System.out.println();
	}

}
