package ObjectHomework;

/**
 * Package: ObjectHomework
 * Description:
 *
 * @Author ENZO
 * @Create 2024��4��14�� 18:13
 */
public class EmployeeManager {
    public Employee[] allEmployee = new Employee[5];
    public int total;

    public boolean addEmployee(Employee emp) {
        if (total >= 5) {
            System.out.println("��������");
            return false;
        }

        allEmployee[total++] = emp;
        return true;
    }

    public Employee[] getEmployees() {
        Employee[] employee = new Employee[total];
        //��ǿforѭ���ı׶ˣ����������������
        for (int i = 0; i < total; i++) {
            employee[i] = allEmployee[i];
        }
        return employee;
    }

}
