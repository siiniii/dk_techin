package day4.ex;

public class ArrayLab3 {

	public static void main(String[] args) {
		char let[] = { 'J', 'a', 'v', 'a' };

		for (int i = 0; i < let.length; i++) {
			if (let[i] < 97) {
				let[i] += 32;
			} else {
				let[i] -= 32;
			}
			System.out.println(let[i]);
		}

	}
}
