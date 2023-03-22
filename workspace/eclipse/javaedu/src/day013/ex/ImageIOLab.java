package day013.ex;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Scanner;

public class ImageIOLab {

	public static void main(String[] args) {

		String path = "C:/iotest/myimage";
		File isDir = new File(path);
		if (!isDir.exists()) {
			isDir.mkdirs();
		}
		try {
			Scanner sc = new Scanner(new File("c:/iotest/list.txt"));
			String filename = null;
			String url = null;

			while (sc.hasNext()) {
				String line = sc.nextLine();
				Scanner sc2 = new Scanner(line).useDelimiter(",");

				filename = sc2.next();
				url = sc2.next();

				URL req = new URL(url);
				InputStream is = req.openStream();
				String fileName = "c:/iotest/myimage/" + filename + ".jpg";
				FileOutputStream fos = new FileOutputStream(fileName);
				int input = 0;
				while (true) {
					input = is.read();
					// 데이터가 없으면 break;
					if (input == -1) {
						break;
					}
					fos.write(input);
				}
				fos.close();
			}

			System.out.println("jpg가 성공적으로 저장되었습니다.");

		} catch (MalformedURLException e) {
			System.out.println("URL문자열 오류 : " + e.getMessage());
		} catch (IOException e) {
			System.out.println("IO 오류 : " + e.getMessage());
		}
		

	}

}
