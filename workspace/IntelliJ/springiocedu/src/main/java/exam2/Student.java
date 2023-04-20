package exam2;

public class Student {
    private Homework myHomework;
    private  String name;

    public Student() {
        super();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Homework getMyHomework() {
        return myHomework;
    }

    public void setMyHomework(Homework myHomework) {
        this.myHomework = myHomework;
    }

    @Override
    public String toString() {
        return name + "는 " + getMyHomework() + "을(를) 학습합니다.";
    }
}
