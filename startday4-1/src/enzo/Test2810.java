package enzo;

import org.testng.annotations.Test;

import java.util.ArrayDeque;
import java.util.Deque;

/**
 * ClassName: Test2810
 * Package: enzo
 * Description:
 *
 * @Author ENZO
 * @Create 2024/4/1 11:38
 * @Version 1.0
 */
public class Test2810 {


    public String finalString(String s) {
        Deque<Character> q = new ArrayDeque<>();
        boolean tail = true;
        for (char c : s.toCharArray()) {
            if (c == 'i') {
                tail = !tail; // 修改添加方向
            } else if (tail) {
                q.addLast(c); // 加尾部
            } else {
                q.addFirst(c); // 加头部
            }
        }
        StringBuilder ans = new StringBuilder();
        for (char c : q) {
            ans.append(c);
        }
        if (!tail) {
            ans.reverse();
        }
        return ans.toString();
    }


    /**
     * 标准答案
     * @param s
     * @return
     */
    public String finalString2(String s) {
        char[] charArray = s.toCharArray();
        int n = s.length();
        int i = 0;
        StringBuilder sb = new StringBuilder();
        while(i < n) {
            if(charArray[i] == 'i') {
                if(i + 1 < n && charArray[i + 1] == 'i') {
                    i++;
                } else {
                    sb.reverse();
                }
            } else {
                sb.append(charArray[i]);
            }
            i++;
        }
        return sb.toString();
    }



    @Test
    public void test(){
        String str = "striing";
        System.out.println(finalString2(str));
    }
}
