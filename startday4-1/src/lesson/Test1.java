package lesson;

import java.net.Socket;

/**
 * Package: lesson
 * Description:
 *
 * @Author ENZO
 * @Create 2024/4/2 15:17
 */
public class Test1 {
    public static void main(String[] args) {
        short b1 = 120;
        short b2 = 8;
        byte b3 = (byte) (b1 + b2);
        System.out.println(b3);

        char c1 = '0';
        char c2 = '1';
        System.out.println(c1 + c2);

        int a = 1;
        int b = 2;
        double c = a / b;
        System.out.println(c);
    }


}
