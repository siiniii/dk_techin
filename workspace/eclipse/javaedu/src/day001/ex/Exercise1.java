package day001.ex;

public class Exercise1 {

	public static void main(String[] args) {

//		(1) int 타입의 변수 3개를 선언하고 각각 10, 25, 33 으로 초기화 한다. 
		int no1 = 10;
		int no2 = 25;
		int no3 = 33;

//		(2) 세 개 변수를 사용하여 합계와 평균을 구하고 다음에 제시된 출력 형식과 같이 출력한다. (평균의 소수점 이하는 고려하지 않는다.)
		int sum = no1 + no2 + no3;
		System.out.println("합계 : " + sum);

		int avg = (no1 + no2 + no3) / 3;
		System.out.println("평균1 : " + avg);
		System.out.println("평균2 : " + sum / 3);

	}

}
