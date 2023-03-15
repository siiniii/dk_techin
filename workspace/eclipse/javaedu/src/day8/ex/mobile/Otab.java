package day8.ex.mobile;

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