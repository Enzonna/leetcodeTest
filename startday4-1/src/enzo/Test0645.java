package enzo;

import org.testng.annotations.Test;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Package: enzo
 * Description: 数组里找错误数据
 *
 * @Author ENZO
 * @Create 2024/4/3 15:33
 */
public class Test0645 {
    public int[] findErrorNums(int[] nums) {
        int[] arr = new int[2];
        Map<Integer, Integer> hashMap = new HashMap<>();
        for (int i : nums) {
            hashMap.put(i, hashMap.getOrDefault(i, 0) + 1);
        }
        for (int i = 1; i <= nums.length; i++) {
            int count = hashMap.getOrDefault(i,0);
            if (count == 2){
                arr[0] = i;
            }else if (count == 0){
                arr[1] = i;
            }
        }
        return arr;
    }

    @Test
    public void test() {
        int[] arr = new int[]{1, 2, 2, 4};
        int[] arr2 = new int[]{2, 2};
        int[] myArr = new int[2];
        myArr = findErrorNums(arr);
        for (int i : myArr) {
            System.out.print(i);
        }
    }
}
