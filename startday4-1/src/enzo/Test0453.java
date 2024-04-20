package enzo;

import org.testng.annotations.Test;

import java.util.Arrays;

/**
 * Package: enzo
 * Description: Êı×é²Ù×÷
 *
 * @Author ENZO
 * @Create 2024/4/3 8:31
 */
public class Test0453 {
    public int minMoves(int[] nums) {
        int minNum = Arrays.stream(nums).min().getAsInt();
        int res = 0;
        for (int num : nums){
            res += num - minNum;
        }
        return res;
    }
    
    
    @Test
    public void test(){
        int[] nums = new int[]{1,2,3};
        int[] nums2 = new int[]{1,1,1};
        System.out.println(minMoves(nums));
        System.out.println(minMoves(nums2));
    }
}
