package day017.ex.lamdalab;

import java.util.Random;

interface Drawable {
	void draw();
}

public class DrawableTest {
	public static void main(String[] args) {
		Random rand = new Random();
		int num = rand.nextInt(3);
		Drawable d = null;
		
		if (num == 0)
			d = () -> System.out.println("사각형을 그립니다.");
		else if (num == 1)
			d = () -> System.out.println("원을 그립니다.");
		else if (num == 2)
			d = () -> System.out.println("마름모를 그립니다.");
		output(d);
	}

	public static void output(Drawable d) {
		System.out.println("전달된 객체의 클래스명 : " + d.getClass().getName());
		d.draw();
	}
}
