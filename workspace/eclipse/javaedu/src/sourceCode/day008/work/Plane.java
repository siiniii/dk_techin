package sourceCode.day008.work;

abstract class Plane {
    // 멤버 변수
    private String planeName;
    private int fuelSize;

    // 생성자
    public Plane() {}

    public Plane(String planeName, int fuelSize) {
        this.planeName = planeName;
        this.fuelSize = fuelSize;
    }
    // Getter, Setter
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

    // 메서드
    public void refuel(int fuel) {
        // 일정 양의 연료 리필
        fuelSize += fuel;
    }
    public abstract void flight(int distance);
}
