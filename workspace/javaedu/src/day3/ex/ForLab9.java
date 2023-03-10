package day3.ex;

public class ForLab9 {

	public static void main(String[] args) {
		int no = (int) (Math.random() * 2) + 1;

		if (no == 1) {
			for (int i = 1; i <= 9; i += 2) {
				for (int j = 1; j <= 9; j++) {
					System.out.print(i + "x" + j + "=" + i * j + "\t");
				}
				System.out.println();
			}
		} else {
			for (int i = 2; i <= 9; i += 2) {
				for (int j = 1; j <= 9; j++) {
					System.out.print(i + "x" + j + "=" + i * j + "\t");
				}
				System.out.println();
			}
		}
		System.out.println("-- 다른코드 --");
		///////////////////////////////////////////////////////////
		for(int i=no;i<=9; i+=2) {
			for(int j =1;j<=9;j++) {
				System.out.print(i+"X"+j+"="+i*j+"\t");
			}
			System.out.println();
		}
		
	}
}
