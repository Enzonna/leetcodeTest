package project1;

/**
 * Package: project1
 * Description:
 *
 * @Author ENZO
 * @Create 2024年4月16日 18:10
 */
public class TestCustomerList {
    public static void main(String[] args) {
        //演示存进去
        Customer c1 = new Customer("胡歌",'男',35,"010-565255845");
        CustomerList.addCustomer(c1);

        Customer c2 = new Customer("霍建华",'男',33,"010-565255845");
        CustomerList.addCustomer(c2);


        Customer c3 = new Customer("刘亦菲",'女',18,"010-565255845");
        CustomerList.addCustomer(c3);


        Customer c4 = new Customer("刘嘉玲",'女',18,"010-565255845");
        CustomerList.addCustomer(c4);

        Customer c5 = new Customer("朱一龙",'男',28,"010-565644896");
        CustomerList.addCustomer(c5);

        //演示取出来
        Customer[] all = CustomerList.getAllCustomers();
        //遍历数组
        for (int i = 0; i < all.length; i++) {
            System.out.println(all[i]);
        }
    }
}
