package enzo;

import org.testng.annotations.Test;

/**
 * Package: enzo
 * Description: “∆∂Ø¡„
 *
 * @Author ENZO
 * @Create 2024/4/3 10:37
 */
public class Test0283 {
    public void moveZeroes(int[] nums) {
        int slow = 0, fast = 0;
        while (fast < nums.length) {
            if (nums[fast] != 0) {
                int tmp = nums[slow];
                nums[slow] = nums[fast];
                nums[fast] = tmp;
                slow++;
            }
            fast++;
        }
    }


    @Test
    public void test() {
        int[] nums1 = new int[]{0, 1, 0, 3, 12};
        int[] nums2 = new int[]{0};
        moveZeroes(nums1);
        for (int m : nums1) {
            System.out.print(m + " ");
        }

    }
}
