package day009.ex.emp;

class Sales extends Employee implements Bonus {
	public Sales() {
	}

	public Sales(String name, int number, String department, int salary) {
		super(name, number, department, salary);
	}
	
	public double tax() {
		return (double)getSalary()*0.13;	
		
	}
	public void incentive(int pay) {
		setSalary((int)((getSalary()+(pay*1.2))));
	}
	public double getExtraPay() {
		return getSalary()*0.03;
	}
}
