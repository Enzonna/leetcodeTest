package ObjectHomework;

import org.testng.annotations.Test;

/**
 * Package: ObjectHomework
 * Description:
 *
 * @Author ENZO
 * @Create 2024年4月14日 18:05
 */
public class HomeworkTest {
    @Test
    public void testLight() {
        Light[] lights = new Light[3];
        lights[0] = new Light();
        lights[0].color = "red";
        lights[0].time = 60;
        lights[0].getInfo();
    }

    @Test
    public void testEmployee() {
        EmployeeManager manager = new EmployeeManager();
        Employee e1 = new Employee();
        e1.setInfo(1, "刘一", 11000, 21);
        Employee e2 = new Employee();
        e2.setInfo(2, "陈二", 12000, 22);
        Employee e3 = new Employee();
        e3.setInfo(3, "张三", 13000, 23);
        Employee e4 = new Employee();

        System.out.println("添加e1" + (manager.addEmployee(e1) ? "成功" : "失败"));
        System.out.println("添加e2" + (manager.addEmployee(e2) ? "成功" : "失败"));
        System.out.println("添加e3" + (manager.addEmployee(e3) ? "成功" : "失败"));


        Employee[] employees = manager.getEmployees();
        for (int i = 0; i < employees.length; i++) {
            System.out.println(employees[i].getInfo());
        }

        employees[0].age = 100;
        System.out.println(employees[0].age);

        Employee[] employees1 = manager.getEmployees();
        System.out.println(employees1[0].age);

        employees1[0].age = 99;
        System.out.println(employees[0].age);
        System.out.println(employees[0].age == employees1[0].age);

    }
}
