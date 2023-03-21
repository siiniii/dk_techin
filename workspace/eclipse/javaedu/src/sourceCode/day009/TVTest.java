package sourceCode.day009;

interface Rentable {
	void rent();
}

class TV {
	private String model;
	private int size;
	private int channel;

	/* getter & setter */
	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public int getSize() {
		return size;
	}

	public void setSize(int size) {
		this.size = size;
	}

	public int getChannel() {
		return channel;
	}

	public void setChannel(int channel) {
		this.channel = channel;
	}

	public TV() {
	}

	public TV(String model, int size, int channel) {
		this.model = model;
		this.size = size;
		this.channel = channel;
	}

	public void channelUp() {
		channel++;
		if (channel > 10) {
			channel = 1;
		}		
	}

	public void channelDown() {
		channel--;
		if (channel < 1) {
			channel = 10;
		}		
	}
}

class SaleTV extends TV {
	private int price;

	/* getter & setter */
	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public SaleTV() {
	}

	public SaleTV(int price, String model, int size, int channel) {
		super(model, size, channel);
		this.price = price;
	}

	public void play() {
		System.out.printf("판매 TV 채널의 %d번 프로를 플레이합니다.\n", getChannel());
	}

	public void sale() {
		System.out.printf("%s 모델의 상품을 판매합니다. %,d원을 지불해주세요.\n", getModel(), price);
	}

	/*public String toString() {
		return String.format("판매상품정보 : 모델명(%s), 가격(%,d원), 크기(%d)", getModel(), price, getSize());
	}*/
}

class RentalTV extends TV implements Rentable {
	private int price;

	/* getter & setter */
	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public RentalTV() {
	};

	public RentalTV(int price, String model, int size, int channel) {
		super(model, size, channel);
		this.price = price;
	}

	public void play() {
		System.out.printf("대여 TV 채널의 %d번 프로를 플레이합니다.\n", getChannel());
	};

	public void rent() {
		System.out.printf("%s 모델의 상품을 대여합니다. %,d원을 지불해주세요.\n", getModel(), price);
	};

	public String toString() {
		return String.format("대여상품정보 : 모델명(%s), 가격(%,d원), 크기(%d)", getModel(), price, getSize());
	};
}

public class TVTest {
	public static void main(String[] args) {
		SaleTV saletv = new SaleTV(300000, "SALETV-1", 40, 1);
		RentalTV rentaltv = new RentalTV(100000, "RENTALTV-10", 42, 1);

		for (int i = 0; i < 2; i++) {
			saletv.channelUp();
			rentaltv.channelDown();
		}
		rentaltv.channelDown();

		printAll(saletv);
		printAll(rentaltv);

		printRentalTV(rentaltv);

	}

	static void printAll(TV tv) {
		System.out.println(tv.toString());
		if (tv instanceof RentalTV) {
			((RentalTV) tv).play();
		}
		else if (tv instanceof SaleTV) {
			((SaleTV) tv).play();
			((SaleTV) tv).sale();
		}
	}

	static void printRentalTV(Rentable tv) {
		tv.rent();
	}
}
