package day012.ex.product;

import java.util.HashSet;

public class ProductTest {
	public static void main(String[] args) {

		Product p1 = new Product("p100", "TV", "20000");
		Product p2 = new Product("p200", "Computer", "10000");
		Product p3 = new Product("p100", "MP3", "700");
		Product p4 = new Product("p300", "Audio", "1000");

		HashSet<Product> set = new HashSet<Product>();

		p1.check(set.add(p1));
		p2.check(set.add(p2));
		p3.check(set.add(p3));
		p4.check(set.add(p4));

		System.out.println();

		System.out.println("제품ID\t\t제품명\t\t가격");
		System.out.println("------------------------------------------------");
		for (Product data : set)
			System.out.print(data);
	}

}
