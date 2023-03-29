package day018;

import java.util.stream.Stream;

public class StreamExample6 {

	public static void main(String[] args) {
		Stream.of("3", "1", "4", "2", "5", "5")
		// return 한 것을 또 stream 객체로 반환한다.
        .map(x -> {
            System.out.println("map : " + x);
            return Integer.parseInt(x);
        })
        // 비교식이 참인 경우에만 filter에 의해서 stream객체로 남게된다.
        .filter(x -> {
            System.out.println("filter : " + x);
            return x > 1;
        })
        .forEach(x -> {
            System.out.println("forEach : " + x);
        });
	}
}
