package sourceCode.day2;

public class ConditionOperLab {

	public static void main(String[] args) {
		double rand = Math.random();
		int value = (int) (rand * 5) + 1; // 1~5
		int result;
		if (value == 1) {
			result = 300 + 50;
		} else if (value == 2) {
			result = 300 - 50;
		} else if (value == 3) {
			result = 300 * 50;
		} else if (value == 4) {
			result = 300 / 50;
		} else {
			result = 300 % 50;
		}
		System.out.println("결과값 : " + result);
	}
}
