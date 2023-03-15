package day8;

abstract class Shape {
	String color;

	// 그리는 방법은 도형마다 다르기 때문에 abstract메서드로 상속
	abstract void draw();

	void setColor(String color) {
		this.color = color;
	}
}

// shape클래스를 상속받기 위해서는 반드시 darw()를 오버라이딩 해주어야한다.
class Circle2 extends Shape {
	void draw() {
		System.out.println(color + " 원을 그리는 기능");
	}
}

class Rectangle2 extends Shape {
	void draw() {
		System.out.println(color + " 사각형을 그리는 기능");
	}
}

class Triangle2 extends Shape {
	void draw() {
		System.out.println(color + " 삼각형을 그리는 기능");
	}
}

public class AbstractTest2 {
	public static void main(String args[]) {
		Shape s = new Circle2();
		s.setColor("파란색");
		printInfo(s);
		s = new Rectangle2();
		s.setColor("분홍색");
		printInfo(s);
		s = new Triangle2();
		s.setColor("연두색");
		printInfo(s);
	}

	static void printInfo(Shape obj) {
		obj.draw();
	}
}
