/*
	 [ 실습5 ]
	
	1. TwoArrayLab5 라는 클래스를 만든다.
	
	2. 5개의 행과 3개의 열을 갖는 int 타입의 2차원 배열을 생성하여 다음과 같이 출력한다.
	
		0	0	0	
		0	0	0	
		0	0	0	
		0	0	0	
		0	0	0	
	 
	3. 2번에서 만든 2차원 배열에 다음과 같이 구성되도록 데이터를 대입한다.
		
		1	0	0		
		2	6	0		
		3	7	9		
		4	8	0		
		5	0	0	
	
	(*) 2번에서의 출력과 3번에서의 출력 사이에는 빈행을 출력한다.
	     또한 규칙을 잘 찾아서 로직을 잘 구현해 본다.
	
	- 수행 결과
	
	0	0	0	
	0	0	0	
	0	0	0	
	0	0	0	
	0	0	0	
	
	1	0	0	
	2	6	0	
	3	7	9	
	4	8	0	
	5	0	0 
 */
package sourceCode;

public class TwoArrayLab5_1 {

	public static void main(String[] args) {
		int[][] intArr = new int[5][3];
		int firstNum = 1;
		for (int i = 0; i < intArr.length; i++) {
			for (int j = 0; j < intArr[i].length; j++) {
				System.out.print(intArr[i][j] + "\t");
			}
			System.out.println();
		}
		System.out.println();

		for (int i = 0; i < intArr[0].length; i++) {
			for (int j = 0; j < intArr.length; j++) {
				if (!(j == 0 && i == 1) && !(j == 4 && i == 1) && !(j == 0 && i == 2) && !(j == 1 && i == 2)
						&& !(j == 3 && i == 2) && !(j == 4 && i == 2)) {
					intArr[j][i] = firstNum++;
				}
			}
		}

		for (int i = 0; i < intArr.length; i++) {
			for (int j = 0; j < intArr[i].length; j++) {
				System.out.print(intArr[i][j] + "\t");
			}
			System.out.println();
		}

	}

}
