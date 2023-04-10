package baekjoon.lv1;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	
	int A = sc.nextInt();
	int B = sc.nextInt();
	int C = sc.nextInt();
	
	if((B+C) > 59) {
		++A;
		System.out.println(A + " " + ((B+C)-60));
	} else {
		System.out.println(A + " " + (B+C));
	}
	
	
	
	sc.close();
	}

}
