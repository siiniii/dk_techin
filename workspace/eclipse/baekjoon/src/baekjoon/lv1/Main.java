package baekjoon.lv1;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	
	int no = sc.nextInt();
	
	if (no % 4 == 0 && no % 100 != 0 || no % 400 == 0) {
		System.out.println("1");
	} else {
		System.out.println("0");
	}
	
	sc.close();
	}

}
