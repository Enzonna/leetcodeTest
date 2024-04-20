package ObjectHomework3;

/**
 * Package: ObjectHomework3
 * Description:
 *
 * @Author ENZO
 * @Create 2024年4月17日 10:54
 */
public class Manager extends SalaryEmployee {
    private double bonusRate;

    public Manager(String name, double salary, MyDate myDate, double bonusRate) {
        super(name, salary, myDate);
        this.bonusRate = bonusRate;
    }

    public Manager(String name, double salary, int year, int month, int day, double bonusRate) {
        super(name, salary, year, month, day);
        this.bonusRate = bonusRate;
    }

    public double getBonusRate() {
        return bonusRate;
    }

    public void setBonusRate(double bonusRate) {
        this.bonusRate = bonusRate;
    }

    @Override
    public double earning() {
        return super.getSalary() * (1 + bonusRate);
    }

    @Override
    public String toString() {
        return super.toString() + ",奖金比例：" + bonusRate;
    }
}
