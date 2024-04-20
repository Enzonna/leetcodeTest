package homework1;

import java.util.Scanner;

/**
 * Package: homework1
 * Description:
 *
 * @Author ENZO
 * @Create 2024��4��9�� 19:07
 */
public class Test6 {
    public static void main(String[] args) {
        int[] commonYearDays = {365, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        int[] leapYearDays = {366, 31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

        Scanner input = new Scanner(System.in);

        System.out.print("�������꣺");
        int year = input.nextInt();

        System.out.print("�������£�");
        int month = input.nextInt();

        System.out.print("�������գ�");
        int day = input.nextInt();

        input.close();

        int days = 0;
        for (int i = 1990; i < year; i++) {
            if (i % 4 == 0 && i % 100 != 0 || i % 400 == 0) {
                days += leapYearDays[0];
            } else {
                days += commonYearDays[0];
            }
        }

        boolean leapYearFlag = year % 4 == 0 && year % 100 != 0 || year % 400 == 0;
        for (int i = 1; i < month; i++) {
            if (i == 2 && leapYearFlag) {
                days += leapYearDays[i];
            } else {
                days += commonYearDays[i];
            }
        }

        days += day;

        System.out.print(year + "��" + month + "��" + day + "����һ����");
        if (days % 5 == 1 || days % 5 == 2 || days % 5 == 3) {
            System.out.println("����");
        } else {
            System.out.println("ɹ��");
        }


    }
}
