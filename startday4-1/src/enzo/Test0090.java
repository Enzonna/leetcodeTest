package enzo;

import org.testng.annotations.Test;
import org.w3c.dom.ls.LSInput;

import java.util.*;

/**
 * Package: enzo
 * Description: 子集2
 *
 * @Author ENZO
 * @Create 2024年4月11日 10:53
 */
public class Test0090 {
    //回溯法，要看递归和剪枝
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        ArrayList<List<Integer>> result = new ArrayList<>();
        result.add(new ArrayList<>());
        for (int i = 1; i <= nums.length; i++) {
            backTracking(nums, result, i, 0, new ArrayList<>());
        }
        return result;
    }

    // 回溯函数,result结果集，length子集的长度，index从哪个索引开始找，subset子集
    public void backTracking(int[] nums, List<List<Integer>> result, int length, int index, List<Integer> subset) {
        // 剪枝条件,一旦满足条件，并且不和之前的重复，就把它加进result
        //出错
        boolean flag = true;
        if (subset.size() == length) {
            List<Integer> temp = new ArrayList<>(subset);
            Collections.sort(temp);
            for (List<Integer> list : result) {
                if (list.equals(temp)) {
                    flag = false;
                }
            }

            if (flag) {
                result.add(temp);
            }
        }

        for (int i = index; i < nums.length; i++) {
            subset.add(nums[i]);
            backTracking(nums, result, length, i + 1, subset);
            // 第一个错误，一定要删除上一个元素！！！！！！！！！
            subset.remove(subset.size() - 1);
        }

    }


    @Test
    public void test() {
        int[] nums = {4, 4, 4, 1, 4};
        List<List<Integer>> lists = subsetsWithDup(nums);
        System.out.println(lists);
    }


    @Test
    public void test2() {
        ArrayList<List<Integer>> lists = new ArrayList<>();     //向list里添加integers
        lists.add(new ArrayList<>());

        ArrayList<Integer> integers = new ArrayList<>();
        integers.add(1);
        integers.add(2);
        lists.add(integers);

        System.out.println("lists = " + lists);
        System.out.println("integers = " + integers);

        boolean flag = true;
        for (List<Integer> list : lists) {       //如果integers和list里面所有的元素都不一样，才添加进去
            ArrayList<Integer> temp = new ArrayList<>(integers);        //要比较的元素
            if (list.equals(temp)) {
                flag = false;
                break;
            }
        }

        if (flag == true) {
            lists.add(integers);
        } else {
            System.out.println("failed to add!");
        }

        System.out.println(lists);


    }

}
