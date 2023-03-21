package day012;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileReaderTest3 {
	public static void main(String args[]) {
		// UTF-8 문서 읽기
		try (FileReader reader = new FileReader("c:/iotest/output.txt");) {
			int data;
			System.out.println(reader.getEncoding());
			while (true) {
				data = reader.read();
				if (data == -1)
					break;
				System.out.print((char) data);
			}
		} catch (FileNotFoundException fnfe) {
			System.out.println("파일이 존재하지 않습니다.");
		} catch (IOException ioe) {
			System.out.println("파일을 읽을 수 없습니다.");
		}
	}
}
