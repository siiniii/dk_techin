package baekjoon.lv1;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int a = Integer.parseInt(sc.nextLine());
		String b = sc.nextLine();
		
		for(int i = 2; i >= 0; i--) {
			System.out.println(a * (b.charAt(i) - '0'));
		}
		System.out.println(a * Integer.parseInt(b));
		
		sc.close();
		
	}

}
