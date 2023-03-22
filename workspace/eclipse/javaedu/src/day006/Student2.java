package day006;

import java.io.Serializable;

public class Student2 implements Serializable {

	private static final long serialVersionUID = 1L;
	
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

	public void study() {
		System.out.printf("%s학생은 %s과목을 학습합니다.\n", name, subject);
	}

}