package enzo;

import org.testng.annotations.Test;

/**
 * Package: enzo
 * Description: 正整数和负整数的最大计数
 *
 * @Author ENZO
 * @Create 2024年4月9日 08:09
 */
public class Test2529 {
    public int maximumCount(int[] nums) {
        int pos1 = search(nums,0);
        int pos2 = search(nums,1);
        return Math.max(pos1,nums.length - pos2);
    }

    public int search(int[] nums, int target) {
        int l = 0, r = nums.length;
        while (l < r) {
            int m = (l + r) / 2;
            if (nums[m] >= target) {
                r = m;
            } else {
                l = m + 1;
            }
        }
        return l;
    }

    @Test
    public void test(){
        int[] num1 = {-2,-1,-1,1,2,3};
        System.out.println(maximumCount(num1));
    }
}
