package enzo;

import org.testng.annotations.Test;

/**
 * Package: enzo
 * Description: 双指针删除相同元素
 *
 * @Author ENZO
 * @Create 2024/4/2 9:21
 */
public class Test0026 {
    public int removeDuplicates(int[] nums) {
        int n = nums.length;

        int fast = 1, slow = 1;
        while (fast < n) {
            if (nums[fast] != nums[fast - 1]) {
                nums[slow] = nums[fast];
                slow++;
            }
            fast++;
        }
        return slow;
    }

    @Test
    public void test() {
        int[] arr = new int[]{1, 1, 2};
        int[] arr2 = new int[]{0,0,1,1,1,2,2,3,3,4};

        System.out.println(removeDuplicates(arr));
        System.out.println(removeDuplicates(arr2));

    }
}
