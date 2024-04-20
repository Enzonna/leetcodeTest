package enzo;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * Package: enzo
 * Description: 插入区间
 *
 * @Author ENZO
 * @Create 2024年4月9日 16:22
 */
public class Test0057 {
    public int[][] insert(int[][] intervals, int[] newInterval) {

        ArrayList<int[]> result = new ArrayList<>();

        ArrayList<int[]> integers = new ArrayList<>(Arrays.asList(intervals));      //二维数组怎么转化为动态数组！！！！！！
        integers.add(newInterval);

        integers.sort((a, b) -> a[0] - b[0]);

        for (int[] interval : integers) {
            if (result.size() == 0 || result.get(result.size() - 1)[1] < interval[0]) {
                result.add(interval);
            } else {
                result.get(result.size() - 1)[1] = Math.max(result.get(result.size() - 1)[1], interval[1]);
            }
        }

        return result.toArray(new int[result.size()][2]);       //动态数组怎么转化为二维数组

    }


}
