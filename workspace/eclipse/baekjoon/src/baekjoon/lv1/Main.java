package baekjoon.lv1;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	
	int H = sc.nextInt();
	int M = sc.nextInt();
	
	if (H < 24) {
		H = 0;
	} else if (M < 60) {
		M = 0;
	}
	System.out.println();
	
	sc.close();
	}

}
