package day016.ex.mvclab.model;

public class StudentDTO {
	private String name;
	private int score;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getScore() {
		return score;
	}
	public void setScore(int score) {
		this.score = score;
	}
	@Override
	public String toString() {
		return "이름: " + name + "\t점수" + score + "\n";
	}
	
	
}
