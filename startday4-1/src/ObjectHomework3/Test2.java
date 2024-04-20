package ObjectHomework3;

/**
 * Package: ObjectHomework3
 * Description:
 *
 * @Author ENZO
 * @Create 2024年4月17日 10:58
 */
public class Test2 {
    public static void main(String[] args) {
        Employee[] all = new Employee[3];
        all[0] = new SalaryEmployee("张三",15000,new MyDate(1995,5,1));
        all[1] = new Manager("老王",20000,1990,6,1,0.1);
        all[2] = new HourEmployee("李四",50,100);

        for (Employee employee : all){
            System.out.println(employee.toString());
        }
    }
}
