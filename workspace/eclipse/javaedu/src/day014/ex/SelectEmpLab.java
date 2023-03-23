package day014.ex;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Random;

public class SelectEmpLab {
	public static void main(String[] args)throws Exception {
		
		String url = "jdbc:mysql://localhost:3306/edudb?characterEncoding=UTF-8&serverTimezone=UTC";
		String user = "jdbctest";
		String passwd = "jdbctest";
		Connection conn = DriverManager.getConnection(url,user,passwd);
		Statement stmt = conn.createStatement();
		
		boolean random = new Random().nextBoolean();	
		System.out.println(random);
	
		if (random) {
			String sql = "SELECT ename, format(sal, 0) sal FROM emp";
			ResultSet rs = stmt.executeQuery(sql);	
				while (rs.next()) {
					System.out.printf("%s 직원의 월급은 %s달러입니다.\n", rs.getString("ename"), rs.getString("sal"));
				}
				rs.close();
				stmt.close();
				conn.close();
			} else {
				String sql = "SELECT ename, DATE_FORMAT(hiredate, '%Y년 %m월 %d일')hiredate FROM emp ORDER BY hiredate";
				ResultSet rs = stmt.executeQuery(sql);	
				while (rs.next()) {
					System.out.printf("%s 직원은 %s에 입사하였습니다.\n", rs.getString("ename"), rs.getString("hiredate"));
				}
				rs.close();
				stmt.close();
				conn.close();
			}
		
		
		} 
	
}	



