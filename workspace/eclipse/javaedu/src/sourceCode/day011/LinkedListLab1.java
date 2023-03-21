package sourceCode.day011;
import java.util.*;

class Person {
	private String name;
	Person(String name) {
		this.name = name;
	}
	public String getInfo() {
		return name;
	}
}

class Friend extends Person {
	private String phoneNum;
	private String email;
	
	Friend(String name, String phoneNum, String email) {
		super(name);
		this.phoneNum = phoneNum;
		this.email = email;
	}
	
	public String getInfo() {
		return super.getInfo() + " " + phoneNum + " " + email;
	}
}

public class LinkedListLab1 {

	public static void main(String[] args) {
		LinkedList<Friend> list = new LinkedList<>();
		list.add(new Friend("둘리", "01038473727", "abc@naver.com"));
		list.add(new Friend("또치", "01012345342", "ass@naver.com"));
		list.add(new Friend("도우너", "01034785342", "jsd@naver.com"));
		
		for(Friend f : list) {
			System.out.println(f.getInfo());
		}
	}

}
