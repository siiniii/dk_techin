package sourceCode;

public class TimeTest {

	public static void main(String[] args) {
		int time = 32150;
		int hour = time / 3600; // 시간계산
		int min = (time % 3600) / 60; // 분 계산
		int sec = time % 60; // 초 계산

		System.out.println(hour + "시간 " + min + "분 " + sec + "초 ");
	}

}
