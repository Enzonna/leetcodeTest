package lesson;

import java.util.Random;
import java.util.Scanner;

/**
 * Package: lesson
 * Description: 押豹子
 *
 * @Author ENZO
 * @Create 7/4/2024 下午2:55
 */
public class TestSwitch {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        int m1 = (int) (Math.random() * 6 + 1);
        int m2 = (int) (Math.random() * 6 + 1);
        int m3 = (int) (Math.random() * 6 + 1);

        System.out.println("三个数是:" + m1 + m2 + m3);
        switch (s) {
            case "豹子":
                if (isContext(m1, m2, m3) == 1) {
                    System.out.println("猜对了");
                } else System.out.println("猜错了");
                break;
            case "大":
                if (isContext(m1, m2, m3) == 2) {
                    System.out.println("猜对了");
                } else System.out.println("猜错了");
                break;
            case "小":
                if (isContext(m1, m2, m3) == 3) {
                    System.out.println("猜对了");
                } else System.out.println("猜错了");
                break;
        }
    }

    public static int isContext(int a, int b, int c) {
        if (a == b && a == c) {
            return 1;
        } else if (a + b + c > 9) {
            return 2;
        } else return 3;
    }


}
