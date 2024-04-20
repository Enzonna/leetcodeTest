package enzo;

import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


/**
 * Package: enzo
 * Description: 合并区间
 *
 * @Author ENZO
 * @Create 2024年4月9日 14:45
 */
public class Test0056 {
    public int[][] merge(int[][] intervals) {
        ArrayList<int[]> result = new ArrayList<>();
        if (intervals == null || intervals.length < 2) {
            return intervals;
        }

        Arrays.sort(intervals, (a, b) -> a[0] - b[0]);      //将所有的数组的第一个元素排序
        for (int[] interval : intervals) {
            if (result.size() == 0 || interval[0] > result.get(result.size() - 1)[1]) {     //如果是一开始，或者，现在的元素的右边界 大于 上一个元素的左边界
                result.add(interval);       //将该元素放进结果集
            } else {
                result.get(result.size() - 1)[1] = Math.max(result.get(result.size() - 1)[1], interval[1]);     //修改上一个元素的右边界为最大的即可
            }
        }
        return result.toArray(new int[result.size()][2]);       //返回二维数组
    }


    @Test
    public void test() {
        int[][] arr = {{1,3}, {2,6}, {8,10}, {15,18}};
        int[][] newArr = merge(arr);
        for (int[] ints : newArr) {
            for (int i : ints) {
                System.out.print(" " + i);
            }
            System.out.println();
        }
    }

}
