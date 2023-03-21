package day004.ex;

public class ArrayLab2 {

	public static void main(String[] args) {
		int[] no = new int[10];
		int sum = 0;

		for (int i = 0; i < no.length; i++)
			no[i] = (int) (Math.random() * 17) + 4;

		for (int i = 0; i < no.length; i++) {
			sum += no[i];
			if (i == no.length - 1) {
				System.out.println(no[i]);
				sum += no[i];
				break;
			}
			System.out.print(no[i] + ",");
		}

		System.out.println("모든 원소의 합 :" + sum);

	}

}
