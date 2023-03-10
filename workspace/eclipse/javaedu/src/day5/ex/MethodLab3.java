package day5.ex;

public class MethodLab3 {

	public static void main(String[] args) {
		
		System.out.printf("%d은 %s 입니다.\n", 10,isEven(10)?"짝수":"홀수");
		System.out.printf("%d은 %s 입니다.", 13,isEven(13)?"짝수":"홀수");

	}

	static boolean isEven(int no) {

		if (no % 2 == 0) {
			return true;
		} else {
			return false;
		}
	}
	
	
	
//	public static void main(String[] args) {
//
//		isEven(10);
//		isEven(13);
//
//	}
//
//	static boolean isEven(int no) {
//
//		if (no % 2 == 0) {
//			System.out.printf("%d은 짝수입니다.\n", no);
//			return true;
//		} else {
//			System.out.printf("%d은 홀수입니다.\n", no);
//
//			return false;
//		}
//	}
}
