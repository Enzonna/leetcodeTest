package project1;

/**
 * Package: project1
 * Description:
 *
 * @Author ENZO
 * @Create 2024Äê4ÔÂ16ÈÕ 18:07
 */
public class CustomerList {
    private static Customer[] list = new Customer[6];
    private static int total;

    public static void addCustomer(Customer c) {
        if (total >= list.length) {
            Customer[] bigger = new Customer[list.length + list.length / 2];
            for (int i = 0; i < list.length; i++) {
                bigger[i] = list[i];
            }
            list = bigger;
        }
        list[total++] = c;
    }

    public static Customer[] getAllCustomers() {
        Customer[] result = new Customer[total];
        for (int i = 0; i < total; i++) {
            result[i] = list[i];
        }
        return result;
    }

    public static void removeCustomer(int index) {
        for (int i = index - 1; i < total - 1; i++) {
            list[i] = list[i + 1];
        }
        list[total - 1] = null;
        total--;
    }
}
