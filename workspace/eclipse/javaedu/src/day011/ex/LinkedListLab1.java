package day011.ex;

import java.util.LinkedList;

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

		return super.getInfo() + "\t" + phoneNum + "\t" + email + "\n";
	}
}

public class LinkedListLab1 {

	public static void main(String[] args) {

		Friend f = new Friend("이름", "전화번호\t", "메일주소");
		System.out.print(f.getInfo());

		System.out.println("-----------------------------------------");

		LinkedList<String> friends = new LinkedList<String>();

		friends.add("김가가\t" + "010-1111-1111\t" + "gaga@email.com");
		friends.add("이나나\t" + "010-2222-2222\t" + "nana@email.com");
		friends.add("박다다\t" + "010-3333-3333\t" + "dada@email.com");
		friends.add("최라라\t" + "010-4444-4444\t" + "lala@email.com");
		friends.add("한마마\t" + "010-5555-5555\t" + "mama@email.com");

		for (String str : friends)
			System.out.println(str);

	}
}
