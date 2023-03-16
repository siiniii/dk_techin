package day9;

class MySingleton2 {
	// 사용할 때 객체를 생성한다.
	private static MySingleton2 obj = null;
	private MySingleton2() {		
	}
	static MySingleton2 getMy() {
		if(obj == null) {
			obj = new MySingleton2();
		}
		return obj;
	}
	void printMyName() {
		System.out.println("듀크");	
	}
	void printFavoriteFood() {
		System.out.println("갈비");	
	}
}
public class MySingletonTest2 {
	public static void main(String[] args) {
		//MySingleton my = new MySingleton();
		MySingleton2 my = MySingleton2.getMy();
		my.printMyName();
		my.printFavoriteFood();
		System.out.println(my);
		System.out.println(MySingleton2.getMy());
		System.out.println(MySingleton2.getMy());
	}
}
