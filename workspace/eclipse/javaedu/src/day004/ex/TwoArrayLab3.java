package day004.ex;

public class TwoArrayLab3 {

	public static void main(String[] args) {
		int[][] hour = { {5,  2,  1,  0,  2,  3,  6},
						 {4,  3,  2,  1,  1,  0,  5},
						 {3,  1,  2,  1,  3,  1,  3},
						 {4,  3,  1,  0,  4,   2,  7}
		};
	
		int[] day = new int[7];
		int[] week = new int[4];
		
		char[] weekA = {'일','월','화','수','목','금','토'};
		
		

		
		for (int i = 0; i < hour.length; i++) {
			for (int j = 0; j < hour[i].length; j++) {
				week[i] += hour[i][j];
				day[j] += hour[i][j];
			}

		}
		
		for (int i = 0; i < day.length; i++) {
			System.out.printf("%c요일 : %d시간\n", weekA[i], day[i]);
		}
		System.out.println();
		
		for (int i = 0; i < week.length; i++) {
			System.out.printf("%d주차 : %d시간\n", i + 1, week[i]);
		}
		
//		for (int i = 0; i < hour[0].length; i++) {
//		for (int j = 0; j < hour.length; j++) {
//			day[i] += hour[j][i];
//		}
//		
//	}
		
//		System.out.printf("일요일 : %d시간\n"
//				+ "월요일 : %d시간\n"
//				+ "화요일 : %d시간\n"
//				+ "수요일 : %d시간\n"
//				+ "목요일 : %d시간\n"
//				+ "금요일 : %d시간\n"
//				+ "토요일 : %d시간\n",
//				day[0],
//				day[1],
//				day[2],
//				day[3],
//				day[4],
//				day[5],
//				day[6]);
//		System.out.println();
		
		
//		for (int i = 0; i < hour.length; i++) {
//			for (int j = 0; j < hour[i].length; j++) {
//				week[i] += hour[i][j];
//			}
//			
//			System.out.printf("%d주차 : %d시간\n", i+1 ,week[i]);
//			
//		}
		
		

	}

}
