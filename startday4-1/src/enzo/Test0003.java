package enzo;

import org.testng.annotations.Test;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

/**
 * Package: enzo
 * Description: ���ظ��ַ�����Ӵ�
 *
 * @Author ENZO
 * @Create 7/4/2024 ����8:58
 */
public class Test0003 {
    /**
     * �����ˣ���������ַ�������������Ӵ�
     *
     * @param s
     * @return
     */
    public int lengthOfLongestSubstring1(String s) {
        char[] chars = s.toCharArray();
        HashMap<Character, Integer> hashMap = new HashMap<>();
        int length = 0;

        for (int i = 0; i < chars.length; i++) {
            if (hashMap.getOrDefault(chars[i], 100) == 100) {
                hashMap.put(chars[i], i);
                length++;
            }

        }
        return length;
    }

    public int lengthOfLongestSubstring(String s) {
        Set<Character> hashSet = new HashSet<>();
        int n = s.length();
        int ans = 0, rk = -1;//rk��ָ�룬ans��������

        for (int i = 0; i < n; i++) {
            //ÿһ�δ���һ���Ǳ꿪ʼѭ����������
            if (i != 0) {
                hashSet.remove(s.charAt(i - 1));
            }
            while (rk + 1 < n && !hashSet.contains(s.charAt(rk + 1))) {
                hashSet.add(s.charAt(rk + 1));
                rk++;
            }
            ans = Math.max(ans, rk - i + 1);
        }
        return ans;
    }


    @Test
    public void test() {
        String s1 = "abcabcbb";
        String s2 = "bbbb";
        String s3 = "pwwkew";
        String s4 = "";
        System.out.println(lengthOfLongestSubstring(s1));
        System.out.println(lengthOfLongestSubstring(s2));
        System.out.println(lengthOfLongestSubstring(s3));
        System.out.println(lengthOfLongestSubstring(s4));
    }
}
