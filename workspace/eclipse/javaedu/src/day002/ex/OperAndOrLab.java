package day002.ex;

public class OperAndOrLab {

	public static void main(String[] args) {
		int grade = (int) (Math.random() * 6) + 1;

		if (grade < 2 && grade == 1) {
			System.out.println(grade + "학년은 저학년입니다.");
		} else if (grade <= 3) {
			System.out.println(grade + "학년은 저학년입니다.");
		} else {
			System.out.println(grade + "학년은 고학년입니다.");

		}

		if (grade >= 1 && grade <= 3) {
			System.out.println(grade + "학년은 저학년입니다.");
		} else {
			System.out.println(grade + "학년은 고학년입니다.");
		}

		/////////////////////////////////////////////////////

		if (grade == 1 || grade == 2 || grade == 3) {
			System.out.println(grade + "학년은 저학년입니다.");
		} else {
			System.out.println(grade + "학년은 고학년입니다.");
		}
	}

}
