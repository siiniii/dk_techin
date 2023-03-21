package day002.ex;

public class TimeTest {

	public static void main(String[] args) {
		int time = 32150;
		int hour = time / 3600;
		int min = time / 60 - (hour * 60);
		int sec = time % 60;
		System.out.printf("%d시간 %d분 %d초", hour, min, sec);

	}

}
