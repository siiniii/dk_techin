package day012.ex.product;

class Product2 implements Comparable<Product2>{
	private String productID;
	private String productName;
	private String productPrice;

	public Product2() {

	}

	public Product2(String productID, String productName, String productPrice) {
		this.productID = productID;
		this.productName = productName;
		this.productPrice = productPrice;
	}

	
	public String getProductPrice() {
		return productPrice;
	}

	@Override
	public String toString() {
		return String.format("%s\t\t%s\t\t%s원\n", productID, productName, getProductPrice()); 
	}
	
	public int compareTo(Product2 o) {
		int res = this.getProductPrice().compareTo(o.getProductPrice());
		return res;
	}
	
}


