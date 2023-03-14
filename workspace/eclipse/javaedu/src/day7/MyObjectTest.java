package day7;

class MyObject{
	void printName() {
		System.out.println("자바듀크");
	}
	public String toString() {
		return "Object의 자식클래스인 MyObject 객체";
	}
}

public class MyObjectTest {

	public static void main(String[] args) {
		MyObject my = new MyObject();
		// 오버라이딩을 하려면 public
		System.out.println(my.toString());
		System.out.println(my);
		System.out.println("출력 : " + my);
		my.printName();
	}

}
