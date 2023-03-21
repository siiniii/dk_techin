package day008.ex.plane;

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
		for (int i = 0; i < list.length; i++) {
			list[i].flight(100);
		}
		printInfo(list);
		System.out.println();

		System.out.println("[200 주유]");
		for (int i = 0; i < list.length; i++) {
			list[i].refuel(200);
		}
		printInfo(list);

	}

	public static void printInfo(Plane[] list) {
		System.out.println("Plane\t\tfuelSize");
		System.out.println("-------------------------------------");
		for (int i = 0; i < list.length; i++) {
			System.out.println(list[i].getPlaneName() + "\t\t" + list[i].getFuelSize());
		}

	}

}