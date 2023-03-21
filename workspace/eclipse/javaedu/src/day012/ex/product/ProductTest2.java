package day012.ex.product;

import java.util.Collections;
import java.util.LinkedList;

public class ProductTest2 {
	public static void main(String[] args) {
		LinkedList<Product2> list = new LinkedList<>();

		list.add(new Product2("p100", "TV", "20000"));
		list.add(new Product2("p200", "Computer", "10000"));
		list.add(new Product2("p100", "MP3", "700"));
		list.add(new Product2("p300", "Audio", "1000"));

		System.out.println("제품ID\t\t제품명\t\t가격");
		System.out.println("------------------------------------------------");
		
		Collections.sort(list);
		for(Product2 data : list) {
			System.out.print(data);
		}
	}

}
