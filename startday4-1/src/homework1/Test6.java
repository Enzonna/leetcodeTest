package homework1;

import java.util.Scanner;

/**
 * Package: homework1
 * Description:
 *
 * @Author ENZO
 * @Create 2024年4月9日 19:07
 */
public class Test6 {
    public static void main(String[] args) {
        int[] commonYearDays = {365, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        int[] leapYearDays = {366, 31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

        Scanner input = new Scanner(System.in);

        System.out.print("请输入年：");
        int year = input.nextInt();

        System.out.print("请输入月：");
        int month = input.nextInt();

        System.out.print("请输入日：");
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

        System.out.print(year + "年" + month + "月" + day + "日这一天在");
        if (days % 5 == 1 || days % 5 == 2 || days % 5 == 3) {
            System.out.println("打鱼");
        } else {
            System.out.println("晒网");
        }


    }
}
