package day008.ex;

abstract class Mobile {
	private String mobileName;
	private int batterySize;
	private String osType;
	
	public Mobile() {
		
	}
	
	public Mobile(String mobileName, int batterySize, String osType) {
		this.mobileName = mobileName;
		this.batterySize = batterySize;
		this.osType = osType;
	}

	public abstract void operate(int time);
	public abstract void charge(int time);

	/* Getter Setter */
	public String getMobileName() {
		return mobileName;
	}

	public int getBatterySize() {
		return batterySize;
	}

	public String getOsType() {
		return osType;
	}

	public void setMobileName(String mobileName) {
		this.mobileName = mobileName;
	}

	public void setBatterySize(int batterySize) {
		this.batterySize = batterySize;
	}

	public void setOsType(String osType) {
		this.osType = osType;
	}
	
}
	/* Mobile을 상속받는 Ltab class */
	class Ltab extends Mobile{
		public Ltab() {

		}
		
		public Ltab(String mobileName, int betterySize, String osType) {
			super(mobileName, betterySize, osType);
		}

		public void operate(int time) {
			setBatterySize(getBatterySize()-(time*10));
		}
		public void charge(int time) {
			setBatterySize(getBatterySize()+(time*10));
		}
		
	}
	
	/* Mobile을 상속받는 Otab class */
	class Otab extends Mobile{
		public Otab() {

		}
		public Otab(String mobileName, int betterySize, String osType) {
			super(mobileName,betterySize,osType);
		}
		public void operate(int time) {
			setBatterySize(getBatterySize()-(time*12));
		}
		public void charge(int time) {
			setBatterySize(getBatterySize()+(time*8));
		}
		
	}


public class MobileTest {

	public static void main(String[] args) {
		
		Mobile lTab = new Ltab("Ltab", 500, "ABC-01"); 
		Mobile oTab = new Otab("Otab", 1000, "XYZ-20"); 
		
		printTitle();
		printMobile(lTab);
		printMobile(oTab);
		System.out.println();
		
		System.out.println("[10분 충전]");
		printTitle();
		lTab.charge(10);
		oTab.charge(10);
		printMobile(lTab);
		printMobile(oTab);
		System.out.println();
		
		System.out.println("[5분 통화]");
		printTitle();
		lTab.operate(5);
		oTab.operate(5);
		printMobile(lTab);
		printMobile(oTab);
		
	}
	
	public static void printMobile(Mobile mobile) {
		System.out.println(mobile.getMobileName() +"\t\t" + mobile.getBatterySize()+"\t\t"+ mobile.getOsType());
	}
	
	public static void printTitle() {
		System.out.println("Mobile\t\tBattery\t\tOs");
		System.out.println("----------------------------------------------");
	}
		
	

}
