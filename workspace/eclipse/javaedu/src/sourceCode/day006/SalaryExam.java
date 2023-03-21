package sourceCode.day006;

import day005.ex.MethodLab5;

class SalaryExpr {
	int bonus;

	SalaryExpr() {
		this(0);
	}

	SalaryExpr(int bonus) {
		this.bonus = bonus;
	}

	int getSalary(int grade) {
		int result = 0;
		switch (grade) {
		case 1:
			result = bonus + 100;
		case 2:
			result = bonus + 90;
		case 3:
			result = bonus + 80;
		case 4:
			result = bonus + 70;
		}
		return result;
	}
}

public class SalaryExam {
	public static void main(String[] args) {
		int month = MethodLab5.getRandom(12);
		int grade = MethodLab5.getRandom(4);
		SalaryExpr salary;

		if (month % 2 == 0) {
			salary = new SalaryExpr(100);
		} else {
			salary = new SalaryExpr();
		}
		System.out.printf("%d 월 %d등급의 월급은 %,d 입니다\n", month, grade, salary.getSalary(grade));
	}

}
