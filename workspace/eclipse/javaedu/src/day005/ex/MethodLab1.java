package day005.ex;

public class MethodLab1 {
	
	public static void main(String[] args) {
		System.out.print("우리의 자바교재명은<");
		printTitle();
		System.out.println(">입니다.");
		System.out.printf("가격은 %,d 원입니다.", getPrice());
	}

	static void printTitle() {
		System.out.print("이것이 자바다");
	}

	static int getPrice() {
		return 36000;

	}
	
	

//	public static void main(String[] args) {
//		int price = getPrice(36);
//
//		printTitle();
//		System.out.println("가격은 " + price + ",000원입니다.");
//
//	}
//
//	static void printTitle() {
//		System.out.println("우리의 자바교재명은 <이것이 자바다>입니다.");
//	}
//
//	static int getPrice(int price) {
//		return price;
//
//	}
}
