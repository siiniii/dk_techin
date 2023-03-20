package day11.ex;

import java.util.HashSet;

public class HashSetLab1 {
	public static void main(String[] args) {

		System.out.print("오늘의 로또 번호 : ");

		HashSet<Integer> set = new HashSet<Integer>();

		while (set.size() < 10) {
			set.add((int) (Math.random() * 21) + 10);

		}

		int cnt = 0;

		for (int i : set) {
			System.out.print(i);
			cnt++;
			if (cnt < 10) {
				System.out.print(",");
			}
		}
	}

}
