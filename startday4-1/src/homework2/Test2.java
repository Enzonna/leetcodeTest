package homework2;

import java.util.Scanner;

/**
 * Package: homework2
 * Description:
 *
 * @Author ENZO
 * @Create 2024��4��9�� 19:52
 */
public class Test2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("������һ��Ӣ�ﵥ�ʣ�");
        String word = input.next();
        char[] chars = word.toCharArray();

        int left = 0, right = chars.length - 1;
        boolean flag = true;
        while (left < right) {
            if (chars[left] != chars[right]) {
                flag = false;
                break;
            }
            left++;
            right--;
        }

        if (flag) System.out.println("��");
        else System.out.println("��");

    }
}
