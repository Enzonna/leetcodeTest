package project1;

/**
 * Package: project1
 * Description:
 *
 * @Author ENZO
 * @Create 2024Äê4ÔÂ16ÈÕ 17:03
 */
public class Customer {
    private String name;
    private char gender;
    private int age;
    private String tel;

    public Customer(String name, char gender, int age, String tel) {
        this.name = name;
        this.gender = gender;
        this.age = age;
        this.tel = tel;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }


    @Override
    public String toString() {
        return name + " \t|\t" +gender + " |\t" + age + " |\t" + tel + " |";
    }
}
