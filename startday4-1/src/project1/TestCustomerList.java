package project1;

/**
 * Package: project1
 * Description:
 *
 * @Author ENZO
 * @Create 2024��4��16�� 18:10
 */
public class TestCustomerList {
    public static void main(String[] args) {
        //��ʾ���ȥ
        Customer c1 = new Customer("����",'��',35,"010-565255845");
        CustomerList.addCustomer(c1);

        Customer c2 = new Customer("������",'��',33,"010-565255845");
        CustomerList.addCustomer(c2);


        Customer c3 = new Customer("�����",'Ů',18,"010-565255845");
        CustomerList.addCustomer(c3);


        Customer c4 = new Customer("������",'Ů',18,"010-565255845");
        CustomerList.addCustomer(c4);

        Customer c5 = new Customer("��һ��",'��',28,"010-565644896");
        CustomerList.addCustomer(c5);

        //��ʾȡ����
        Customer[] all = CustomerList.getAllCustomers();
        //��������
        for (int i = 0; i < all.length; i++) {
            System.out.println(all[i]);
        }
    }
}
