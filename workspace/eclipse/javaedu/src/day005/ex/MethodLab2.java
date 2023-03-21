package day005.ex;

public class MethodLab2 {

	public static void main(String[] args) {
		printDeco('@', 3);
		printDeco('%', 4);
		printDeco('A', 5);

	}

	static void printDeco(char deco, int no) {
		for (int i = 1; i <= no; i++) {
			for (int k = 0; k < no - i; k++) {
				System.out.print(" ");
			}
			for (int j = 1; j <= i; j++) {
				System.out.print(deco);
			}
			System.out.println();
		}

	}

}
