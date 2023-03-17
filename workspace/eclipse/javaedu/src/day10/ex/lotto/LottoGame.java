package day10.ex.lotto;

import day5.ex.MethodLab7;

public class LottoGame {

	public static void main(String[] args) throws DuplicateException {
		LottoMachine lottoM = new LottoMachine();
		lottoM.createLottoNums();
		
		System.out.print("로또번호 확인 : ");
		MethodLab7.printArray(lottoM.getNums());
		
		try {
			lottoM.checkLottoNums();
		} catch (DuplicateException e) {
			System.out.println(e.getMessage());
			return;
		}
		MethodLab7.printArray(lottoM.getNums());
		
		

	}

}
