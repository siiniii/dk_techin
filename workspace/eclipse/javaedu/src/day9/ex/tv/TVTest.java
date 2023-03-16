package day9.ex.tv;

public class TVTest {

	public static void main(String[] args) {
		SaleTV sale = new SaleTV("SALETV-1", 40, 1, 300000);
		RentalTV rent = new RentalTV("RENTALTV-10", 42, 1, 100000);

		sale.channelUp();
		sale.channelUp();

		rent.channelDown();
		rent.channelDown();
		rent.channelDown();

		printAllTv(sale);
		printAllTv(rent);

		printRentalTv(rent);
	}

	static void printAllTv(TV tv) {
		// System.out.println(tv.toString());
		// println이 자동으로 toString()을 호출할 수 있기 때문에 tv만 작성해도 된다.
		// toString은 Object이 가지고 있기 때문이다.
		System.out.println(tv);
		if (tv instanceof SaleTV) {
			((SaleTV) tv).play();
			System.out.println();
			((SaleTV) tv).sale();
			System.out.println();
		} else {
			((RentalTV) tv).play();
			System.out.println();
		}

	}

	static void printRentalTv(Rentable tv) {
		tv.rent();
	}
}
