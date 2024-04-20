package enzo;

import org.testng.annotations.Test;

/**
 * Package: enzo
 * Description: 最长回文子串
 *
 * @Author ENZO
 * @Create 2024年4月11日 20:14
 */
public class Test0005 {
//    public String longestPalindrome2(String s) {
//        int max = 0;
//        String result = null;
//        // TODO: 2024年4月11日 如何切片，查所有
//        for (int i = 1; i <= s.length(); i++) {
//            for (int j = 0; j < i; j++) {
//                String temp = s.substring(j, i);
//                if (isHui(temp) && max < temp.length()) {
//                    max = temp.length();
//                    result = temp;
//                }
//            }
//        }
//        return result;
//    }
//
//    public boolean isHui(String s) {
//        char[] chars = s.toCharArray();
//        int r = chars.length - 1, l = 0;
//        while (l < r) {
//            if (chars[l] != chars[r]) {
//                return false;
//            }
//            r--;
//            l++;
//        }
//        return true;
//    }


    public String longestPalindrome(String s) {

        int begin = 0, maxLen = 1;

        char[] chars = s.toCharArray();
        int m = chars.length;

        boolean[][] dp = new boolean[m][m];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < m; j++) {
                dp[i][j] = false;
            }
        }

        for (int L = 2; L < m; L++) {
            for (int i = 0; i < m; i++) {


            }
        }

        return s.substring(begin,begin+maxLen);
    }


    @Test
    public void test() {
        String s = "cbabc";
        System.out.println(longestPalindrome(s));
    }

}
