package ObjectHomework2;

/**
 * Package: ObjectHomework2
 * Description:
 *
 * @Author ENZO
 * @Create 2024Äê4ÔÂ15ÈÕ 18:46
 */
public class Employee {
    private String name;
    private String gender;
    private int age;
    private int salary;
    private String phone;
    private String email;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return name + "\t" + gender + "\t\t" + age + "\t\t" + salary + "\t\t" + phone + "\t\t" + email;
    }
}
