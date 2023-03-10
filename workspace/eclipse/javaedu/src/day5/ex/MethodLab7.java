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
		for(int i=0; i<arr.length-1; i++) {
			System.out.print(arr[i]+", ");
		}
		System.out.println(arr[arr.length-1]);
	}
}
