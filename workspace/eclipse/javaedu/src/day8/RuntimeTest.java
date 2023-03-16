package day8;

public class RuntimeTest {

	public static void main(String[] args) throws Exception {

		Runtime r = Runtime.getRuntime(); // 팩토리 메서드
		Runtime r1 = Runtime.getRuntime();
		Runtime r2 = Runtime.getRuntime();
		
		System.out.println(r);
		System.out.println(r1);
		System.out.println(r2);
		// r.exec("c:/windows/notepad.exe");
		

	}

}
