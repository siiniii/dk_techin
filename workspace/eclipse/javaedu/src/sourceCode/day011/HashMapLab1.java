package sourceCode.day011;

import java.util.*;

public class HashMapLab1 {
	public static void main(String[] args) {
		 HashMap<String, Integer> map = new HashMap<>();
		 Scanner sc = new Scanner(System.in);
		 String country;
		 int people;
		 int cnt = 0;
		 
		 while(true) {
			 if(map.size() == 5) {
				 System.out.println("5개가 모두 입력되었습니다.");
				 break;
			 }
			 System.out.print("나라이름을 입력하세요 : ");
			 country = sc.next();
			 System.out.print("인구 수를 입력하세요 : ");
			 people = sc.nextInt();
			 if(map.containsKey(country)) {
				 System.out.printf("*나라명 %s는 이미 저장되었습니다.*\n", country); 
				 continue;
			 } else {
				 map.put(country, people);
				 System.out.println("*저장되었습니다.*");
			 }	 
		 }
		 
		 System.out.print("입력된 데이터 : ");
		 
		 for(String key : map.keySet()) {
			 System.out.printf("%s(%d)", key, map.get(key));
			 if(cnt < 4) 
				 System.out.print(", ");
			 cnt++;
		 }		 
		 sc.close();
	}
}
