package ObjectHomework3;

/**
 * Package: ObjectHomework3
 * Description:
 *
 * @Author ENZO
 * @Create 2024��4��17�� 10:42
 */
public class Employee {
    private String name;

    public Employee(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double earning(){
        return 0.0;
    }

    @Override
    public String toString() {
        return "����:" + name + "����:" + earning();
    }
}
