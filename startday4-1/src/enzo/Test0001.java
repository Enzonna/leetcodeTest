package enzo;

import org.testng.annotations.Test;

import java.util.HashMap;
import java.util.Map;

/**
 * ClassName: Test0001
 * Package: enzo
 * Description:
 *
 * @Author ENZO
 * @Create 2024/4/1 14:39
 * @Version 1.0
 */
public class Test0001 {
    public int[] twoSum(int[] nums, int target) {
        int[] m = new int[2];
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] + nums[j] == target) {
                    m[0] = i;
                    m[1] = j;
                }
            }
        }
        float a = 3.4F;
        float b = 3;
        return m;
    }


    public int[] twoSum2(int[] nums, int target) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int[] a = new int[2];
        for (int i = 0; i < nums.length; i++) {
            Integer value = map.get(nums[i]);
            System.out.println(value);
            if (value != null) {
                a[0] = value;
                a[1] = i;
                break;
            }
            map.put(target - nums[i], i);
        }
        return a;
    }

    public int[] twoSum3(int[] nums, int target) {
        Map<Integer, Integer> hashMap = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if (hashMap.containsKey(target - nums[i])) {
                return new int[]{hashMap.get(target - nums[i]), i};
            }
            hashMap.put(nums[i], i);
        }
        return new int[0];
    }

    @Test
    public void test() {
        int[] m = new int[]{2, 7, 11, 15};
        int[] arr = twoSum3(m, 9);
        for (int i : arr) {
            System.out.println(i);
        }
    }


}



