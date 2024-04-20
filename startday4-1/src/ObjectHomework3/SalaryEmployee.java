package ObjectHomework3;

/**
 * Package: ObjectHomework3
 * Description:
 *
 * @Author ENZO
 * @Create 2024年4月17日 10:46
 */
public class SalaryEmployee extends Employee {
    private double salary;
    private MyDate myDate;

    public SalaryEmployee(String name, double salary, MyDate myDate) {
        super(name);
        this.salary = salary;
        this.myDate = myDate;
    }

    public SalaryEmployee(String name, double salary, int year, int month, int day) {
        super(name);
        this.salary = salary;
        this.myDate = new MyDate(year, month, day);
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public MyDate getMyDate() {
        return myDate;
    }

    public void setMyDate(MyDate myDate) {
        this.myDate = myDate;
    }

    @Override
    public double earning() {
        return salary;
    }

    @Override
    public String toString() {
        return super.toString() + "生日:" + myDate;
    }
}
