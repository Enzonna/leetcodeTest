package enzo;

import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.List;

/**
 * Package: enzo
 * Description: 括号生成
 *
 * @Author ENZO
 * @Create 2024年4月8日 10:40
 */
public class Test0022 {
    public List<String> generateParenthesis(int n) {
        List<String> result = new ArrayList<>();
        backtracking(n, result, 0, 0, "");
        return result;
    }

    public void backtracking(int n, List<String> result, int right, int left, String str) {
        //退出递归的条件
        if (right > left) {
            return;
        }
        if (left == n && right == n) {
            result.add(str);
            return;
        }
        //如果左括号小于n，那么增加左括号
        if (left < n) {
            backtracking(n, result, right, left + 1, str + "(");
        }
        //日光右括号小于左括号，那么增加右括号的数量
        if (right < left) {
            backtracking(n, result, right + 1, left, str + ")");
        }
    }

    @Test
    public void test() {
        int n = 3;
        List<String> strings = generateParenthesis(n);
        for (String s : strings) {
            System.out.print(" " + s);
        }
    }
}
