package enzo;

import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.List;

/**
 * Package: enzo
 * Description: ��������
 *
 * @Author ENZO
 * @Create 2024��4��8�� 10:40
 */
public class Test0022 {
    public List<String> generateParenthesis(int n) {
        List<String> result = new ArrayList<>();
        backtracking(n, result, 0, 0, "");
        return result;
    }

    public void backtracking(int n, List<String> result, int right, int left, String str) {
        //�˳��ݹ������
        if (right > left) {
            return;
        }
        if (left == n && right == n) {
            result.add(str);
            return;
        }
        //���������С��n����ô����������
        if (left < n) {
            backtracking(n, result, right, left + 1, str + "(");
        }
        //�չ�������С�������ţ���ô���������ŵ�����
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
