package day11.ex;

import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Scanner;

public class HashMapLab1 {

	public static void main(String[] args) {
		HashMap<String, Integer> map = new HashMap<String, Integer>(5);
		Scanner scanner = new Scanner(System.in);

		for (int i = 0; i < 5; i++) {
			System.out.println("나라이름을 입력하세요 : ");
			String coun = scanner.next();
			System.out.println("인구 수를 입력하세요 : ");
			Integer pop = scanner.nextInt();
			if (map.containsKey(coun) == true) {
				System.out.printf("*나라명%s는 이미 저장되었습니다.*\n", coun);
				i--;
			}
			map.put(coun, pop);
			System.out.println("*저장되었습니다.*");
		}

		int cnt = 0;
		System.out.println("5개가 모두 입력되었습니다.");
		System.out.print("입력된 데이터 : ");
		for (Entry<String, Integer> hash : map.entrySet()) {
			System.out.printf("%s(%d)", hash.getKey(), hash.getValue());
			cnt++;
			if (cnt < 5) {
				System.out.print(",");
			}
		}

		scanner.close();
	}

}
