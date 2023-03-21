package sourceCode.day006;

class Product {
	private String name;
	private int balance;
	private int price;

	Product() {
		this("듀크인형", 5, 100000);
	}

	Product(String name, int balance, int price) {
		this.name = name;
		this.balance = balance;
		this.price = price;
	}

	String getName() {
		return name;
	}

	int getBalance() {
		return balance;
	}

	int getPrice() {
		return price;
	}
}

public class ProductTest {
	public static void main(String[] args) {
		Product[] products = new Product[5];

		products[0] = new Product("둘리 인형", 4, 12000);
		products[1] = new Product("도우너 피규어", 0, 50000);
		products[2] = new Product("또치 연필", 100, 2000);
		products[3] = new Product("춘식이 공책", 50, 6000);
		products[4] = new Product();

		for (Product obj : products) {
			System.out.printf("(%s %d %,d원)\n", obj.getName(), obj.getBalance(), obj.getPrice());
		}

	}

}
