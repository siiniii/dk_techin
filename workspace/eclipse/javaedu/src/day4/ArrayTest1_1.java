package day4;

public class ArrayTest1_1 {
	public static void main(String[] args) {
		int[] score = new int[5];
		System.out.println(score);
		System.out.println(score.length);
		
		// 데이터를 하나하나 꺼낼 수 있는 값들만 올 수 있다.
		// 첫번째 엘리먼트에서부터 마지막 엘리먼트까지 하나하나 조회하는 for문
		// for each문
		for (int e : score)
			System.out.println(e);		
		
		for(int i=0; i < score.length; i++)
            score[i] = (i+1)*100;
		
		for (int e : score)
			System.out.println(e);
	}
}
