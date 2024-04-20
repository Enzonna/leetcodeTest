package ObjectHomework3;

/**
 * Package: ObjectHomework3
 * Description:
 *
 * @Author ENZO
 * @Create 2024年4月17日 10:50
 */
public class HourEmployee extends Employee{
    private int hour;
    private double hourSalary;

    public HourEmployee(String name, int hour) {
        super(name);
        this.hour = hour;
    }

    public HourEmployee(String name, int hour, double hourSalary) {
        super(name);
        this.hour = hour;
        this.hourSalary = hourSalary;
    }

    public int getHour() {
        return hour;
    }

    public void setHour(int hour) {
        this.hour = hour;
    }

    public double getHourSalary() {
        return hourSalary;
    }

    public void setHourSalary(double hourSalary) {
        this.hourSalary = hourSalary;
    }

    @Override
    public double earning() {
        return hour*hourSalary;
    }

    @Override
    public String toString() {
        return super.toString() +"，时薪：" + hourSalary +",工作小时数：" + hour;
    }
}
