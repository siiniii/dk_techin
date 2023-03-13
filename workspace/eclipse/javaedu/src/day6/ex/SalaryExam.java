package day6.ex;

import day5.ex.MethodLab5;

class SalaryExpr {
	int bonus;

	SalaryExpr() {
		this(0);
	}

	SalaryExpr(int bonus) {
		this.bonus = bonus;
	}

	int getSalary(int grade) {

		if (grade == 1) {
			return bonus + 100;
		} else if (grade == 2) {
			return bonus + 90;
		} else if (grade == 3) {
			return bonus + 80;
		} else {
			return bonus + 70;
		}

	}

}

public class SalaryExam {

	public static void main(String[] args) {

		int month = MethodLab5.getRandom(12, 1);
		int grade = MethodLab5.getRandom(4, 1);

		SalaryExpr salEx;
//		if (month % 2 == 0) {
//			SalaryExpr salEx = new SalaryExpr(100);
//			System.out.printf("%d월 %d등급의 월급은 %d입니다.", month, grade, salEx.getSalary(grade));
//		} else {
//			SalaryExpr salEx = new SalaryExpr();
//			System.out.printf("%d월 %d등급의 월급은 %d입니다.", month, grade, salEx.getSalary(grade));
//		}
		
		if (month % 2 == 0) {
			salEx = new SalaryExpr(100);
		} else {
			salEx = new SalaryExpr();
		}
		System.out.printf("%d월 %d등급의 월급은 %d입니다.", month, grade, salEx.getSalary(grade));
	}
}
