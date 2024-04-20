package enzo;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * Package: enzo
 * Description: ��������
 *
 * @Author ENZO
 * @Create 2024��4��9�� 16:22
 */
public class Test0057 {
    public int[][] insert(int[][] intervals, int[] newInterval) {

        ArrayList<int[]> result = new ArrayList<>();

        ArrayList<int[]> integers = new ArrayList<>(Arrays.asList(intervals));      //��ά������ôת��Ϊ��̬���飡����������
        integers.add(newInterval);

        integers.sort((a, b) -> a[0] - b[0]);

        for (int[] interval : integers) {
            if (result.size() == 0 || result.get(result.size() - 1)[1] < interval[0]) {
                result.add(interval);
            } else {
                result.get(result.size() - 1)[1] = Math.max(result.get(result.size() - 1)[1], interval[1]);
            }
        }

        return result.toArray(new int[result.size()][2]);       //��̬������ôת��Ϊ��ά����

    }


}
