package day012.ex;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.text.SimpleDateFormat;
import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.format.TextStyle;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Locale;

public class CopyLab {

	public static void main(String[] args) throws Exception {
		// 현재시간
		SimpleDateFormat simpleDate = new SimpleDateFormat("yyyyMMdd");
		Date date = new Date();
		String today = simpleDate.format(date);
		Date selectDate = simpleDate.parse(today);
		Calendar cal = new GregorianCalendar(Locale.KOREA);
		cal.setTime(selectDate);
		today = simpleDate.format(cal.getTime());
		
		try (FileWriter writer = new FileWriter("C:/iotest/today.txt", true);
				PrintWriter out = new PrintWriter(writer);) {
		// 파일읽기
		try (FileReader reader = new FileReader("c:/iotest/sample.txt");
				BufferedReader br = new BufferedReader(reader);) 
			{
			String data;
			while (true) {
				data = br.readLine();
				if (data == null)
					break;
				System.out.println(data);
			}
		} catch (FileNotFoundException fnfe) {
			System.out.println("파일이 존재하지 않습니다.");
		} catch (IOException ioe) {
			System.out.println("파일을 읽을 수 없습니다.");
		}
		}
		
		// 파일 저장하기
		
		
	}

}
