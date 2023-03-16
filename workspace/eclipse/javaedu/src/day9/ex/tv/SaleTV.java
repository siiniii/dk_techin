package day9.ex.tv;

public class SaleTV extends TV {
	private int price;
	
	public SaleTV(){
		
	}

	public SaleTV(String model, int size, int channel,int price) {
		super(model, size, channel);
		this.price = price;
	}
	public void play() {
		System.out.printf("판매 TV채널 %d번의 프로를 플레이합니다.", getChannel());
	}
	public void sale() {
		System.out.printf("%s 모델의 상품을 판매합니다. %,d원을 지불해주세요.",getModel(), price);
	}
	public String toString() {
		return String.format("판매상품정보 : 모델명(%s), 가격(%,d원), 크기(%d)", getModel(),price, getSize());
	}
}
