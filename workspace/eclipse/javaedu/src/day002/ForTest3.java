package day002;

public class ForTest3 {

	public static void main(String[] args) {
		for(int n=1; n < 20; n++)
			System.out.print(n+ " ");
		// 1~19까지 19번 반복
		System.out.println();
		
		for(int n=10; n > 0; n--)
			System.out.print(n+ " ");
		// 10 ~1까지 10번 반복
		System.out.println();
		
		for(int n=1; n < 20; n += 3)
			System.out.print(n+ " ");
		// 1~19까지 7번 반복
		System.out.println();
		
		// 1월~12월 까지 하나의 행에 출력해 보자. 
		int month=1;
		for(; month <= 12; month++)
			System.out.print(month+ "월 ");
		System.out.println();
		System.out.println(month);
	}

}
