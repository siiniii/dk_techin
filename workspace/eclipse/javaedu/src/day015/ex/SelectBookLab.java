package day015.ex;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class SelectBookLab {

	public static void main(String[] args) {

		String url = "jdbc:mysql://localhost:3306/edudb?characterEncoding=UTF-8&serverTimezone=UTC";
		String user = "jdbctest";
		String passwd = "jdbctest";

		try (Connection conn = DriverManager.getConnection(url, user, passwd);

				Scanner scan = new Scanner(System.in);) {
			while (true) {
				System.out.print("\n \t1. 모두 출력하기\n" + "	2. 가격이 높은 순으로 출력하기\n" + "	3. 20000 이상의 도서들만 출력하기\n"
						+ "	4. 웹 프로그래밍 도서들만 출력하기\n" + "	5. 데이터베이스와 인프라 도서들만 출력하기\n" + "	6. 도서명에 '자바'를 포함하는 도서들만 출력하기\n"
						+ "	7. 분류별 도서 가격의 평균을 출력하기\n\n" + "원하는 메뉴의 번호를 선택하세요 : \n");
				int no = Integer.parseInt(scan.nextLine());

				// 1. 모두 출력하기
				if (no == 1) {

					try (Statement stmt = conn.createStatement()) {
						ResultSet rs = stmt.executeQuery("SELECT id, title, price, kind FROM book ");
						System.out.printf("%s\t%s\t\t\t%s\t\t%s\n", "id", "title", "price", "kind");
						System.out.println("-------------------------------------------------------------------------");

						while (rs.next()) {
							System.out.printf("%d\t%s\t\t%,d원\t\t%s\n", rs.getInt("id"), rs.getString("title"),
									rs.getInt("price"), rs.getString("kind"));
						}
						rs.close();
						stmt.close();
					} catch (SQLException se) {
						System.out.println(se.getMessage());
					}

				} // 2. 가격이 높은 순으로 출력하기
				else if (no == 2) {
					try (Statement stmt = conn.createStatement()) {
						ResultSet rs = stmt.executeQuery("SELECT id, title, price, kind FROM book ORDER BY price DESC");
						System.out.printf("%s\t%s\t\t\t%s\t\t%s\n", "id", "title", "price", "kind");
						System.out.println("-------------------------------------------------------------------------");

						while (rs.next()) {
							System.out.printf("%d\t%s\t\t%,d원\t\t%s\n", rs.getInt("id"), rs.getString("title"),
									rs.getInt("price"), rs.getString("kind"));
						}
						rs.close();
						stmt.close();
					} catch (SQLException se) {
						System.out.println(se.getMessage());
					}

				} // 3. 20000 이상의 도서들만 출력하기
				else if (no == 3) {

					try (Statement stmt = conn.createStatement()) {
						ResultSet rs = stmt.executeQuery("SELECT title, price FROM book WHERE price>= 20000 ");
						System.out.printf("%s\t\t\t%s\n", "title", "price");
						System.out.println("------------------------------------------------");
						while (rs.next()) {
							System.out.printf("%s\t\t%,d원\n", rs.getString("title"), rs.getInt("price"));
						}
						rs.close();
						stmt.close();
					} catch (SQLException se) {
						System.out.println(se.getMessage());
					}

				} // 4. 웹 프로그래밍 도서들만 출력하기
				else if (no == 4) {
					try (Statement stmt = conn.createStatement()) {
						ResultSet rs = stmt.executeQuery("SELECT title, price FROM book WHERE kind = 'b02' ");
						System.out.printf("%s\t\t\t%s\n", "title", "price");
						System.out.println("------------------------------------------------");

						while (rs.next()) {
							System.out.printf("%s\t\t%,d원\n", rs.getString("title"), rs.getInt("price"));
						}
						rs.close();
						stmt.close();
					} catch (SQLException se) {
						System.out.println(se.getMessage());
					}

				} // 5. 데이터베이스와 인프라 도서들만 출력하기
				else if (no == 5) {
					try (Statement stmt = conn.createStatement()) {
						ResultSet rs = stmt
								.executeQuery("SELECT title, price FROM book WHERE kind = 'b04' OR kind = 'b05' ");
						System.out.printf("%s\t\t\t%s\n", "title", "price");
						System.out.println("------------------------------------------------");

						while (rs.next()) {
							System.out.printf("%s\t\t%,d원\n", rs.getString("title"), rs.getInt("price"));
						}
						rs.close();
						stmt.close();
					} catch (SQLException se) {
						System.out.println(se.getMessage());
					}
				} // 6. 도서명에 '자바'를 포함하는 도서들만 출력하기
				else if (no == 6) {
					try (Statement stmt = conn.createStatement()) {
						ResultSet rs = stmt.executeQuery("SELECT title, price FROM book WHERE title like '%자바%' ");
						System.out.printf("%s\t\t\t%s\n", "title", "price");
						System.out.println("------------------------------------------------");

						while (rs.next()) {
							System.out.printf("%s\t\t%,d원\n", rs.getString("title"), rs.getInt("price"));
						}
						rs.close();
						stmt.close();
					} catch (SQLException se) {
						System.out.println(se.getMessage());
					}
				} // 7. 분류별 도서 가격의 평균을 출력하기
				else if (no == 7) {
					try (Statement stmt = conn.createStatement()) {
						ResultSet rs = stmt.executeQuery(
								"SELECT kind, AVG(price)avg FROM book WHERE kind IS NOT NULL GROUP BY kind ");
						while (rs.next()) {
							String kind = rs.getString("kind");
							if (kind.equals("b01")) {
								System.out.printf("프로그래밍 언어 도서들의 가격 평균은 %,d원입니다.\n", rs.getInt("avg"));
							} else if (kind.equals("b02")) {
								System.out.printf("웹 프로그래밍 도서들의 가격 평균은 %,d원입니다.\n", rs.getInt("avg"));
							} else if (kind.equals("b03")) {
								System.out.printf("빅데이터 도서들의 가격 평균은 %,d원입니다.\n", rs.getInt("avg"));
							} else if (kind.equals("b04")) {
								System.out.printf("데이터베이스 도서들의 가격 평균은 %,d원입니다.\n", rs.getInt("avg"));
							} else if (kind.equals("b05")) {
								System.out.printf("인프라 도서들의 가격 평균은 %,d원입니다.\n", rs.getInt("avg"));
							}

						}
						rs.close();
						stmt.close();
					} catch (SQLException se) {
						System.out.println(se.getMessage());
					}
				} else {
				}
				
				System.out.print("\n계속 검색하시겠습니까?(y/n)");
				String aws = scan.nextLine();
				// equalsIgnorCase : 대소문자 구분 없이
				if (aws.equalsIgnoreCase("y")) {
					continue;
				}
				System.out.printf("시스템을 종료합니다.");
				break;
			}
		} catch (SQLException se) {
			System.out.println("오류발생" + se.getMessage());
		}

	}

}
