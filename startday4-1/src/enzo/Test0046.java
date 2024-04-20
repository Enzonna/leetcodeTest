package enzo;

import org.testng.annotations.Test;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/**
 * Package: enzo
 * Description: 全排列
 *
 * @Author ENZO
 * @Create 2024年4月8日 18:24
 */
public class Test0046 {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();     //结果集,返回的列表
        HashMap<Integer, Boolean> visited = new HashMap<>();        //是否被访问过

        for (int m : nums) {
            visited.put(m, false);      //让所有的访问值都变false
        }

        backTracking(nums, result, visited, new ArrayList<>());
        return result;
    }

    public void backTracking(int[] nums, List<List<Integer>> result, HashMap<Integer, Boolean> visited, ArrayList<Integer> list) {
        if (list.size() == nums.length) {       //如果list的长度到了题目的数组的长度，那么list就满了，将list放进result结果集，并返回
            result.add(new ArrayList<>(list));      //复制新的放进去
            return;
        }
        //取第一个元素m
        for (int m : nums) {
            if (!visited.get(m)) {      //如果该元素的访问值是false，证明未访问过
                list.add(m);        //将该元素放进list中
                visited.put(m, true);       //修改该元素的访问值为true，证明访问过
                backTracking(nums, result, visited, list);      //继续回溯
                list.remove(list.size() - 1);       //删除list的？？？？？第一个错误，删除的是父节点，因为要回溯，从上一个节点继续查询兄弟分支
                visited.put(m, false);      //将该元素访问值修改为false
            }
        }
    }


    @Test
    public void test() {
        int[] arr = {1, 2, 3};
        List<List<Integer>> lists = permute(arr);
        System.out.println(lists);

    }

}
