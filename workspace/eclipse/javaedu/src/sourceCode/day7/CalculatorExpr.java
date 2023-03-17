package sourceCode.day7;

public class CalculatorExpr {

	private int num1;
	private int num2;

	public CalculatorExpr(int num1, int num2) {
		this.num1 = num1;
		this.num2 = num2;
	}

	void setNum1(int num1) {
		this.num1 = num1;
	}

	void setNum2(int num2) {
		this.num2 = num2;
	}

	int getAddition() {
		return num1 + num2;
	}

	int getSubtraction() {
		return num1 - num2;
	}

	int getMultiplication() {
		return num1 * num2;
	}

	double getDivision() {
		return num1 / (double) num2;
	}
}
