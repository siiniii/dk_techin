package day008.ex.mobile;

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
