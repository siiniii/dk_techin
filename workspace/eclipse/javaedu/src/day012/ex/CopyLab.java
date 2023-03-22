package day012.ex;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.time.LocalDate;

public class CopyLab {

	public static void main(String[] args) throws Exception {

		FileReader reader = null;
		
		// 시간
		LocalDate date = LocalDate.now();
		int yy = date.getYear();
		int MM = date.getMonthValue();
		int dd = date.getDayOfMonth();

		// 파일저장
		String name = String.format("c:/iotest/sample_%d_%d_%d.txt", yy, MM, dd);

		try (FileWriter writer = new FileWriter(name, true); 
				PrintWriter out = new PrintWriter(writer);) {
			// 파일읽기
			reader = new FileReader("c:/iotest/sample.txt");

			while (true) {
				int data = reader.read();
				if (data == -1)
					break;
				char ch = (char) data;
				out.print(ch);
			}
			System.out.println("저장 완료되었습니다.");
		} catch (FileNotFoundException fnfe) {
			System.out.println("파일이 존재하지 않습니다.");
		} catch (IOException ioe) {
			System.out.println("파일을 읽을 수 없습니다.");
		} finally {
			try {
				if (reader != null)
					reader.close();
			} catch (Exception e) {
				e.printStackTrace();
			}

		}
	}

}
