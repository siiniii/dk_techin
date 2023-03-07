package day2.ex;

public class SwitchLab2 {

	public static void main(String[] args) {
		int no = (int) (Math.random() * 5) + 1;
		int x = 300;
		int y = 50;
		int result;

		switch (no) {
		case 1:
			result = x + y;
			break;
		case 2:
			result = x - y;
			break;
		case 3:
			result = x * y;
			break;
		case 4:
			result = x / y;
			break;
		default:
			result = x % y;
		}
		System.out.println("결과값 : " + result);

	}
}
