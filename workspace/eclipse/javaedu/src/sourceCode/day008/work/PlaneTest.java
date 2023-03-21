package sourceCode.day008.work;

public class PlaneTest {
    public static void main(String[] args) {
    	Plane pl[] = new Plane[2];
        pl[0] = new Airplane("L747",1000);
        pl[1] = new Cargoplane("C40", 1000);

        printInfo(pl);

        System.out.println("\n\t[100 운항]");
        pl[0].flight(100);
        pl[1].flight(100);
        printInfo(pl);

        System.out.println("\n\t[200 주유]");
        pl[0].refuel(200);
        pl[1].refuel(200);
        printInfo(pl);
    }
    public static void printInfo(Plane[] list){
        System.out.printf("\t%s \t\t %s\n", "Plane", "fuelSize");
        System.out.printf("----------------------------\n");
        System.out.printf("\t%s \t\t %d\n", list[0].getPlaneName(), list[0].getFuelSize());
        System.out.printf("\t%s \t\t %d\n", list[1].getPlaneName(), list[1].getFuelSize());
    }
}
