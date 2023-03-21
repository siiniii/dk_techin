package sourceCode.day011;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;

public class HashMapLab1_1 {

	public static void main(String[] args) {
		Map<String, Integer> map = new HashMap<String, Integer>();
		
		Scanner sc = new Scanner(System.in);
		for (int i = 0; i < 5; i++) {
			String country = sc.next();
			Integer countryNum = sc.nextInt();
				if(map.containsKey(country)) {
					System.out.printf("나라명 %s는 이미 저장되었습니다", country);			
					i--;
				}else {
					map.put(country, countryNum);
				}

		}
		System.out.print("5개가 모두 입력되었습니다.\n입력된 데이터 : ");
		System.out.println(map.entrySet());
		int count = 0;
		for (Entry<String, Integer> entrySet : map.entrySet()) {
			count++;
			if(count == 5)
				System.out.print(entrySet.getKey() + "(" + entrySet.getValue() + ") ");
			else
				System.out.print(entrySet.getKey() + "(" + entrySet.getValue() + "), ");
		}
	}
}
