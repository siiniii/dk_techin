package sourceCode.day2;

public class OperOrLab {

	public static void main(String[] args) {
		double rand = Math.random();
		int grade = (int) (rand * 6) + 1;

		if (grade == 4 || grade == 5 || grade == 6) {
			System.out.println(grade + "학년은 고학년입니다.");
		} else {
			System.out.println(grade + "학년은 저학년입니다.");
		}
	}

}
