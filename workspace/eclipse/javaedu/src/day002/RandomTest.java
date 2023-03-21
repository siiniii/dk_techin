package day002;

public class RandomTest {

	public static void main(String[] args) {
		double rand = Math.random(); // 0.0 <= ? < 1.0
		System.out.println(rand);     
		System.out.println(rand*10);
		System.out.println(rand*100);
		System.out.println(rand*6);
		System.out.println((int)(rand*10));    		  // 0 ~9
		System.out.println((int)(rand*100));  		 // 0 ~ 99
		System.out.println((int)(rand*6));   		// 0 ~ 5
		System.out.println((int)(rand*10)+1); 	   // 0 ~ 10  
		System.out.println((int)(rand*100)+1);    // 0 ~ 100  
		System.out.println((int)(rand*6)+1);  	 // 0 ~ 6  
		System.out.println((int)(rand*45)+1); 	// 0 ~ 45    
	}

}
