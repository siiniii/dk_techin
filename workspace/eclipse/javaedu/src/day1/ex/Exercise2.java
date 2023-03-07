package day1.ex;

public class Exercise2 {

	public static void main(String[] args) {

//		(1) int 타입의 변수 2개를 선언하고 각각 35, 10 으로 초기화 한다. 
		int no1 = 35;
		int no2 = 10;

//		(2) 나눈 몫과 나머지를 구하여 제시된 출력 형식과 같이 출력하는 프로그램을 작성하시오. 
		int result = no1 / no2;
		int etc = no1 % no2;
		System.out.printf("%d를 %d으로 나눈 결과 몫은 %d이고 나머지는 %d입니다.", no1, no2, result, etc);

	}

}
