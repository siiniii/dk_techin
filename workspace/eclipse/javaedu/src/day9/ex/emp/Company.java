package day9.ex.emp;

public class Company {

	public static void main(String[] args) {
		Employee[] emp = new Employee[2];
		Secretary sec = new Secretary("Duke", 1, "secretary", 800);
		Sales sal = new Sales("Tuxi", 2, "sales", 1200);

		emp[0] = sec;
		emp[1] = sal;
		printEmployee(emp, false);
		System.out.println();

		System.out.println("[인센티브 100 지급]");
		sec.incentive(100);
		sal.incentive(100);
		printEmployee(emp, true);

	}

	public static void printEmployee(Employee[] emp, boolean isTax) {
		Secretary sec = (Secretary) emp[0];
		Sales sal = (Sales) emp[1];
		
		System.out.println("name\t\tdepartment\t\tsalary\t\t" + (isTax ? "tax\t\t" : "") + "extra pay");
		System.out.println("-------------------------------------------------------------------------------------");
		if (isTax == false) {
			System.out.println(sec.getName() + "\t\t" + sec.getDepartment() + "\t\t" + sec.getSalary() + "\t\t");
			System.out.println(sal.getName() + "\t\t" + sal.getDepartment() + "\t\t\t" + sal.getSalary() + "\t\t"
					+ sal.getExtraPay());

		} else {
			System.out.println(
					sec.getName() + "\t\t" + sec.getDepartment() + "\t\t" + sec.getSalary() + "\t\t" + sec.tax());
			System.out.println(sal.getName() + "\t\t" + sal.getDepartment() + "\t\t\t" + sal.getSalary() + "\t\t"
					+ sal.tax() + "\t\t" + sal.getExtraPay());

		}
	}

}
