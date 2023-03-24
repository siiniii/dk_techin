package day015.ex;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class CreateBookLab {

	public static void main(String[] args) {
		
		Connection conn = null;
		Statement stmt = null;
		try {
			String url = "jdbc:mysql://localhost:3306/edudb?characterEncoding=UTF-8&serverTimezone=UTC";
			String user = "jdbctest";
			String passwd = "jdbctest";
			conn = DriverManager.getConnection(url, user, passwd);	
			stmt = conn.createStatement();
			stmt.executeUpdate("CREATE TABLE book (id INT PRIMARY KEY AUTO_INCREMENT, title VARCHAR(90), price INT, kind CHAR(3))" );
			System.out.println("book 테이블 생성 완료!");	
						
		} catch (SQLException se1) {
			System.out.println("오류발생" + se1);
		} finally {
			try {
				stmt.close();
				conn.close();
			} catch (SQLException se2) {
				System.out.println("오류발생" + se2);
			}
		}
		
	}

}
