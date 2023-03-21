package sourceCode.day009.emp;

public class Sales extends Employee implements Bonus {
	public Sales() {}
	public Sales(String name, int number, String department, int salary) {
		super(name, number, department, salary);
	}
	public double tax() {
		return getSalary() * 0.13;
	}
	public void incentive(int pay) {
		int incen =  (int) Math.round(pay*1.2);
		setSalary(getSalary()+incen);
	}
	public double getExtraPay() {
		return getSalary()*0.03;
	}
}
