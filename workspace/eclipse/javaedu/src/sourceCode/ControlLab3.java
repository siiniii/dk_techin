package sourceCode;

public class ControlLab3 {
	public static void main(String[] args) {
		int num;
		String a;
		String b = "";
		while (true) {
			num = (int) (Math.random() * 120) + 1;
			if (num < 50) {
				a = num + " : 50미만";
				if (num % 10 == 3)
					b = num + " : *듀크팀*" + "\n";
			} else if (num >= 50 && num <= 80) {
				a = num + " : 50이상 80이하";
				if (num >= 70 && num <= 79)
					b = num + " : *턱시팀*" + "\n";
			} else if (num >= 81 && num <= 100) {
				continue;
			} else {
				break;
			}
			System.out.printf("%s\n%s", a, b);
			b = "";
		}
	}
}
