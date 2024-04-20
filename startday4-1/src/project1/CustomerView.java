package project1;

/**
 * Package: project1
 * Description:
 *
 * @Author ENZO
 * @Create 2024年4月16日 17:57
 */
public class CustomerView {
    public static void main(String[] args) {
        while (true) {
            System.out.println("-------------------拼电商客户管理系统-------------------");
            System.out.println("\t\t\t1 添 加 客 户");
            System.out.println("\t\t\t2 修 改 客 户");
            System.out.println("\t\t\t3 删 除 客 户");
            System.out.println("\t\t\t4 客 户 列 表");
            System.out.println("\t\t\t5 退 出");
            System.out.print("\t\t\t请选择(1-5)：");

            char select = CMUtility.readMenuSelection();
            switch (select) {
                case '1':
                    inputCustomerInput();
                    break;
                case '2':
                    updateCustomer();
                    break;
                case '3':
                    removeCustomer();
                    break;
                case '4':
                    showAllCustomers();
                    break;
                case '5':
                    System.out.println("谢谢使用拼电商客户管理系统，拜拜！");
                    return;
            }
        }
    }

    private static void showAllCustomers() {
        System.out.println("---------------------------客户列表---------------------------");
        System.out.println("编号\t姓名\t性别\t年龄\t电话");
        System.out.println("-------------------------------------------------------------");
        Customer[] allCustomers = CustomerList.getAllCustomers();
        for (int i = 0; i < allCustomers.length; i++) {
            System.out.println((i + 1) + "\t" + allCustomers[i]);
        }
        System.out.println("-------------------------客户列表完成-------------------------");

    }

    private static void inputCustomerInput() {

        System.out.println("---------------------添加客户---------------------");
        System.out.print("姓名：");
        String name = CMUtility.readString(3);

        System.out.print("性别：");
        char gender = CMUtility.readChar();

        System.out.print("年龄：");
        int age = CMUtility.readInt();

        System.out.print("电话：");
        String tel = CMUtility.readString(11);


        Customer c = new Customer(name, gender, age, tel);
        CustomerList.addCustomer(c);

        System.out.println("---------------------添加完成---------------------");
    }

    private static void updateCustomer() {

        Customer[] allCustomers = CustomerList.getAllCustomers();

        while (true) {
            System.out.println("---------------------修改客户---------------------");
            if (allCustomers.length == 0) {
                System.out.println("当前没有客户，请添加客户");
                System.out.println();
                System.out.println();
                inputCustomerInput();
                return;
            }
            System.out.println("请选择待修改的用户编号(-1退出)");
            int i = CMUtility.readInt();
            if (i == -1) {
                return;
            } else if (i > allCustomers.length) {
                System.out.println("超出范围，请重新输入！");
                continue;
            } else if (i <= 0) {
                System.out.println("非法数字，请重新输入！");
                continue;
            }

            Customer temp = allCustomers[i - 1];

            System.out.print("姓名(" + temp.getName() + "):");
            String name = CMUtility.readString(11, "");
            temp.setName(name);

            System.out.print("性别(" + temp.getGender() + "):");
            char gender = CMUtility.readChar(' ');
            temp.setGender(gender);

            System.out.print("年龄(" + temp.getAge() + "):");
            int age = CMUtility.readInt(0);
            temp.setAge(age);

            System.out.print("电话(" + temp.getTel() + "):");
            String tel = CMUtility.readString(11, "");
            temp.setTel(tel);

            System.out.println("---------------------修改完成---------------------");
            System.out.println();
            System.out.println();
        }


    }

    private static void removeCustomer() {
        Customer[] allCustomers = CustomerList.getAllCustomers();

        while (true) {
            System.out.println("---------------------删除客户---------------------");
            if (allCustomers.length == 0) {
                System.out.println("当前没有客户，请添加客户");
                System.out.println();
                System.out.println();
                inputCustomerInput();
                return;
            }
            System.out.println("请选择待删除的用户编号(-1退出)");
            int i = CMUtility.readInt();
            if (i == -1) {
                return;
            } else if (i > allCustomers.length) {
                System.out.println("超出范围，请重新输入！");
                continue;
            } else if (i <= 0) {
                System.out.println("非法数字，请重新输入！");
                continue;
            }
            System.out.println("确认是否删除(Y/N):");
            char flag = CMUtility.readChar();
            if (flag == 'N'){
                continue;
            }else if (flag == 'Y'){
                CustomerList.removeCustomer(i);
            }else {
                System.out.println("非法输入，请重新输入！");
                continue;
            }
            System.out.println("---------------------删除完成---------------------");
            System.out.println();
            System.out.println();
        }
    }
}

