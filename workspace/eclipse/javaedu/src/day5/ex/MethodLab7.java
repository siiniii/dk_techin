package day5.ex;

public class MethodLab7 {

	public static void main(String[] args) {
		printArray(powerArray(2));
		printArray(powerArray(3));
		printArray(powerArray(4));

	}
	
	static int[] powerArray(int powerArr) {
		int[] p = new int[10];

		for (int i = 0; i < p.length; i++) {
			p[i] = (i+1) * powerArr;
		}
		return p;
		
	}
	
	static void printArray(int[] printArr) {
		for(int i=0; i<printArr.length-1; i++) {
			System.out.print(printArr[i]+", ");
		}
		System.out.println(printArr[printArr.length-1]);
	}
}