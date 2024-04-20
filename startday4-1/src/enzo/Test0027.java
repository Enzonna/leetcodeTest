package enzo;

import org.testng.annotations.Test;

/**
 * Package: enzo
 * Description: ÒÆ³ıÔªËØ
 *
 * @Author ENZO
 * @Create 2024/4/2 10:09
 */
public class Test0027 {
    public int removeElement1(int[] nums, int val) {
        int m = nums.length;
        int slow = 0, fast = 0;
        while (fast < m) {
            if (nums[fast] != val) {
                nums[slow] = nums[fast];
                slow++;
            }
            fast++;
        }
        return slow;
    }


    public int removeElement2(int[] nums, int val) {
        int fast = 0, slow = 0;
        while (fast < nums.length) {
            if (nums[fast] != val) {
                nums[slow] = nums[fast];
                slow++;
            }
            fast++;
        }
        return slow;
    }

    public int removeElement(int[] nums, int val) {
        if (nums == null || nums.length == 0){
            return 0;
        }

        int fast = nums.length - 1, slow = 0;
        while (slow < fast) {
            while (slow < fast && nums[fast] == val) {
                fast--;
            }
            while (slow < fast && nums[slow] != val) {
                slow++;
            }
            int temp = nums[slow];
            nums[slow] = nums[fast];
            nums[fast] = temp;
        }
        return nums[slow] == val ? slow : slow + 1;
    }

    @Test
    public void test() {
        int[] arr = new int[]{0, 1, 2, 2, 3, 0, 4, 2};
        int[] arr2 = new int[]{3, 2, 2, 3};
        System.out.println(removeElement(arr, 2));
        for (int i : arr) {
            System.out.print(i);
        }
    }
}
