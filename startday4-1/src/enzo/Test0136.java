package enzo;

import java.util.HashMap;
import java.util.Map;

/**
 * Package: enzo
 * Description: 只出现一次的数字
 *
 * @Author ENZO
 * @Create 2024年4月11日 19:08
 */
public class Test0136 {
    public int singleNumber(int[] nums) {
        HashMap<Integer, Integer> hashMap = new HashMap<>();
        int temp = nums[0];

        for (int i = 0; i < nums.length; i++) {
            hashMap.put(nums[i], hashMap.getOrDefault(nums[i], 0) + 1);
        }

        for (Map.Entry<Integer, Integer> entry : hashMap.entrySet()) {
            if (entry.getValue() == 1) {
                temp = entry.getKey();
            }
        }
        return temp;
    }
}
