package enzo;

import org.testng.annotations.Test;

/**
 * Package: enzo
 * Description: Ğı×ªÊı×é
 *
 * @Author ENZO
 * @Create 2024/4/3 11:50
 */
public class Test0189 {
    public void rotate(int[] nums, int k) {
        k %= nums.length;
        reverse(nums, 0, nums.length - 1);
        reverse(nums, 0, k - 1);
        reverse(nums, k, nums.length - 1);
    }

    public void reverse(int[] nums, int start, int end) {
        while (start < end) {
            int temp = nums[start];
            nums[start] = nums[end];
            nums[end] = temp;
            start++;
            end--;
        }
    }

    @Test
    public void test() {
        int[] arr = {1,2,3,4,5,6,7};
        rotate(arr, 3);
        for (int m : arr) {
            System.out.print(m);
        }
    }
}
