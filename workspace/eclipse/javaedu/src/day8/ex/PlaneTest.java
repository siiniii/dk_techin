package day8.ex;

abstract class Plane{
	private String planeName;
	private int fuelSize;
	
	public Plane() {
	}

	public Plane(String planeName, int fuelSize) {
		this.planeName = planeName;
		this.fuelSize = fuelSize;
	}

	public String getPlaneName() {
		return planeName;
	}

	public void setPlaneName(String planeName) {
		this.planeName = planeName;
	}

	public int getFuelSize() {
		return fuelSize;
	}

	public void setFuelSize(int fuelSize) {
		this.fuelSize = fuelSize;
	}
	
	public void refuel(int fuel) {
		fuelSize += fuel;
	}
	public abstract void flight(int distance);
	
}

class Airplane extends Plane{
	public Airplane() {
	}
	public Airplane(String planeName, int fuelSize) {
		super(planeName, fuelSize);
	}
	public void flight(int distance) {
		setFuelSize(getFuelSize()-(distance*3));
	}
	
}

class Cargoplane extends Plane {
	public Cargoplane() {
	}

	public Cargoplane(String planeName, int fuelSize) {
		super(planeName, fuelSize);
	}
	public void flight(int distance) {
		setFuelSize(getFuelSize()-(distance*5));
	}
	
}

public class PlaneTest {

	public static void main(String[] args) {
		Plane[] list = new Plane[2];
		
		Airplane airplane = new Airplane("L747", 1000);
		Cargoplane cargoplane = new Cargoplane("C40", 1000);
		
		list[0] = airplane;
		list[1] = cargoplane;
		printInfo(list);
		System.out.println();
		
		System.out.println("[100 운항]");
		for(int i = 0; i < list.length; i++) {
			list[i].flight(100);
			
		}
		printInfo(list);
		System.out.println();
		
		System.out.println("[200 주유]");
		for(int i = 0; i < list.length; i++) {
			list[i].refuel(200);
		}
		printInfo(list);
		
		
	}
	
	public static void printInfo(Plane[] list) {
		System.out.println("Plane\t\tfuelSize");
		System.out.println("-------------------------------------");
		for(int i = 0; i < list.length; i ++) {
			System.out.println(list[i].getPlaneName()+"\t\t"+list[i].getFuelSize());
		}
		
		
		
	}

}
