package day5.ex;

public class MethodLab9 {

	public static void main(String[] args) {
		System.out.println(isRightTriangle(3, 4, 5));
		System.out.println(isRightTriangle(1, 2, 3));
	}

	static boolean isRightTriangle(int width, int height, int hypo) {
		if (hypo * hypo == width * width + height * height) {
			return true;
		} else {
			return false;
		}
	}
}
