package enzo;

import org.testng.annotations.Test;

/**
 * Package: enzo
 * Description: KMP�㷨
 *
 * @Author ENZO
 * @Create 2024/4/2 11:33
 */
public class Test0028 {

    public int strStr(String haystack, String needle) {
        int n = haystack.length(), m = needle.length();
        if (m == 0) {
            return 0;
        }
        int[] pi = new int[m];
        for (int i = 1, j = 0; i < m; i++) {
            while (j > 0 && needle.charAt(i) != needle.charAt(j)) {
                j = pi[j - 1];
            }
            if (needle.charAt(i) == needle.charAt(j)) {
                j++;
            }
            pi[i] = j;
        }
        for (int i = 0, j = 0; i < n; i++) {
            while (j > 0 && haystack.charAt(i) != needle.charAt(j)) {
                j = pi[j - 1];
            }
            if (haystack.charAt(i) == needle.charAt(j)) {
                j++;
            }
            if (j == m) {
                return i - m + 1;
            }
        }
        return -1;
    }


    @Test
    public void test() {
        String s1 = "dshajdkhdskadhuasdiahd";
        String s2 = "dhuasdi";
        System.out.println(strStr(s1, s2));
    }

}
