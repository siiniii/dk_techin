package day4.ex;

public class TwoArrayLab1 {

	public static void main(String[] args) {
		int [][] twoA = { {10, 12, 14, 16},
						  {18, 20, 22, 24},
						  {26, 28, 30, 32},
						  {34, 36, 38, 40}
		};
		System.out.println("1행 1열의 데이터 : " + twoA[0][0]);
		System.out.println("3행 4열의 데이터 : " + twoA[twoA.length-2][twoA.length-1]);
		System.out.println("행의 갯수 : " + twoA.length);
		System.out.println("열의 갯수 : " + twoA[0].length);
		
		
		System.out.print("3행의 데이터들 : ");
		for (int row = 0; row <= twoA.length-4; row++) {
			for (int col = 0; col < twoA[row].length; col++) {
				System.out.print(twoA[twoA.length-2][col] + " ");
			}
			System.out.println();
		}
		
		System.out.print("2열의 데이터들 : ");
		for (int row = 0; row < twoA.length; row++) {
			for (int col = 0; col <= twoA[row].length-4; col++) {
				System.out.print(twoA[row][twoA.length-3] + " ");
			}
		}
		System.out.println();
		
		System.out.print("왼쪽 대각선 데이터들 : ");
		for (int row = 0; row < twoA.length; row++) {
			for (int col = 0; col < twoA[row].length; col++) {
				if(row == col) {
				System.out.print(twoA[row][col] + " ");
				}
			}
		}
		System.out.println();
		
		
		System.out.print("오른쪽 대각선 데이터들 : ");
		for (int row = 0; row < twoA.length; row++) {
			for (int col = 0; col < twoA[row].length; col++) {
				if(row + col == 3) {
				System.out.print(twoA[row][col] + " ");
				}
			}
		}
		System.out.println();
	}

}
