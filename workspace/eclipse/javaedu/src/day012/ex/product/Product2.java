package day012.ex.product;

import java.util.Objects;

class Product2 implements Comparable<Product2>{
	private String productID;
	private String productName;
	private String productPrice;

	public Product2(String productID, String productName, String productPrice) {
		this.productID = productID;
		this.productName = productName;
		this.productPrice = productPrice;
	}

	@Override
	public String toString() {
		return String.format("%s\t\t%s\t\t%d,원\n", productID, productName, productPrice); 
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


