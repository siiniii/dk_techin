package jpamvcexam.controller;

import jpamvcexam.model.dao.StudentDAO;
import jpamvcexam.model.vo.Student;
import java.util.List;

public class StudentController {
	private StudentDAO dao;
	public StudentController() {
		dao = new StudentDAO();
	}

	public void printAll() {
		List<Student> list = dao.getAllStudent();
		for(Student entity : list) {
			System.out.println(entity);
		}
	}

	public void printScore(String name) {
		Student student = dao.getScore(name);
		if (student == null){
			System.out.println(name + "학생은 존재하지 않습니다.");
		}
		else {
			System.out.print(student.getName() + "학생의 점수는 " + student.getScore() + "입니다.");
		}
	}

	public void insert(String name, int score) {
		Student student = new Student();
		student.setName(name);
		student.setScore(score);

		boolean result = dao.insertStudent(student);
		if (result)
			System.out.println("입력 성공");
		else 
			System.out.println("입력 실패");
	}
	
	public void update(String name, int score) {
		Student student = new Student();
		student.setName(name);
		student.setScore(score);
			boolean result = dao.updateStudent(student);
			if (result) {
				System.out.println(name + " 학생의 점수를 변경했습니다.");
			} else {
				System.out.println(name + " 학생은 존재하지 않습니다.");
			}

	}


	public void delete(String name) {
		boolean result = dao.deleteStudent(name);
		if (result)
			System.out.println(name + " 학생의 데이터를 삭제했습니다.");
		else
			System.out.println(name + " 학생은 존재하지 않습니다.");
	}


	
	public void close() {
		dao.close();
	}
	
}
