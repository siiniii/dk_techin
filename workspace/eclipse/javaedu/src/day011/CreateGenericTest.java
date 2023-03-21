package day011;

import java.util.Date;

public class CreateGenericTest {

	public static void main(String[] args) {
		Value1 v1 = new Value1();
		v1.put("가나다");
		String s1 = v1.get();
		System.out.println(s1);
		
		Value2 v2 = new Value2();
		v2.put("라마바");
		String s2 = (String)v2.get();
		System.out.println(s2);
		v2.put(new Date());
		Date d1 = (Date)v2.get();
		System.out.println(d1);
		
		Value3<String> v3 = new Value3<>();
		v3.put("사아자");
		String s3 = v3.get();
		System.out.println(s3);
		Value3<Date> v4 = new Value3<>();
		v4.put(new Date());
		Date d2 = v4.get();
		System.out.println(d2);
		
		
	}

}

class Value1 {
	String obj;
	void put(String obj) {
		this.obj = obj;
	}
	String get() {
		return obj;
	}
}

class Value2 {
	Object obj;
	void put(Object obj) {
		this.obj = obj;
	}
	Object get() {
		return obj;
	}
}

// 제너릭구문
class Value3<T> {
 	T obj;
	void put(T obj) {
		this.obj = obj;
	}
	T get() {
		return obj;
	}
}