package ObjectHomework;

/**
 * Package: ObjectHomework
 * Description:
 *
 * @Author ENZO
 * @Create 2024��4��14�� 18:10
 */
public class Employee {
    public int id;
    public String name;
    public int salary;
    public int age;

    public String getInfo() {
        return "��Ա������Ϣ��idΪ" + id + "nameΪ" + name + "salaryΪ" + salary + "ageΪ" + age;
    }

    void setInfo(int id, String name, int salary, int age) {
        this.id = id;
        this.name = name;
        this.salary = salary;
        this.age = age;
    }

}
