package day6.ex;

import java.util.Scanner;

class GradeExpr{
	int[] jumsu;
	
	GradeExpr(int[] jumsu){
		this.jumsu = jumsu;
	}
	
	double getAverage(double avg) {
		avg = (jumsu[0] + jumsu[jumsu.length - 1]) / jumsu.length;
		return avg;
	}
	
	int getTotal(int sum) {
		sum = jumsu[0] + jumsu[jumsu.length - 1];
		return sum;
	}
	
	int getGoodScore(int goodScore) {
		int good = jumsu[0];
		for (int i = 1; i < jumsu.length; i++) {
			if (good < jumsu[i]) {
				good = jumsu[i];
			}
		}
		return goodScore;
	}
	
	int getBadScore(int badScore) {
		int bad = jumsu[0];
		for (int i = 1; i < jumsu.length; i++) {
			if (bad > jumsu[i]) {
				bad = jumsu[i];
			}
		}
		return badScore;
	}
	
}

public class GradeTest {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.printf("데이터를 입력하세요 : ");
		
		int[] arr = new int[sc.nextInt()];
		sc.nextLine();
		GradeExpr ge = new GradeExpr(arr);
		
		
		String line = sc.nextLine();
			
		System.out.printf("점수들 : %d", arr);
	}

}
