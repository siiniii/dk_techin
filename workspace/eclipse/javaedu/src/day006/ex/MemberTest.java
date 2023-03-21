package day006.ex;

class Member {
	String name;
	String account;
	String passwd;
	int birthyear;

	Member(String name, String account, String passwd, int birthyear) {
		this.name = name;
		this.account = account;
		this.passwd = passwd;
		this.birthyear = birthyear;
	}

	void printMemoneInfo() {
		System.out.printf("회원1 : %s(%s,%s,%d)\n", name, account, passwd, birthyear);
	}

	void printMemtwoInfo() {
		System.out.printf("회원2 : %s(%s,%s,%d)\n", name, account, passwd, birthyear);
	}

	void printMemthreeInfo() {
		System.out.printf("회원3 : %s(%s,%s,%d)\n", name, account, passwd, birthyear);
	}

}

public class MemberTest {

	public static void main(String[] args) {
		Member mem1 = new Member("둘리", "dool", "dool", 2011);
		Member mem2 = new Member("또치", "qi", "qi", 2012);
		Member mem3 = new Member("도우너", "dow", "dow", 2013);

		mem1.printMemoneInfo();
		mem2.printMemoneInfo();
		mem3.printMemoneInfo();
	}

}
