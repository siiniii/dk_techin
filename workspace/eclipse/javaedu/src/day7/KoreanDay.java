package day7;

import java.util.*;

public class KoreanDay {
	public static String day;
	// korDayName : 한국어기반의 요일
	static String korDayName[] = { "", "일요일", "월요일", "화요일", "수요일", "목요일", "금요일", "토요일" };
	static {
		// System.out.println("ㅋㅋㅋㅋㅋㅋㅋㅋㅋㅋㅋㅋ");
		GregorianCalendar cal = new GregorianCalendar();
		int numDay = cal.get(Calendar.DAY_OF_WEEK);
		day = korDayName[numDay];
	}
}
