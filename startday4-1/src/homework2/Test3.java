package homework2;

import java.util.Scanner;

/**
 * Package: homework2
 * Description:
 *
 * @Author ENZO
 * @Create 2024��4��9�� 19:55
 */
public class Test3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("��¼�뱾��ѧԱ������");
        int count = input.nextInt();

        int[] grades = new int[count];
        String[] names = new String[count];

        for (int i = 0; i < grades.length; i++) {
            System.out.print("��" + (i + 1) + "��ѧԱ��������");
            names[i] = input.next();

            System.out.print("��" + (i + 1) + "��ѧԱ�ĳɼ���");
            grades[i] = input.nextInt();
        }
        input.close();


        System.out.println("����ѧԱ�ĳɼ����£�");
        for (int i = 0; i < names.length; i++) {
            System.out.println(names[i] + ":" + grades[i]);
        }

        System.out.println("��������ѧԱ��");
        boolean flag = false;
        for (int i = 0; i < grades.length; i++) {
            if (grades[i] == 100) {
                System.out.println(names[i]);
                flag = true;
            }
        }
        if (!flag) {
            System.out.println("û��");
        }
    }
}
