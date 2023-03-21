package sourceCode.day008.mobile;

public class MobileTest {

	public static void main(String[] args) {
		Mobile mobile1 = new Ltab("Ltab",500,"ABC-01");
		Mobile mobile2 = new Otab("Otab",1000,"XYZ-20");
		
		printTitle();
		printMobile(mobile1);
		printMobile(mobile2);
		System.out.println("\n[10분충전]");
		mobile1.charge(10);
		mobile2.charge(10);
		printTitle();
		printMobile(mobile1);
		printMobile(mobile2);
		
		System.out.println("\n[5분통화]");
		mobile1.operate(5);
		mobile2.operate(5);
		printTitle();
		printMobile(mobile1);
		printMobile(mobile2);
	}
	

	public static void printMobile(Mobile mobile) {
		System.out.printf("%s\t\t%d\t\t%s\n",mobile.getMobileName(), mobile.getBatterySize(), mobile.getOsType());
	}
	
	public static void printTitle() {
		System.out.println("Mobile\tBattery\tOs\n------------------------------------");
	}
}
