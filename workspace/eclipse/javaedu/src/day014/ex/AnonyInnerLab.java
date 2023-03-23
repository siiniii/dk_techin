package day014.ex;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

import day006.ex.Book;

public class AnonyInnerLab {

	public static void main(String[] args) {

		ArrayList<Book> list = new ArrayList<>();

		list.add(new Book("이것이 자바다", "신용권", 36000));
		list.add(new Book("이것이 우분투 리눅스다", "우재남", 28800));
		list.add(new Book("이것이 취업을 위한 코딩 테스트다 with 파이썬", "나동빈", 30600));
		list.add(new Book("이것이 자료구조+알고리즘이다 with C 언어", "박상현", 30600));
		list.add(new Book("이것이 Windows Server다", "우재남", 38700));
		
		for (Book data : list) {
			System.out.println(data);
		}
		System.out.println("\n[소팅 후]\n");
		Collections.sort(list, new Comparator<Book>() {

			@Override
			public int compare(Book o1, Book o2) {
//				if (o1.getPrice() < o2.getPrice()) {
//					return -1;
//				} else if (o1.getPrice() == o2.getPrice()) {
//					return 1;
//				} else {
//					return 0;
//				}
				return o1.getPrice() - o2.getPrice(); 
			}

		});
		
		for (Book data : list) {
			System.out.println(data);
		}

	}
}
