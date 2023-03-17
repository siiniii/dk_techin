package sourceCode.day9.emp;
public class Company {
	public static void main(String[] args) {

		Employee[] emp = new Employee[2];

		emp[0] = new Secretary("Duke", 1, "Secretary", 800);
		emp[1] = new Sales("Tuxi", 2, "Sales", 1200);

		printEmployee(emp, false);

		System.out.println("\n[인센티브 100 지급]");
		((Bonus) emp[0]).incentive(100);
		((Bonus) emp[1]).incentive(100);
		printEmployee(emp, true);
	}

	public static void printEmployee(Employee[] emp, boolean isTax) {
		System.out.println("name\tdepartment\tsalary\t" + (isTax ? "tax\t" : "") + "extra pay");
		System.out.println("-----------------------------------------------------");

		String str = "";
		for (Employee data : emp) {			
			str = data.getName() + "\t" + data.getDepartment() + 
					 (data.getDepartment().length() > 6? "":"\t") +
					"\t" + data.getSalary() + "\t";
			if (isTax)
				str += data.tax() + "\t";
			if (data instanceof Sales) {
				str += ((Sales) data).getExtraPay();
			}
			System.out.println(str);
		}
	}
}
