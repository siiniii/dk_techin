package day007.ex;

import day005.ex.MethodLab5;

public class GuGuDanApp {

	public static void main(String[] args) {

		int dan = MethodLab5.getRandom(20, 1);
		int number = MethodLab5.getRandom(20, 1);
		
		// System.out.printf("dan : %d, number : %d\n", dan, number);

		if (dan < 10 && number < 10) {
			GuGuDanExpr gde = new GuGuDanExpr(dan, number);
			System.out.print(dan + "*" + number + "=" );
			gde.printPart();

		} else if (dan < 10 && number >= 10) {
			GuGuDanExpr gde = new GuGuDanExpr(dan);
			
			gde.printPart();
		} else {

			GuGuDanExpr.printAll();
		}
	}

}

class Multiplication {
	private int dan;
	private int number;

	Multiplication() {
	}

	Multiplication(int dan) {
		this.dan = dan;
	}

	Multiplication(int dan, int number) {
		this.dan = dan;
		this.number = number;
	}

	void printPart() {
		if (number == 0) {
			for (int n = 1; n <= 9; n++)
				System.out.print("\t" + dan + "*" + n + "=" + dan * n);
			System.out.println();
		} else {
			System.out.println(dan * number);
		}
	}
}

class GuGuDanExpr extends Multiplication {

	GuGuDanExpr() {
	};

	GuGuDanExpr(int dan) {
		super(dan);
	};

	GuGuDanExpr(int dan, int number) {
		super(dan, number);
	};

	public static void printAll() {
		for (int dan = 1; dan <= 9; dan++) {
			for (int num = 1; num <= 9; num++) {
				System.out.print(dan + "x" + num + "=" + dan * num + "\t");
			}
			System.out.println();
		}
	}

}
