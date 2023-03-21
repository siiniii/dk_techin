package sourceCode.day011;

import java.util.*;

public class HashSetLab1 {

	public static void main(String[] args) {
		int cnt = 0;
		HashSet<Integer> lotto = new HashSet<>();
		
		while(true) {
			if(lotto.size() == 10) 
				break;
			lotto.add(day005.ex.MethodLab5.getRandom(10, 30));
		}
		
		System.out.print("오늘의 로또 번호 : ");
		
		for(int i : lotto) {
			System.out.print(i);
			if(cnt < 9) 
				System.out.print(", ");
			cnt++;
		}
	}
}
