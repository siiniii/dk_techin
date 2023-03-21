package day012.ex;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class CountLab {

	public static void main(String[] args) {
		FileReader reader = null;
		BufferedReader br = null;
		int cnt = 0;

		try {
			reader = new FileReader("c:/iotest/yesterday.txt");
			br = new BufferedReader(reader);
			while (true) {
				String data = br.readLine();
				if (data == null)
					break;
				StringTokenizer st = new StringTokenizer(data);
				while (st.hasMoreTokens()) {
					String token = st.nextToken();
					if (token.equals("yesterday"))
						cnt++;
				}
			}
			System.out.printf("yesterday 라는 단어는 %d개 있습니다.", cnt);
		} catch (FileNotFoundException fnfe) {
			System.out.println("파일이 존재하지 않습니다.");
		} catch (IOException ioe) {
			System.out.println("파일을 읽을 수 없습니다.");
		} finally {
			try {
				br.close();
				reader.close();
			} catch (Exception e) {
				e.printStackTrace();
			}

		}
	}

}
