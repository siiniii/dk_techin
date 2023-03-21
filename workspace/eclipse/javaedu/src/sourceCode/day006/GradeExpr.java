package sourceCode.day006;

public class GradeExpr {

	private int[] jumsu;

	public GradeExpr(int[] jumsu) {
		this.jumsu = jumsu;
	}

	double getAverage() {
		return getTotal() / (double) jumsu.length;
	}

	int getTotal() {
		int sum = 0;
		for (int i : jumsu) {
			sum += i;
		}
		return sum;
	}

	int getGoodScore() {
		int max = jumsu[0];
		for (int i = 1; i < jumsu.length; i++) {
			if (max < jumsu[i]) {
				max = jumsu[i];
			}
		}
		return max;
	}

	int getBadScore() {
		int min = jumsu[0];
		for (int i = 1; i < jumsu.length; i++) {
			if (min > jumsu[i]) {
				min = jumsu[i];
			}
		}
		return min;
	}
}
