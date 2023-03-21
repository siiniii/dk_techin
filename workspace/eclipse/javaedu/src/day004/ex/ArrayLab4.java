package day004.ex;

public class ArrayLab4 {

	public static void main(String[] args) {
		int no = (int) (Math.random() * 6) + 5;
		int[] ary = new int[no];
		for (int i = 0; i < ary.length; i++) {
			ary[i] = (int) (Math.random() * 26) + 1;
		}

		char[] let = new char[no];
		for (int j = 0; j < let.length; j++) {
			let[j] = (char) (ary[j] + 96);
		}

		for (int i = 0; i < ary.length - 1; i++) {
			System.out.print(ary[i] + ",");
		}
		System.out.println(ary[ary.length - 1]);

		for (int j = 0; j < ary.length - 1; j++) {
			System.out.print(let[j] + ",");
		}
		System.out.println(let[let.length - 1]);
	}

}
