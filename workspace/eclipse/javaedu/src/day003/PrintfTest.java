package day003;
public class PrintfTest {
	public static void main(String[] args) {
		System.out.printf("1. 테스트입니당%n");	
		System.out.printf("2. 테스트%d입니당\n",10);		
		System.out.printf("4. %d %x %o %c\n", 100, 100, 100, 100);
		System.out.printf("5. %d %1$x %1$o %1$c\n", 100);
		System.out.printf("6. 0x%X 0x%x\n", (int)'가',(int)'각');
		System.out.printf("7. %c %c %c %c\n", '가', 'A', '!', '3');
		System.out.printf("8. %b\n", true);
		System.out.printf("9. %f %e\n", 100.0, 100.0);
		System.out.printf("10. %.2f\n", 123.5678);
		System.out.printf("11. |%s|\n", "자바");
		System.out.printf("12. |%10s|\n", "자바");
		System.out.printf("13. |%-10s|\n", "자바");
		System.out.printf("14. %,d원\n", 1000000);			
	}
}


// %b = boolean, %c = char, %x = , %o = , %








