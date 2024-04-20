package ObjectHomework;

/**
 * Package: ObjectHomework
 * Description:
 *
 * @Author ENZO
 * @Create 2024年4月14日 18:10
 */
public class Employee {
    public int id;
    public String name;
    public int salary;
    public int age;

    public String getInfo() {
        return "该员工的信息：id为" + id + "name为" + name + "salary为" + salary + "age为" + age;
    }

    void setInfo(int id, String name, int salary, int age) {
        this.id = id;
        this.name = name;
        this.salary = salary;
        this.age = age;
    }

}
