package enzo;

import org.testng.annotations.Test;

/**
 * Package: enzo
 * Description: ·ÇµÝ¼õÊý×é
 *
 * @Author ENZO
 * @Create 2024/4/3 9:09
 */
public class Test0665 {
    public boolean checkPossibility(int[] nums) {
        for (int i = 0; i < nums.length - 1; i++) {
            int x = nums[i];
            int y = nums[i + 1];
            if (x > y) {
                nums[i] = y;
                if (isSort(nums)){
                    return isSort(nums);
                }
                nums[i] = x;
                nums[i + 1] = x;
                return isSort(nums);
            }

        }
        return true;
    }

    public boolean isSort(int[] nums) {
        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] > nums[i + 1]) {
                return false;
            }
        }
        return true;
    }

    @Test
    public void test() {
        int[] num4 = new int[]{5, 7, 1, 8};
        System.out.println(checkPossibility(num4));

    }
}
