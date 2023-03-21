package day006;

class Student {

	String name;
	int age;
	String subject;

	void printStudentInfo() {
		System.out.printf("%s학생의 나이는 %d입니다.\n", name, age);
	}

	void study() {
		System.out.printf("%s학생은 %s과목을 학습합니다.\n", name, subject);
	}

}

public class StudentTest {

	public static void main(String[] args) {

		Student st1 = new Student();
		Student st2 = new Student();

		System.out.println("st1이 참조하는 객체정보 : " + st1);
		System.out.println("st2이 참조하는 객체정보 : " + st2);

		st1.printStudentInfo();
		st1.study();
		
		System.out.println();
		
		st1.name = "둘리";
		st1.age = 10;
		st1.subject = "HTML";
		
		st1.printStudentInfo();
		st1.study();
		
		System.out.println();
		
		st2.name = "또치";
		st2.age = 10;
		st2.subject = "CSS3";
		
		st2.printStudentInfo();
		st2.study();
		
		System.out.println();
		
		st2 = st1;
		System.out.println("st1이 참조하는 객체정보 : " + st1);
		System.out.println("st2이 참조하는 객체정보 : " + st2);
		st2.printStudentInfo();
		st2.study();
	}

}
