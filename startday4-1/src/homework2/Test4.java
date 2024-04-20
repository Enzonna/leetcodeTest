package homework2;

import java.util.Scanner;

/**
 * Package: homework2
 * Description:
 *
 * @Author ENZO
 * @Create 2024��4��9�� 19:59
 */
public class Test4 {
    public static void main(String[] args) {
        char[] koiFishWords = {'һ'};
        Scanner scanner = new Scanner(System.in);
        char c = scanner.next().charAt(0);
        scanner.close();
        boolean flag = false;

        int left = 0, right = koiFishWords.length - 1;
        while (left <= right) {
            int mid = (left + right) / 2;
            if (koiFishWords[mid] == c) {
                flag = true;
                break;
            } else if (c < koiFishWords[mid]) {
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }


        if (flag) {
            System.out.println("yes");
        } else {
            System.out.println("no");
        }

    }
}
