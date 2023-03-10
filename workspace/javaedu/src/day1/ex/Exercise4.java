package day1.ex;

public class Exercise4 {
	public static void main(String[] args) {

//	1. int 타입의 변수 number 를 선언하고 100 이라는 값을 저장한다.
		int number = 100;
//	2. int 타입의 변수 result 를 선언한다.
		int result;

//	3. number 변수의 값에 10을 더하고 결과를 result 에 담아 결과를 출력한다.   
		result = number + 10;
		System.out.println("덧셈 연산의 결과 : " + result);
//	4. number 변수의 값에 10을 빼고 결과를 result 에 담아 결과를 출력한다.    
		result = number - 10;
		System.out.println("뺄셈 연산의 결과 : " + result);
//	5. number 변수의 값에 10을 곱하고 결과를 result 에 담아 결과를 출력한다.   
		result = number * 10;
		System.out.println("곱셈 연산의 결과 : " + result);
//	6. number 변수의 값에 10을 나누고 결과를 result 에 담아 결과를 출력한다.	  
		result = number / 10;
		System.out.println("나눗셈 연산의 결과 : " + result);
	}
}