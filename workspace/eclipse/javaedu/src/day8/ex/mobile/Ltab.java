package day8.ex.mobile;

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