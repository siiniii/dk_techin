package day012.ex.product;

import java.util.Objects;

class Product {
	private String productID;
	private String productName;
	private String productPrice;

	public Product() {

	}

	public Product(String productID, String productName, String productPrice) {
		this.productID = productID;
		this.productName = productName;
		this.productPrice = productPrice;
	}


	@Override
	public String toString() {
		return productID + "\t\t" + productName + "\t\t" + productPrice + "\n";
	}

	@Override
	public int hashCode() {
		return Objects.hash(productID);
	}

	public void check(boolean b) {
		if (b) {
			System.out.println("성공적으로 저장되었습니다.");
		} else {
			System.out.println("동일한 ID의 제품이 이미 저장되어있습니다.");
		}

	}

	@Override
	public boolean equals(Object o) {
		if (this == o)
			return true;
		if (o != null && o instanceof Product) {
			Product p = (Product)o;
			if(productID == p.productID)
				return true;
		}
		return false;
	}

}
