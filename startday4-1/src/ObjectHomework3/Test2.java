package ObjectHomework3;

/**
 * Package: ObjectHomework3
 * Description:
 *
 * @Author ENZO
 * @Create 2024��4��17�� 10:58
 */
public class Test2 {
    public static void main(String[] args) {
        Employee[] all = new Employee[3];
        all[0] = new SalaryEmployee("����",15000,new MyDate(1995,5,1));
        all[1] = new Manager("����",20000,1990,6,1,0.1);
        all[2] = new HourEmployee("����",50,100);

        for (Employee employee : all){
            System.out.println(employee.toString());
        }
    }
}
