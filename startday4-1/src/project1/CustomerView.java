package project1;

/**
 * Package: project1
 * Description:
 *
 * @Author ENZO
 * @Create 2024��4��16�� 17:57
 */
public class CustomerView {
    public static void main(String[] args) {
        while (true) {
            System.out.println("-------------------ƴ���̿ͻ�����ϵͳ-------------------");
            System.out.println("\t\t\t1 �� �� �� ��");
            System.out.println("\t\t\t2 �� �� �� ��");
            System.out.println("\t\t\t3 ɾ �� �� ��");
            System.out.println("\t\t\t4 �� �� �� ��");
            System.out.println("\t\t\t5 �� ��");
            System.out.print("\t\t\t��ѡ��(1-5)��");

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
                    System.out.println("ллʹ��ƴ���̿ͻ�����ϵͳ���ݰݣ�");
                    return;
            }
        }
    }

    private static void showAllCustomers() {
        System.out.println("---------------------------�ͻ��б�---------------------------");
        System.out.println("���\t����\t�Ա�\t����\t�绰");
        System.out.println("-------------------------------------------------------------");
        Customer[] allCustomers = CustomerList.getAllCustomers();
        for (int i = 0; i < allCustomers.length; i++) {
            System.out.println((i + 1) + "\t" + allCustomers[i]);
        }
        System.out.println("-------------------------�ͻ��б����-------------------------");

    }

    private static void inputCustomerInput() {

        System.out.println("---------------------��ӿͻ�---------------------");
        System.out.print("������");
        String name = CMUtility.readString(3);

        System.out.print("�Ա�");
        char gender = CMUtility.readChar();

        System.out.print("���䣺");
        int age = CMUtility.readInt();

        System.out.print("�绰��");
        String tel = CMUtility.readString(11);


        Customer c = new Customer(name, gender, age, tel);
        CustomerList.addCustomer(c);

        System.out.println("---------------------������---------------------");
    }

    private static void updateCustomer() {

        Customer[] allCustomers = CustomerList.getAllCustomers();

        while (true) {
            System.out.println("---------------------�޸Ŀͻ�---------------------");
            if (allCustomers.length == 0) {
                System.out.println("��ǰû�пͻ�������ӿͻ�");
                System.out.println();
                System.out.println();
                inputCustomerInput();
                return;
            }
            System.out.println("��ѡ����޸ĵ��û����(-1�˳�)");
            int i = CMUtility.readInt();
            if (i == -1) {
                return;
            } else if (i > allCustomers.length) {
                System.out.println("������Χ�����������룡");
                continue;
            } else if (i <= 0) {
                System.out.println("�Ƿ����֣����������룡");
                continue;
            }

            Customer temp = allCustomers[i - 1];

            System.out.print("����(" + temp.getName() + "):");
            String name = CMUtility.readString(11, "");
            temp.setName(name);

            System.out.print("�Ա�(" + temp.getGender() + "):");
            char gender = CMUtility.readChar(' ');
            temp.setGender(gender);

            System.out.print("����(" + temp.getAge() + "):");
            int age = CMUtility.readInt(0);
            temp.setAge(age);

            System.out.print("�绰(" + temp.getTel() + "):");
            String tel = CMUtility.readString(11, "");
            temp.setTel(tel);

            System.out.println("---------------------�޸����---------------------");
            System.out.println();
            System.out.println();
        }


    }

    private static void removeCustomer() {
        Customer[] allCustomers = CustomerList.getAllCustomers();

        while (true) {
            System.out.println("---------------------ɾ���ͻ�---------------------");
            if (allCustomers.length == 0) {
                System.out.println("��ǰû�пͻ�������ӿͻ�");
                System.out.println();
                System.out.println();
                inputCustomerInput();
                return;
            }
            System.out.println("��ѡ���ɾ�����û����(-1�˳�)");
            int i = CMUtility.readInt();
            if (i == -1) {
                return;
            } else if (i > allCustomers.length) {
                System.out.println("������Χ�����������룡");
                continue;
            } else if (i <= 0) {
                System.out.println("�Ƿ����֣����������룡");
                continue;
            }
            System.out.println("ȷ���Ƿ�ɾ��(Y/N):");
            char flag = CMUtility.readChar();
            if (flag == 'N'){
                continue;
            }else if (flag == 'Y'){
                CustomerList.removeCustomer(i);
            }else {
                System.out.println("�Ƿ����룬���������룡");
                continue;
            }
            System.out.println("---------------------ɾ�����---------------------");
            System.out.println();
            System.out.println();
        }
    }
}

