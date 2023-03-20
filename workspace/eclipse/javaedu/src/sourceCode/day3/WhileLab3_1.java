package sourceCode.day3;

/*
[ 실습3 ] - while 문은 무한루프 처리하고 루프를 끝낼 때는 break 문 사용
1. WhileLab3 라는 클래스를 생성한다.
2. 0부터 30사이의 난수를 추출한다.
    추출된 숫자가 1이면 'A', 2 이면 'B', ... 26이면 'Z' 를 출력하는데
    계속 난수 추출과 출력을 반복하다가  0이 추출되거나  27~30이 추출되면 반복을 끝낸다.

    반복하는 동안 출력형식 :  	1-A, 65, 0x41
			5-E, 69, 0x45
			   :
    마지막에는 "출력횟수는 x 번입니다"를 출력하고 종료한다.
    (출력 횟수를 카운팅하는 것은 직접 구현한다.)
 */
public class WhileLab3_1 {
	public static void main(String[] args) {
		int rand = 0;
		int cnt = 0;

		while (true) {
			rand = (int) (Math.random() * 31);
			if (rand == 0 || (rand >= 27 && rand < 31))
				break;
			System.out.printf("%d-%c, %2$d, 0x%2$x\n", rand, rand + 64);
			cnt++;

		}
		System.out.println("출력횟수는 " + cnt + " 번입니다.");
	}
}