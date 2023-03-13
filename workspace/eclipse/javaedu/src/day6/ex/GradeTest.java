package day6.ex;

import java.util.Scanner;

class GradeExpr {
	int[] jumsu;
	int sum = 0;

	GradeExpr(int jumsu[]) {
		this.jumsu = jumsu;

	}

	double getAverage() {
		for (int i = 0; i < jumsu.length; i++) {
			sum += jumsu[i];
		}
		return sum / jumsu.length;
	}

	int getTotal() {
		for (int i = 0; i < jumsu.length; i++) {
			sum += jumsu[i];
		}
		return sum;
	}

	int getGoodScore() {
		int good = jumsu[0];
		for (int i = 1; i < jumsu.length; i++) {
			if (good < jumsu[i]) {
				good = jumsu[i];
			}
		}
		return good;
	}

	int getBadScore() {
		int bad = jumsu[0];
		for (int i = 1; i < jumsu.length; i++) {
			if (bad > jumsu[i]) {
				bad = jumsu[i];
			}
		}
		return bad;
	}

}

public class GradeTest {

	public static void main(String[] args) {
		System.out.print("점수를 입력하세요 : ");

		Scanner sc = new Scanner(System.in);
		int[] arr = new int[sc.nextInt()];
		sc.nextLine();

		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
			if (i == 0) {
				System.out.print("점수들 : ");
			} else {
				System.out.print(arr[i]);
			}
			if (i < arr.length - 1) {
				System.out.print(",");
			}
			
		}
		
		System.out.println();
		GradeExpr ge = new GradeExpr(arr);

		System.out.println("총점 : " + ge.getTotal());
		System.out.println("평균 : " + ge.getAverage());
		System.out.println("최고 점수 : " + ge.getGoodScore());
		System.out.println("최저 점수 : " + ge.getBadScore());
		
		sc.close();
	}

}
