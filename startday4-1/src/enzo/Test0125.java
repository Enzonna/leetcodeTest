package enzo;

import org.testng.annotations.Test;

/**
 * Package: enzo
 * Description: 回文串
 *
 * @Author ENZO
 * @Create 2024年4月11日 19:14
 */
public class Test0125 {
    public boolean isPalindrome(String s) {
        char[] temp = s.toLowerCase().toCharArray();
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < temp.length; i++) {
            if (Character.isLetterOrDigit(temp[i])) {
                stringBuilder.append(temp[i]);
            }
        }
        char[] chars = stringBuilder.toString().toCharArray();
        int m = chars.length;
        int l = 0, r = m - 1;

        while (l < r) {
            if (chars[l] != chars[r]) {
                return false;
            }
            l++;
            r--;
        }
        return true;
    }

    @Test
    public void test() {
        String s = "A man, a plan, a canal: Panama";
        System.out.println(isPalindrome(s));
    }
}
