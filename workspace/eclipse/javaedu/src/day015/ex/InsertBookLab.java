package day015.ex;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class InsertBookLab {

	public static void main(String[] args) {
		String url = "jdbc:mysql://localhost:3306/edudb?characterEncoding=UTF-8&serverTimezone=UTC";
		String user = "jdbctest";
		String passwd = "jdbctest";
		int cnt = 0;
		try (Connection conn = DriverManager.getConnection(url, user, passwd);
				PreparedStatement pstmt = conn.prepareStatement("INSERT INTO book(title, price, kind) VALUES (?, ?, ?) ");
				Scanner scan = new Scanner(System.in);){
			while(true) {
				System.out.print("도서명을 입력하세요 : ");
				String title = scan.nextLine();
				System.out.print("가격을 입력하세요 : ");
				int price = Integer.parseInt(scan.nextLine());
				System.out.print("도서분류에 대한 넘버를 입력하세요.\n"
						+ "\t1. 프로그래밍 언어\r\n"
						+ "\t2. 웹 프로그래밍\n"
						+ "\t3. 빅데이터\n"
						+ "\t4. 데이터베이스\n"
						+ "\t5. 인프라\n"
						+ "선택(1~5) : ");
				String kind = scan.nextLine();
				pstmt.setString(1,  title);
				pstmt.setInt(2, price);

				if(kind.equals("1")) {
					pstmt.setString(3, "b0"+kind);
				} else if(kind.equals("2")) {
					pstmt.setString(3, "b0"+kind);
				} else if(kind.equals("3")) {
					pstmt.setString(3, "b0"+kind);
				} else if(kind.equals("4")) {
					pstmt.setString(3, "b0"+kind);
				} else if(kind.equals("5")) {
					pstmt.setString(3, "b0"+kind);
				} else {
					pstmt.setString(3, null);
					System.out.println("입력하신 분류는 등록되지 않은 분류번호로 미분류도서로 등록됩니다.");
				}

				pstmt.executeUpdate();
				
				cnt++;
				System.out.println("정보가 입력되었습니다.");
				System.out.print("계속 입력하겠습니까?(y/n)");
				String aws = scan.nextLine();
				// equalsIgnorCase : 대소문자 구분 없이
				if (aws.equalsIgnoreCase("y")) {
					// continue; 생략가능
				} else if(aws.equalsIgnoreCase("n")) {
				System.out.printf("%d개의 데이터 입력 완료!", cnt);
				break;
				} else {
					System.out.print("잘못된 문자를 입력하여 프로그램이 종료됩니다.");
					System.out.printf("%d개의 데이터 입력 완료!", cnt);
					break;
				}
			}
		} catch (SQLException se) {
			System.out.println("오류발생" + se.getMessage());
		} 
	}

}
