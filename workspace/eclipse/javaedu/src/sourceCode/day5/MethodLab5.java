package sourceCode.day5;

public class MethodLab5 {
	public static void main(String[] args) {
		int executeCount = 5;
		while (executeCount > 0) {
			System.out.print(getRandom(10));
			if (executeCount != 1) {
				System.out.print(",");
			}
			executeCount--;
		}
		System.out.println();

		executeCount = 5;
		while (executeCount > 0) {
			System.out.print(getRandom(10, 20));
			if (executeCount != 1) {
				System.out.print(",");
			}
			executeCount--;
		}
	}

	public static int getRandom(int n) {
		return (int) (Math.random() * (n) + 1);
	}

	public static int getRandom(int n1, int n2) {
		int biggerNum = 0;
		int smallerNum = 0;

		if (n1 > n2) {
			biggerNum = n1;
			smallerNum = n2;
		} else if (n1 < n2) {
			biggerNum = n2;
			smallerNum = n1;
		} else {
			biggerNum = n1;
			smallerNum = n1;
		}

		return (int) (Math.random() * (biggerNum - smallerNum + 1) + smallerNum);
	}

}
