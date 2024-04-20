package homework2;

import java.util.Scanner;

/**
 * Package: homework2
 * Description:
 *
 * @Author ENZO
 * @Create 2024年4月9日 19:55
 */
public class Test3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("请录入本组学员人数：");
        int count = input.nextInt();

        int[] grades = new int[count];
        String[] names = new String[count];

        for (int i = 0; i < grades.length; i++) {
            System.out.print("第" + (i + 1) + "个学员的姓名：");
            names[i] = input.next();

            System.out.print("第" + (i + 1) + "个学员的成绩：");
            grades[i] = input.nextInt();
        }
        input.close();


        System.out.println("所有学员的成绩如下：");
        for (int i = 0; i < names.length; i++) {
            System.out.println(names[i] + ":" + grades[i]);
        }

        System.out.println("本班满分学员：");
        boolean flag = false;
        for (int i = 0; i < grades.length; i++) {
            if (grades[i] == 100) {
                System.out.println(names[i]);
                flag = true;
            }
        }
        if (!flag) {
            System.out.println("没有");
        }
    }
}
