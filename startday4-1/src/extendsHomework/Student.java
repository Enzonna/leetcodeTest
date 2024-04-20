package extendsHomework;

/**
 * Package: extendsHomework
 * Description:
 *
 * @Author ENZO
 * @Create 2024��4��16�� 13:57
 */
public class Student extends Person{
    private int score;

    public Student() {
    }

    public Student(String name, int age, char gender, int score) {
        super(name, age, gender);
        this.score = score;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    @Override
    public String toString() {
        return super.toString() + "Student{" +
                "score=" + score +
                '}';
    }
}
