package enzo;

import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/**
 * Package: enzo
 * Description: 组合
 *
 * @Author ENZO
 * @Create 2024年4月10日 11:28
 */
public class Test0077 {
    public List<List<Integer>> combine(int n, int k) {
        ArrayList<List<Integer>> result = new ArrayList<>();
        backTracking(n, k, result, 1, new ArrayList<>());       //回溯
        return result;
    }

    public void backTracking(int n, int k, ArrayList<List<Integer>> result, int begin, ArrayList<Integer> list) {
        if (list.size() == k) {     //跳出递归的条件
            result.add(new ArrayList<>(list));
            return;
        }

        for (int i = begin; i <= n; i++) {
            list.add(i);        //向列表中添加元素
            backTracking(n, k, result, i + 1, list);        //回溯，递归
            list.remove(list.size() - 1);       //把列表的最后一个剔除，类似删除子节点，并返回父节点
        }
    }

    @Test
    public void test() {
        int n = 4, k = 2;
        List<List<Integer>> lists = combine(n, k);
        System.out.println(lists);
    }
}







