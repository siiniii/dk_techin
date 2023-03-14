package day7;

class Parent {
	int x = 1, y = 2;

	// @Override // 이 메서드가 오버라이딩을 생각하고 작성한것임을 자바컴파일러에게 알려주는 어노테이션 구문
	public String toString(int n) { // 오버로딩 (매개변수의 값이 다르기때문에)
		return "Parent 클래스의 객체 입니당";
	}
}

class Child extends Parent {
	int x = 10;

	void printInfo() {
		int x = 100;
		System.out.println(x); // 100
		System.out.println(this.x); // 10
		System.out.println(super.x); // 1
		System.out.println(y); // 2
		System.out.println(this.y); // 2
		System.out.println(super.y); // 2
		// System.out.println(z);
	}

	public String toString() { // 오버라이딩
		return "Child 클래스의 객체 입니당";
	}
}

public class ParentChildTest {
	public static void main(String[] args) {
		Parent p = new Parent();
		// 오버로딩을 했기 때문에 Object에 있는 값이 출력됩니다.
		System.out.println(p.toString());
		System.out.println(p);
		System.out.println("출력 1-" + p);

		Card c = new Card();
		System.out.println(c.toString());
		System.out.println("출력 2-" + c);

		java.util.Date d = new java.util.Date();
		System.out.println(d.toString());
		System.out.println("출력 3-" + d);

		Child ch = new Child();
		System.out.println("출력 4-" + ch);
		ch.printInfo();
		System.out.println(ch.x);
		System.out.println(ch.y);
	}
}
