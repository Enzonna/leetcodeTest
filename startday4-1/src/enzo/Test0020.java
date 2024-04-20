package enzo;

import org.testng.annotations.Test;

import java.util.Deque;
import java.util.HashMap;
import java.util.LinkedList;

/**
 * ClassName: Test0020
 * Package: enzo
 * Description:
 *
 * @Author ENZO
 * @Create 2024/4/1 18:22
 * @Version 1.0
 */
public class Test0020 {
    public boolean isValid2(String s) {
        int m = s.length();
        if (m % 2 == 1) {
            return false;
        }

        HashMap<Character, Character> map = new HashMap<>() {{
            put(')', '(');
            put('}', '{');
            put(']', '[');
        }};

        Deque<Object> stack = new LinkedList<>();
        for (int i = 0; i < m; i++) {
            char ch = s.charAt(i);
            if (map.containsKey(ch)) {
                if (stack.isEmpty() || stack.peek() != map.get(ch)) {
                    return false;
                }
                stack.pop();
            } else {
                stack.push(ch);
            }
        }
        return stack.isEmpty();
    }


    public boolean isValid(String s) {
        Deque<Character> stack = new LinkedList<>();
        HashMap<Character, Character> hashMap = new HashMap<>() {
            {
                put(')', '(');
                put('}', '{');
                put(']', '[');
            }
        };
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (hashMap.containsKey(ch)){
                if (hashMap.isEmpty() || stack.peek() != hashMap.get(ch)){
                    return false;
                }
                stack.pop();
            }else {
                stack.push(ch);
            }
        }
        return stack.isEmpty();

    }


    @Test
    public void test() {
        String s = "{()}";
        String s2 = "((";
        String s3 = "(){}}{";
        System.out.println(isValid(s));
        System.out.println(isValid(s2));
        System.out.println(isValid(s3));
    }
}
