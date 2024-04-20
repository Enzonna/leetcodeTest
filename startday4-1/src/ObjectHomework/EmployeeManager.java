package ObjectHomework;

/**
 * Package: ObjectHomework
 * Description:
 *
 * @Author ENZO
 * @Create 2024年4月14日 18:13
 */
public class EmployeeManager {
    public Employee[] allEmployee = new Employee[5];
    public int total;

    public boolean addEmployee(Employee emp) {
        if (total >= 5) {
            System.out.println("数组已满");
            return false;
        }

        allEmployee[total++] = emp;
        return true;
    }

    public Employee[] getEmployees() {
        Employee[] employee = new Employee[total];
        //增强for循环的弊端！！！！不能随便用
        for (int i = 0; i < total; i++) {
            employee[i] = allEmployee[i];
        }
        return employee;
    }

}
