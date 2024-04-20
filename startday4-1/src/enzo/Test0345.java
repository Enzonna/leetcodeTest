package enzo;

import org.testng.annotations.Test;

/**
 * ClassName: Test0345
 * Package: enzo
 * Description:
 *
 * @Author ENZO
 * @Create 2024/4/1 20:45
 * @Version 1.0
 */
public class Test0345 {
    public String reverseVowels(String s) {
        char[] chars = s.toCharArray();
        int n = s.length();
        int i = 0;
        int j = n - 1;
        while (i < j) {
            while (i < n && !isChar(chars[i])) {
                ++i;
            }
            while (j > 0 && !isChar(chars[j])) {
                --j;
            }
            if (i < j) {
                swap(chars, i, j);
                i++;
                j--;
            }
        }
        return new String(chars);
    }

    public boolean isChar(char ch) {
        return "aeiouAEIOU".indexOf(ch) >= 0;
    }

    public void swap(char[] arr, int i, int j) {
        char temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }


    @Test
    public void test() {
        String s1 = "hello";
        String s2 = "leetcode";
        System.out.println(reverseVowels(s1));
        System.out.println(reverseVowels(s2));
    }
}
