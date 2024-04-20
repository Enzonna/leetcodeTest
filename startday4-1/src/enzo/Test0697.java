package enzo;

import org.testng.annotations.Test;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Package: enzo
 * Description: 数组的度
 *
 * @Author ENZO
 * @Create 2024/4/3 21:23
 */
public class Test0697 {
    public int findShortestSubArray(int[] nums) {
        int count = 0;
        Map<Integer, Integer> map = new HashMap<>();
        int m = nums.length;
        for (int i : nums) {
            map.put(i, map.getOrDefault(i, 0) + 1);
        }

        for (int i = 0; i < m; i++) {
            int temp = map.getOrDefault(i, 0);
            if (temp > count) {
                count = temp;
            }
        }
        return count;
    }

    @Test
    public void test() {
        int[] arr = new int[]{1, 2, 2, 3, 1};
        System.out.println(findShortestSubArray(arr));
    }
}
