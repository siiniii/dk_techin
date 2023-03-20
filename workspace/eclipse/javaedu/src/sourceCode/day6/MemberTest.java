package sourceCode.day6;

class Member {
	String name;
	String account;
	String password;
	int birthyear;
	/*
	 * Member(){ this("홍길동","abc123","kosa",2023); } Member(String name,String
	 * account,String password,int birthyear){ this.name = name; this.account =
	 * account; this.password = password; this.birthyear = birthyear; }
	 */
}

public class MemberTest {
	public static void main(String[] args) {
		// Member mem1 = new Member("둘리","bbb11","bbbb",1980);
		// Member mem2 = new Member("또치","ccc11","cccc",1981);
		Member mem3 = new Member();

		mem3.name = "올라프";
		mem3.account = "test";
		mem3.password = "1234";
		mem3.birthyear = 2000;

		// System.out.printf("회원%d : %s(%s,%s,%d)\n", 1,
		// mem1.name,mem1.account,mem1.password,mem1.birthyear);
		// System.out.printf("회원%d : %s(%s,%s,%d)\n", 2,
		// mem2.name,mem2.account,mem2.password,mem2.birthyear);
		System.out.printf("회원%d :  %s(%s,%s,%d)\n", 3, mem3.name, mem3.account, mem3.password, mem3.birthyear);
	}
}
