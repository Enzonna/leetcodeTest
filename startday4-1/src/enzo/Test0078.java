package enzo;

import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.List;

/**
 * Package: enzo
 * Description:子集
 *
 * @Author ENZO
 * @Create 2024年4月10日 14:41
 */
public class Test0078 {
    //方法一： 扩展法
    public List<List<Integer>> subsets1(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();     //结果集
        result.add(new ArrayList<>());      //[]

        for (int m : nums) {        //次数，每次都在所有的数组上加m
            //新建temp1，大循环的临时数组
            List<List<Integer>> temp1 = new ArrayList<>();
            //操作结果集的所有元素
            for (List<Integer> list : result) {
                //新建temp2，小循环的临时数组，每次都把里面所有的元素＋m
                //先复制！！！！！！！！！把上一轮的result的所有值取到temp2里！！！！！！！
                List<Integer> temp2 = new ArrayList<>(list);
                //向每个temp2里添加m
                temp2.add(m);
                //将小循环temp2放入大循环temp1
                temp1.add(temp2);
            }
            //每次循环，都将本次的所有结果添加到result结果集中！！，以便下一次循环操作的是所有的元素
            for (List<Integer> l : temp1) {
                result.add(l);
            }
        }
        return result;
    }

    //方法二： 回溯法，要看递归和剪枝
    public List<List<Integer>> subsets(int[] nums) {
        ArrayList<List<Integer>> result = new ArrayList<>();
        result.add(new ArrayList<>());
        for (int i = 1; i <= nums.length; i++) {
            backTracking(nums, result, i, 0, new ArrayList<>());
        }
        return result;
    }

    //回溯函数,result结果集，length子集的长度，index从哪个索引开始找，subset子集
    public void backTracking(int[] nums, List<List<Integer>> result, int length, int index, List<Integer> subset) {
        //剪枝条件,一旦满足条件，就把它加进result
        if (subset.size() == length) {
            List<Integer> temp = new ArrayList<>(subset);
            //添加
            result.add(temp);
            return;
        }

        for (int i = index; i < nums.length; i++) {
            subset.add(nums[i]);
            backTracking(nums, result, length, i + 1, subset);
            //第一个错误，一定要删除上一个元素！！！！！！！！！
            subset.remove(subset.size() - 1);
        }

    }


    @Test
    public void test() {
        int[] nums = {1, 2, 2};
        List<List<Integer>> lists = subsets(nums);
        System.out.println(lists);
    }

}
