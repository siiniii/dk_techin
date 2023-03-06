package day1;
public class VarTest2 {
	public static void main(String[] args) {
		System.out.println(100);
		int num;  
		num = 1000;
		System.out.println("연산 전 : "+num);
		num = 10+20;
		System.out.println("연산 후 : "+num);
		char munja = 'A';  
		System.out.print(munja); 
		munja++;
		System.out.print(munja); 
		munja += 1;
		System.out.print(munja); 
		munja = (char)(munja+1); 
	//	   (대입)(형변환)(덧셈)
	// 연산순서: 3     2    1
	// 형변환 연산자는 덧셈연산보다 우선순위가 높기 때문에 괄호로 우선순위를 지정해주었다.  
		System.out.println(munja);  
		
		munja = '가';  
		System.out.print(munja); 
		munja++;
		System.out.print(munja); 
		munja += 1;
		System.out.print(munja); 
		munja = (char)(munja+1); 
		System.out.println(munja);  
	}
}








