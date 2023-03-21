package day005;
public class MethodTest4_1 {
	public static void main(String[] args) {
		System.out.println("main() 수행시작");
		printMyName(3, '*');
		printMyName(3, "듀크", '$');
		System.out.println("main() 수행종료");
	}	
	static void printMyName(int num, char deco) {
		for(int i=1; i <= num; i++)
			System.out.println(deco+"유니코"+deco);
	}
	static void printMyName(String name, char deco) {
		System.out.println(deco+name+deco);
	}
	static void printMyName(int num,String name, char deco) {
		for(int i=1; i <= num; i++)
			System.out.println(deco+name+deco);
	}
}
