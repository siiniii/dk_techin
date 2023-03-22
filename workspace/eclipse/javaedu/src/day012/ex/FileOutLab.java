package day012.ex;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.format.TextStyle;
import java.util.Locale;

public class FileOutLab {
	 public static void main(String[] args) {
		 String path = "c:/Temp";
			File dir = new File(path);
			
			if (!dir.exists()) {
				dir.mkdirs();
			}
			try (FileWriter writer = new FileWriter("c:/Temp/event.txt", true);
					PrintWriter out = new PrintWriter(writer);) {
				
				LocalDate ld1 = LocalDate.of(2023, 5, 5);
				DayOfWeek day1 = ld1.getDayOfWeek();
				String korday1 = day1.getDisplayName(TextStyle.FULL, Locale.KOREAN);
				out.printf("2023년년 5월 5일은 %s입니다.\r\n", korday1);
				
				LocalDate ld2 = LocalDate.of(2023, 6, 6);
				DayOfWeek day2 = ld2.getDayOfWeek();
				String korday2 = day2.getDisplayName(TextStyle.FULL, Locale.KOREAN);
				out.printf("2023년년 6월 6일은 %s입니다.\r\n", korday2);

				System.out.println("저장이 완료되었습니다.");

			} catch (Exception e) {
				System.out.println("파일에 저장하는 동안 오류가 발생했습니다.");
			}
	}
}
