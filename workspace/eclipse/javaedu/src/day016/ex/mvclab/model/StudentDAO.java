package day016.ex.mvclab.model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import day016.mvc.MySQLConnect;

public class StudentDAO {
	

	public boolean insertStudent(StudentDTO dto) {
		boolean result = false;
		Connection conn = MySQLConnect.connect();
		try (PreparedStatement pstmt = conn.prepareStatement("INSERT INTO student (name, score) VALUES (?, ?) ")) {
			while (true) {
				pstmt.setString(1, dto.getName());
				pstmt.setInt(2, dto.getScore());
				int no = pstmt.executeUpdate();
				if (no > 0) {
					return true;
				}
				break;
			}
			result = true;
		} catch (SQLException se) {
			System.out.println(se.getMessage());
		}
		MySQLConnect.close(conn);
		return result;
	}

	public List<StudentDTO> getAllStudent() {
		List<StudentDTO> slist = null;
		Connection conn = MySQLConnect.connect();
		try (Statement stmt = conn.createStatement()) {
			ResultSet rs = stmt.executeQuery("SELECT name, score FROM student");
			slist = new ArrayList<StudentDTO>();
			while (rs.next()) {
				StudentDTO so = new StudentDTO();
				so.setName(rs.getString("name"));
				so.setScore(rs.getInt("score"));
				slist.add(so);
			}
		} catch (SQLException se) {
			System.out.println(se.getMessage());
		}
		MySQLConnect.close(conn);
		return slist;
	}

	public int getScore(StudentDTO dto) {
		int score = -1;
		Connection conn = MySQLConnect.connect();
		try (PreparedStatement pstmt = conn.prepareStatement("SELECT score FROM student WHERE name = ? ")) {
			pstmt.setString(1, dto.getName());
			ResultSet rs = pstmt.executeQuery();

			while (rs.next()) {
				score = rs.getInt("score");
			}
		} catch (SQLException se) {
			System.out.println(se.getMessage());
		}
		MySQLConnect.close(conn);
		return score;
	}

	public boolean updateStudent(StudentDTO dto) {
		boolean result = false;
		Connection conn = MySQLConnect.connect();
		try (PreparedStatement pstmt = conn.prepareStatement("UPDATE student SET score = ? WHERE name = ? ")) {

			pstmt.setInt(1, dto.getScore());
			pstmt.setString(2, dto.getName());

			int no = pstmt.executeUpdate();
			if (no > 0) {
				return true;
			}

		} catch (SQLException se) {
			System.out.println(se.getMessage());
		}
		MySQLConnect.close(conn);
		return result;
	}

	public boolean deleteStudent(StudentDTO dto) {
		boolean result = false;
		Connection conn = MySQLConnect.connect();
		try (PreparedStatement pstmt = conn.prepareStatement("DELETE FROM student WHERE name = ?")) {
			pstmt.setString(1, dto.getName());
			int no = pstmt.executeUpdate();
			if (no > 0) {
				result = true;
			}
		} catch (SQLException se) {
			System.out.println(se.getMessage());
		}
		MySQLConnect.close(conn);
		return result;
	}
}
