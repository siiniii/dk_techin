package sourceCode.day005;

public class MethodLab1 {
	public static void main(String[] args) {
		System.out.print("우리의 자바교재명은 <");
		printTitle();
		System.out.println(">입니다.");
		System.out.printf("가격은 %,d 원 입니다.", getPrice());
	}

	static void printTitle() {
		System.out.print("이것이 자바다");
	}

	static int getPrice() {
		return 36000;
	}
}
