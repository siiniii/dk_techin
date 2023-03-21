package day007.ex;

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

public class FriendTest {

	public static void main(String[] args) {

		Friend f = new Friend("이름", "전화번호\t", "메일주소");
		System.out.print(f.getInfo());

		System.out.println("-----------------------------------------");

		Friend[] friends = new Friend[5];

		friends[0] = new Friend("김가가", "010-1111-1111", "gaga@email.com");
		friends[1] = new Friend("이나나", "010-2222-2222", "nana@email.com");
		friends[2] = new Friend("박다다", "010-3333-3333", "dada@email.com");
		friends[3] = new Friend("최라라", "010-4444-4444", "lala@email.com");
		friends[4] = new Friend("한마마", "010-5555-5555", "mama@email.com");

		for (Friend data : friends) {
			System.out.print(data.getInfo());
		}

	}
}
