package exam2;

public class Homework {
    private String homeworkName;

    public Homework() {
        super();
    }

    public Homework(String homeworkName) {
        super();
        this.homeworkName = homeworkName;
    }

    public String getHomeworkName() {
        return homeworkName;
    }

    public void setHomeworkName(String homeworkName) {
        this.homeworkName = homeworkName;
    }

    @Override
    public String toString() {
        return homeworkName;
    }
}
