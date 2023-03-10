package day3;

public class BreakTest2 {      

	public static void main(String[] args) {
		int result;
		// 라벨: 이름을 지정해주는 것
		unico: for(int dan = 1; dan <= 9; dan++) {
			for(int num=1; num <= 9; num++) {
				result = dan*num;
				if (result >= 30)
					break unico;
				// unico라는 라벨을 가진 반복문을 break한다.
				// 만일 라벨을 지정해주지 않고, break만 사용한다면 가장 가까운 하나만 나간다
				System.out.print(dan + "x" + num + "=" + result + "\t");
			}
			System.out.println();
		}		
	}
}
