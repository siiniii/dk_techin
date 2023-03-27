package day016.ex.mvclab.controller;

import day016.ex.mvclab.model.StudentDAO;
import day016.ex.mvclab.model.StudentDTO;

public class StudentController {
	StudentDTO dto = new StudentDTO();
	StudentDAO dao = new StudentDAO();
	
	public void printAll() {
		System.out.println("학생 정보 출력");
		System.out.println("---------------");
		System.out.println(dao.getAllStudent());
	}
	
	public void printScore(String name) {
		dto.setName(name);
		System.out.printf("%s 학생의 점수는 %d 입니다\n", name, dao.getScore(dto));
	}
	
	public void insert(String name, int score) {
		dto.setName(name);
		dto.setScore(score);
		
		if (dao.insertStudent(dto)) {
			System.out.println("입력 성공\n");
		} else {
			System.out.println("입력 실패\n");
		}
		
	}
	
	public void update(String name, int score) {
		dto.setName(name);
		dto.setScore(score);
		
		if (dao.updateStudent(dto)) {
			System.out.printf("%s 학생의 점수를 변경했습니다.\n", name);
		} else {
			System.out.printf("%s 학생은 존재하지 않습니다.\n", name);
		}
	}
	
	public void delete(String name) {
		dto.setName(name);
		if (dao.deleteStudent(dto)) {
			System.out.printf("%s 학생의 데이터를 삭제했습니다.\n", name);
		} else {
			System.out.printf("%s 학생은 존재하지 않습니다.\n", name);
		}
	}
}
