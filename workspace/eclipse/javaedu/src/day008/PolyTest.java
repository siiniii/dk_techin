package day008;

import java.io.File;
import java.util.Date;

public class PolyTest {

	public static void main(String[] args) {
		printObjectInfo(new Object());
		printObjectInfo("가나다");
		printObjectInfo("abc");
		printObjectInfo(new Date());
		printObjectInfo(new File("c:/Temp"));
		printObjectInfo(new int[10]);
		printObjectInfo(new double[5]);
		printObjectInfo(100); // java 5 - autoboxing java.lang.Integer
		printObjectInfo(3.14);
	}

	static void printObjectInfo(Object o) {
		if (o instanceof String ) { // o instanceof String : o가 참조하고있는 변수가 String이다
			System.out.println("문자열 객체가 전달됨 : " + o.toString() + "-" + ((String)o).length());
		} else {
			System.out.println("전달된 객체의 클래스명 : " + o.getClass().getName());
		}
	}

}