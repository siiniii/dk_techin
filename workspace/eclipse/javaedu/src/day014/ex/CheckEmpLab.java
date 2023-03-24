package day014.ex;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Scanner;

public class CheckEmpLab {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		String url = "jdbc:mysql://localhost:3306/edudb?characterEncoding=UTF-8&serverTimezone=UTC";
		String user = "jdbctest";
		String passwd = "jdbctest";
		String sql = "";

		try (Connection conn = DriverManager.getConnection(url, user, passwd);
				Statement stmt = conn.createStatement()) {

			while (true) {
				System.out.print("직원의 이름을 검색하세요 : ");
				String name = sc.next();
				sql = "SELECT ename, DATE_FORMAT(hiredate, '%Y년 %m월 %d일') hiredate, deptno FROM emp WHERE ename= \'" + name + "\'";
				ResultSet rs = stmt.executeQuery(sql);

				if ((rs.next())) {
					System.out.printf("%s 직원은 근무중입니다.\n %s에 입사했고 현재 %s 번부서에서 근무하고 있습니다.\n", rs.getString("ename"),
							rs.getString("hiredate"), rs.getString("deptno"));
				} else {
					System.out.printf("%s 직원은 근무하지 않습니다.", name);
				}
				sc.nextLine();
				
				System.out.print("그만 검색하려면 1을 입력하시고, 계속하려면 2를 입력하세요.");
				int no = sc.nextInt();
				if (no == 1) {
					System.out.println("프로그램을 종료합니다.");
					break;
				} else if (no != 2) {
					System.out.println("잘못된 값을 입력해서 프로그램이 종료되었습니다.");
					break;
				}
				rs.close();
			}
			
		} catch (Exception e) {
			System.err.println("오류 발생 : " + e);
		}
		sc.close();
	}
}
