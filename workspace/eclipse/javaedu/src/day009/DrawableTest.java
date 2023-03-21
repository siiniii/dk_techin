package day009;

import java.util.Random;

interface Drawable {
	void draw();
}

class Rect implements Drawable {
	public void draw() {
		System.out.println("사각형을 그립니다.");
	}
}

class Circle implements Drawable {
	public void draw() {
		System.out.println("원을 그립니다.");
	}
}

class Diamond implements Drawable {
	public void draw() {
		System.out.println("마름모를 그립니다.");
	}
}

public class DrawableTest {
	public static void main(String[] args) {
		Random rand = new Random();
		int num = rand.nextInt(3);
		// Drawble은 참조형 변수이기 때문에 0으로 초기화를 할 수 없다. 참조형 변수의 경우 null로 초기화.
		Drawable d = null;
		if (num == 0)
			d = new Rect();
		else if (num == 1)
			d = new Circle();
		else if (num == 2)
			d = new Diamond();
		output(d);
	}

	public static void output(Drawable d) {
		System.out.println("전달된 객체의 클래스명 : " + d.getClass().getName());
		d.draw();
	}
}
