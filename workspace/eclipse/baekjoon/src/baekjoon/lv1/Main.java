package baekjoon.lv1;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	
	int no = sc.nextInt();
	
	if(no>=90 && no<=100) {
		System.out.println("A");
	}else if (no>=80 && no<=89) {
		System.out.println("B");
	}else if (no>=70 && no<=79) {
		System.out.println("C");
	}else if (no>=60 && no<=69) {
		System.out.println("D");
	}else {
		System.out.println("F");
	}
	sc.close();
	}

}
