package sourceCode.mobile;

public class Ltab extends Mobile{
	
	public Ltab() {}
	
	public Ltab(String mobileName, int batterySize, String osType) {
		super(mobileName, batterySize, osType);
	}
	
	public void operate(int time) {
		setBatterySize(getBatterySize() - (time*10));
	}
	
	public void charge(int time) {
		setBatterySize(getBatterySize() + (time*10));
	}
}
