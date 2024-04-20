package homework2;

import java.util.Scanner;

/**
 * Package: homework2
 * Description:
 *
 * @Author ENZO
 * @Create 2024年4月9日 19:52
 */
public class Test2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("请输入一个英语单词：");
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

        if (flag) System.out.println("是");
        else System.out.println("否");

    }
}
