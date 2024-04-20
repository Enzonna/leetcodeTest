package enzo;

import org.testng.annotations.Test;

/**
 * Package: enzo
 * Description: ËÑË÷²åÈëÎ»ÖÃ
 *
 * @Author ENZO
 * @Create 7/4/2024 ÏÂÎç4:31
 */
public class Test0035 {
    public int searchInsert1(int[] nums, int target) {
        int node = 1;
        int temp = 0;
        while (temp < nums.length) {
            if (nums[temp] < target) {
                node = ++temp;
            } else if (nums[temp] == target) {
                node = temp;
                break;
            } else {
                node = temp;
                break;
            }
        }
        return node;
    }

    public int searchInsert(int[] nums, int target){
        int left = 0, right = nums.length - 1, ans = 0;
        while (left < right){
            int mid = (right - left) / 2 + left;
            if (target <= nums[mid]){
                ans = mid;
                right = mid - 1;
            }else {
                left = mid + 1;
            }
        }
        return ans;
    }
    
    @Test
    public void test(){
        int[] arr = new int[]{1,3,5,6};
        System.out.println(searchInsert(arr,2));
    }
}
