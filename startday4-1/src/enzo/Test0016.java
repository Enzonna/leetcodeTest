package enzo;

import org.testng.annotations.Test;

import java.util.Arrays;

/**
 * Package: enzo
 * Description: 最接近的三数之和
 *
 * @Author ENZO
 * @Create 2024年4月14日 10:11
 */
public class Test0016 {
    public int threeSumClosest(int[] nums, int target) {
        int result = Integer.MAX_VALUE;
        Arrays.sort(nums);

        //第一层循环，大循环第一个元素
        for (int i = 0; i < nums.length; i++) {

            if (i > 0 && nums[i] == nums[i - 1]) {
                continue;
            }

            //双指针，左指针右指针定界
            int l = i + 1, r = nums.length - 1;
            //第二层循环，定界
            while (l < r) {
                int sum = nums[i] + nums[l] + nums[r];
                if (sum == target) {
                    return target;
                }

                if (Math.abs(sum - target) < Math.abs(result - target)) {
                    result = sum;
                }
                //如果和小于目标值，说明和小了，右指针应该往左走
                if (sum > target) {
                    r--;

                } else {
                    l++;
                }
            }
        }
        return result;
    }

    @Test
    public void test() {
        int[] arr = {-1, 2, 1, -4};
        System.out.println(threeSumClosest(arr, 1));
    }
}
