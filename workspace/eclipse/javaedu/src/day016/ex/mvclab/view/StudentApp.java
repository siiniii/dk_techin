package day016.ex.mvclab.view;

import java.util.Scanner;

import day016.ex.mvclab.controller.StudentController;
import day016.ex.mvclab.model.StudentDTO;

public class StudentApp {
	public static void main(String[] args) {
		StudentDTO dto = new StudentDTO();
		Scanner sc = new Scanner(System.in);
		StudentController con = new StudentController();

		loop: while (true) {
			System.out.println("처리하려는 기능을 선택하세요.");
			System.out.println("1. 학생 정보 출력 ");
			System.out.println("2. 학생 정보 입력");
			System.out.println("3. 학생 정보 삭제");
			System.out.println("4. 학생 정보 수정");
			System.out.println("5. 학생 점수 확인");
			System.out.println("6. 종료");
			System.out.print("입력 : ");
			String aws = "";
			aws = sc.nextLine();

			switch (aws) {

			case "1":
				con.printAll();
				break;

			case "2":
				System.out.println("학생의 이름을 입력해주세요 : ");
				dto.setName(sc.nextLine());
				System.out.println("학생의 점수를 입력해주세요 : ");
				dto.setScore(Integer.parseInt(sc.nextLine()));
				con.insert(dto.getName(), dto.getScore());

				break;

			case "3":
				System.out.println("삭제하고자하는 학생의 이름을 입력해주세요 : ");
				dto.setName(sc.nextLine());
				con.delete(dto.getName());
				break;

			case "4":
				System.out.println("수정하고자하는 학생의 이름을 입력해주세요 : ");
				dto.setName(sc.nextLine());
				System.out.printf("%s학생의 점수를 입력해주세요 :", dto.getName());
				dto.setScore(Integer.parseInt(sc.nextLine()));
				con.update(dto.getName(), dto.getScore());
				break;

			case "5":
				System.out.println("점수를 조회하고싶은 학생의 이름을 입력해주세요 : ");
				dto.setName(sc.nextLine());
				con.printScore(dto.getName());

				break;
				
			case "6":
				break loop;
			}

		}
		sc.close();
		System.out.println("학사관리 애플리케이션을 종료합니다.");
		
	}
}
