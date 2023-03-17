package sourceCode.day8.mobile;

public class Otab extends Mobile{

	public Otab() {}
	public Otab(String mobileName, int batterySize, String osType) {
		super(mobileName, batterySize, osType);
	}
	
	public void operate(int time) {
		setBatterySize(getBatterySize() - (time*12));
	}
	
	public void charge(int time) {
		setBatterySize(getBatterySize() + (time*8));
	}
}
