package lesson;

import java.util.Random;
import java.util.Scanner;

/**
 * Package: lesson
 * Description: Ѻ����
 *
 * @Author ENZO
 * @Create 7/4/2024 ����2:55
 */
public class TestSwitch {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        int m1 = (int) (Math.random() * 6 + 1);
        int m2 = (int) (Math.random() * 6 + 1);
        int m3 = (int) (Math.random() * 6 + 1);

        System.out.println("��������:" + m1 + m2 + m3);
        switch (s) {
            case "����":
                if (isContext(m1, m2, m3) == 1) {
                    System.out.println("�¶���");
                } else System.out.println("�´���");
                break;
            case "��":
                if (isContext(m1, m2, m3) == 2) {
                    System.out.println("�¶���");
                } else System.out.println("�´���");
                break;
            case "С":
                if (isContext(m1, m2, m3) == 3) {
                    System.out.println("�¶���");
                } else System.out.println("�´���");
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
