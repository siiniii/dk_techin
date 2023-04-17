package day016.ex.mvclab.test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.fail;

import java.util.Scanner;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import day016.ex.mvclab.model.StudentDAO;
import day016.ex.mvclab.model.StudentDTO;

class StudentDAOTest {
	
	StudentDAO dao = new StudentDAO();
	
	@Test
	void test() {
		fail("Not yet implemented");
	}
	
	@Test
	void test_getAllStudent() {
		assertTrue(dao.getAllStudent().size() > 0);
	}
	
	@DisplayName("INSERT 기능 체크")
	@Test
	void test_insertStudent() {
		System.out.println("입력할 이름과 점수를 '이름:점수; 형식으로 입력하세요 : ");
		String inputStr = new Scanner(System.in).nextLine();
		String[] param = inputStr.split(":");
		StudentDTO dto = new StudentDTO();
		dto.setName(param[0]);
		dto.setScore(Integer.parseInt(param[1]));
		assertEquals(dao.insertStudent(dto), true);
		
	}
	
}
