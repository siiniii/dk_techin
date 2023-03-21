package day009;
import java.net.*;
public class InetAddressTest {
	public static void main(String[] args) throws Exception {
		InetAddress inet = InetAddress.getLocalHost(); // 컴퓨터 ip주소
		System.out.println(inet);
		inet = InetAddress.getByName("www.naver.com");
		System.out.println(inet);

	}

}