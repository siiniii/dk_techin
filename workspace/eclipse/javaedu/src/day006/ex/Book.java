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

//	public String getBookInfo() {
//		System.out.printf("[%s]\t[%s]\t[%,d원]\n ", title, author, price);
//	}

	public String getBookInfo() {
		return String.format("[%s] [%s] [%,d원] ", title, author, price); 
	}

	public int getPrice() {
		return price;
	}
	

	
}