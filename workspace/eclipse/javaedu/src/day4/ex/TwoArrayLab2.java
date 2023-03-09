package day4.ex;

public class TwoArrayLab2 {

	public static void main(String[] args) {
		char alpha [][] = {
		         { 'B', 'C', 'A', 'A'},
		         { 'C', 'C', 'B', 'B'},
		         { 'D', 'A', 'A', 'D'}						
              };

		int[] no = new int[4];
		
		for (int i = 0; i < alpha.length; i++) {
			for (int j = 0; j < alpha[i].length; j++)
		 if(alpha[i][j] == 'A'){
			no[0] += 1;
		} else if(alpha[i][j] == 'B'){
			no[1] += 1;
		} else if(alpha[i][j] == 'C'){
			no[2] += 1;
		} else {
			no[3] += 1;
		}
			}
		for (int i = 0; i < no.length; i++) {
            
  		System.out.printf("%c는 %d개 입니다.\n",i+'A', no[i]);
		}
		}

}
