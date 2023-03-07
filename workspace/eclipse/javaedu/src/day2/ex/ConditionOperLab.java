package day2.ex;

public class ConditionOperLab {

	public static void main(String[] args) {
		int no = (int) (Math.random() * 5) + 1;
		int x = 300;
		int y = 50;
		int result;

		if (no == 1) {
			result = x + y;
		} else if (no == 2) {
			result = x - y;
		} else if (no == 3) {
			result = x * y;
		} else if (no == 4) {
			result = x / y;
		} else {
			result = x % y;
		}
		System.out.println("결과값 : " + result);

	}

}
