package day5.ex;

public class MethodLab9 {

	public static void main(String[] args) {
		System.out.println(isRightTriangle(3, 4, 5));
		System.out.println(isRightTriangle(1, 2, 3));
	}

	static boolean isRightTriangle(int w, int h, int l) {
		if (l * l == w * w + h * h) {
			return true;
		} else {
			return false;
		}
	}
}
