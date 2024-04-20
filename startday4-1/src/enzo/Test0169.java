package enzo;

import java.util.HashMap;
import java.util.Map;

/**
 * Package: enzo
 * Description: 多数元素
 *
 * @Author ENZO
 * @Create 2024年4月11日 18:38
 */
public class Test0169 {
    public int majorityElement(int[] nums) {

        HashMap<Integer, Integer> hashMap = new HashMap<>();
        int m = 0;

        for (int i = 0; i < nums.length; i++) {
            hashMap.put(nums[i], hashMap.getOrDefault(nums[i], 0) + 1);
        }

        for (Map.Entry<Integer, Integer> entry : hashMap.entrySet()) {
            if (entry.getValue() > nums.length / 2) {
                m = entry.getKey();
            }
        }

        return m;
    }
}
