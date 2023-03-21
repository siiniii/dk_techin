package day010.case3;

public class TVUser {
	public static void main(String[] args) {		
		// TV 객체 생성을 대신해주는 역할
		TV tv = TVFactory.getTV(args[0]);
		if(tv != null) {
			tv.powerOn();
			tv.volumnUp();
			tv.volumnDown();
			tv.powerOff();
		} else {
			System.out.println("프로그램 아규먼트로 samsung 또는 lg 를 입력해 주세요..");
		}
	}
}
