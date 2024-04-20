package enzo;

import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * Package: enzo
 * Description: Ðý×ªº¯Êý
 *
 * @Author ENZO
 * @Create 2024/4/3 14:57
 */
public class Test0396 {
    public int maxRotateFunction(int[] nums) {
        int f = 0, m = nums.length, sum = Arrays.stream(nums).sum();
        for (int i = 0; i < m; i++) {
            f += i * nums[i];
        }
        int res = f;
        for (int i = m - 1; i > 0; i--) {
            f += sum - m * nums[i];
            res = Math.max(f, res);
        }
        return res;
    }


    @Test
    public void test() {
        int[] arr = {4, 3, 2, 6};
        System.out.println(maxRotateFunction(arr));
    }
}
