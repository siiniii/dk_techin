package day012.ex.product;

class Product2 implements Comparable<Product2>{
	private String productID;
	private String productName;
	private int productPrice;

	public Product2(String productID, String productName, int productPrice) {
		this.productID = productID;
		this.productName = productName;
		this.productPrice = productPrice;
	}

	@Override
	public String toString() {
		return String.format("%-10s%10s%,15d원\n", productID, productName, productPrice); 
	}
	
	@Override
	public int compareTo(Product2 p) {
		if(productPrice > p.productPrice) {
			return -1;
		} else if(productPrice == p.productPrice) {
			return 0;
		} else return 1;
	}
	
}


