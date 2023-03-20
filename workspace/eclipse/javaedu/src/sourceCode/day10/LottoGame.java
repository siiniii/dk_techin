package sourceCode.day10;
public class LottoGame {
	public static void main(String[] args) {
		LottoMachine lotto = new LottoMachine();		
		lotto.createLottoNums();
		System.out.print("확인 : ");
		day5.ex.MethodLab7.printArray(lotto.getNums());	
		try {
			lotto.checkLottoNums();			
		}catch(DuplicateException e) {
			System.out.println(e.getMessage());
			return;
		}		
		day5.ex.MethodLab7.printArray(lotto.getNums());		
	}
}
