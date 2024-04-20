package enzo;

import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


/**
 * Package: enzo
 * Description: �ϲ�����
 *
 * @Author ENZO
 * @Create 2024��4��9�� 14:45
 */
public class Test0056 {
    public int[][] merge(int[][] intervals) {
        ArrayList<int[]> result = new ArrayList<>();
        if (intervals == null || intervals.length < 2) {
            return intervals;
        }

        Arrays.sort(intervals, (a, b) -> a[0] - b[0]);      //�����е�����ĵ�һ��Ԫ������
        for (int[] interval : intervals) {
            if (result.size() == 0 || interval[0] > result.get(result.size() - 1)[1]) {     //�����һ��ʼ�����ߣ����ڵ�Ԫ�ص��ұ߽� ���� ��һ��Ԫ�ص���߽�
                result.add(interval);       //����Ԫ�طŽ������
            } else {
                result.get(result.size() - 1)[1] = Math.max(result.get(result.size() - 1)[1], interval[1]);     //�޸���һ��Ԫ�ص��ұ߽�Ϊ���ļ���
            }
        }
        return result.toArray(new int[result.size()][2]);       //���ض�ά����
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
