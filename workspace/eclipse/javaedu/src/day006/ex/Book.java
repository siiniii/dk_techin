package day006.ex;

public class Book {
	String title;
	String author;
	int price;

	public Book() {
		this("이것이 자바다", "신용권", 36000);
	}

	public Book(String title, String author, int price) {
		this.title = title;
		this.author = author;
		this.price = price;
	}

	public void getBookInfo() {
		System.out.printf("[%s]\t[%s]\t[%,d원]\n ", title, author, price);
	}

	@Override
	public String toString() {
		return String.format("[%s] [%s] [%,d원] ", title, author, price); 
	}

	public int getPrice() {
		return price;
	}
	

	
}