package enzo;

import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/**
 * Package: enzo
 * Description: ���
 *
 * @Author ENZO
 * @Create 2024��4��10�� 11:28
 */
public class Test0077 {
    public List<List<Integer>> combine(int n, int k) {
        ArrayList<List<Integer>> result = new ArrayList<>();
        backTracking(n, k, result, 1, new ArrayList<>());       //����
        return result;
    }

    public void backTracking(int n, int k, ArrayList<List<Integer>> result, int begin, ArrayList<Integer> list) {
        if (list.size() == k) {     //�����ݹ������
            result.add(new ArrayList<>(list));
            return;
        }

        for (int i = begin; i <= n; i++) {
            list.add(i);        //���б������Ԫ��
            backTracking(n, k, result, i + 1, list);        //���ݣ��ݹ�
            list.remove(list.size() - 1);       //���б�����һ���޳�������ɾ���ӽڵ㣬�����ظ��ڵ�
        }
    }

    @Test
    public void test() {
        int n = 4, k = 2;
        List<List<Integer>> lists = combine(n, k);
        System.out.println(lists);
    }
}







