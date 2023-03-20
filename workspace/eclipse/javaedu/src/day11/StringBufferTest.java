package day11;

public class StringBufferTest {

	public static void main(String[] args) {		
		// 문자열을 편집하고자 하면 StringBuffer
		StringBuffer buffer = new StringBuffer();
		String str = "자바프로그래밍";
     	buffer.append(str);

        System.out.printf("%s\n", buffer);
        buffer.reverse(); // 역으로 만들기
        System.out.printf("%s\n", buffer);
        System.out.printf("길이 : %d\n", buffer.length());
        buffer.append(str);
        buffer.append(str);
        buffer.append(str);
        System.out.printf("%s\n", buffer);
        
        StringBuffer bf1 = new StringBuffer("가나다");
        StringBuffer bf2 = new StringBuffer();
        bf2.append("가나다");
        System.out.printf("%b\n", bf1.equals(bf2));
        System.out.printf("%b\n", bf1 == bf2);
        System.out.printf("%b\n", bf1.toString().equals(bf2.toString()));
	}
}










