package homework1;

import java.util.Scanner;

/**
 * Package: homework1
 * Description: �·�
 *
 * @Author ENZO
 * @Create 2024��4��9�� 18:36
 */
public class Test_Month {
    public static void main(String[] args) {
        String[] str = {"January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December"};
        Scanner sc = new Scanner(System.in);
        int month = sc.nextInt();

        for (int i = 0; i < str.length; i++) {
            if (month == i) {
                System.out.println(str[i - 1]);
            }
        }


    }
}
