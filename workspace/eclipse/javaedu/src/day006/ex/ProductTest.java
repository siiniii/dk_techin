package day006.ex;

class Product {
	String name;
	int balance;
	int price;

	Product() {
		this("듀크인형", 5, 10000);
	}

	Product(String name, int balnce, int price) {
		this.name = name;
		this.balance = balnce;
		this.price = price;
	}

	void getName() {
		System.out.printf("%s\t", name);
	}

	void getBalance() {
		System.out.printf("%d\t", balance);
	}

	void getPrice() {
		System.out.printf("%,d원\n", price);
	}
}

public class ProductTest {

	public static void main(String[] args) {
		Product[] pd = new Product[5];

		pd[0] = new Product("둘리인형", 3, 7200);
		pd[1] = new Product("또치인형", 7, 12000);
		pd[2] = new Product("우디인형", 2, 15000);
		pd[3] = new Product("알렌인형", 1, 30000);
		pd[4] = new Product();

		for (Product data : pd) {
			data.getName();
			data.getBalance();
			data.getPrice();
		}
	}
}
