package day006;

class Student2 {

	String name;
	int age;
	String subject;

	public Student2(String name, int age, String subject) {
		this.name = name;
		this.age = age;
		this.subject = subject;
	}
	
	public void printStudentInfo() {
		System.out.printf("%s학생의 나이는 %d입니다.\n", name, age);
	}

	void study() {
		System.out.printf("%s학생은 %s과목을 학습합니다.\n", name, subject);
	}

}

public class StudentTest2 {

	public static void main(String[] args) {

		Student2 st1 = new Student2("둘리", 10, "HTML5");
		Student2 st2 = new Student2("또치", 10, "CSS3");
		// Student2 st3 = new Student2();
		
		System.out.println("st1이 참조하는 객체정보 : " + st1);
		System.out.println("st2이 참조하는 객체정보 : " + st2);

		st1.printStudentInfo();
		st1.study();
		
		System.out.println();
		
		st1.printStudentInfo();
		st1.study();
		
		System.out.println();
		
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
