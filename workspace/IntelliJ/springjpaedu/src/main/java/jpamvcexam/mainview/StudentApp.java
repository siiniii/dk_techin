package jpamvcexam.mainview;

import jpamvcexam.controller.StudentController;

import java.util.Scanner;

public class StudentApp {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		StudentController stCon = new StudentController();
		while (true) {
			System.out.println("처리하려는 기능을 선택하세요.");
			System.out.println("1. 학생 정보 출력");
			System.out.println("2. 학생 정보 입력");
			System.out.println("3. 학생 정보 삭제");
			System.out.println("4. 학생 정보 수정");
			System.out.println("5. 학생 점수 확인");
			System.out.println("6. 종료");
			System.out.print("입력 : ");
			int num = scan.nextInt();
			scan.nextLine();

			if (num == 1) { // 해결
				stCon.printAll();
			} else if (num == 2) { // 해결
				System.out.println("등록하려는 학생의 이름과 점수를 입력하세요. ");
				System.out.print("학생 이름 : ");
				String name = scan.nextLine();
				System.out.print("학생 점수 : ");
				int score = scan.nextInt();
				stCon.insert(name, score);
			}  else if (num == 3) { // 해결
				System.out.print("삭제하려는 학생의 이름을 입력하세요 : ");
				String name = scan.nextLine();
				stCon.delete(name);
			}  else if (num == 4) {
				System.out.print("점수를 수정하려는 학생의 이름을 입력하세요 : ");
				String name = scan.nextLine();
				System.out.print("점수를 수정하려는 점수를 입력하세요 : ");
				int score = scan.nextInt();
				stCon.update(name, score);
			}else if (num == 5) { // 해결
				System.out.print("점수를 조회하려는 학생의 이름을 입력하세요 : ");
				String name = scan.nextLine();
				stCon.printScore(name);
			} else if (num == 6) {
				break;

			} else {
				System.out.println("등록되지 않은 번호를 입력하여 프로그램이 종료됩니다.");
				break;
			}
			System.out.println("\n------------------------------------------- ");
		}
		scan.close();
		stCon.close();
		System.out.println("----------------------종료----------------------- ");
	}
}
