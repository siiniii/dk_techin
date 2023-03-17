package sourceCode.day8.work;

public class Airplane extends Plane {
    public Airplane() {}
    public Airplane(String planeName, int fuelSize) {
        super(planeName, fuelSize);
    }
    public void flight(int distance) {
    	setFuelSize(getFuelSize() - 3 * distance);
    }
}
