package sourceCode.day008.work;

public class Cargoplane extends Plane {
    public Cargoplane() {}
    public Cargoplane(String planeName, int fuelSize) {
        super(planeName, fuelSize);
    }
    public void flight(int distance) {    
    	setFuelSize(getFuelSize() - 5 * distance);
    }
}
