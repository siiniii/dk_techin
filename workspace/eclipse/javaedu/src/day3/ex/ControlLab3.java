package day3.ex;

public class ControlLab3 {

	public static void main(String[] args) {

		String team1;
		String team2 = "";

		while (true) {
			int no = (int) (Math.random() * 120) + 1;
			if (no < 50) {
				team1 = no + ": 50미만";
				if (no % 10 == 3) {
					team2 = no + ": *듀크팀*\n";
				}
			} else if (no >= 50 && no <= 80) {
				team1 = no + ": 50 이상 80 이하";
				if (no >= 70 || no <= 79) {
					team2 = no + ": *턱시팀*\n";
				}
			} else if (no >= 81 && no <= 100) {
				continue;
			} else {
				break;
			}
			System.out.printf("%s\n%s", team1, team2);
			team2 = "";
		}
	}

}
