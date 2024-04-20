package enzo;

import org.testng.annotations.Test;

/**
 * Package: enzo
 * Description: 盛最多水的容器
 *
 * @Author ENZO
 * @Create 2024年4月14日 11:16
 */
public class Test0011 {
    //方法超时
//    public int maxArea(int[] height) {
//        int res = 0;
//
//        //大循环
//        for (int i = 0; i < height.length; i++) {
//
//            //小循环
//            for (int j = i + 1; j < height.length; j++) {
//
//                int temp = (j - i) * Math.min(height[j],height[i]);
//                res = Math.max(res, temp);
//
//            }
//        }
//
//        return res;
//    }
    public int maxArea(int[] height) {
        int res = 0;

        //双指针
        int l = 0, r = height.length - 1;

        while (l < r) {
            int temp = Math.min(height[l], height[r]) * (r - l);
            //如果左指针小于右指针，那么右边移动
            if (height[l] <= height[r]) {
                l++;

            } else {
                r--;

            }
            res = Math.max(temp, res);
        }
        return res;
    }

    @Test
    public void test() {
        int[] arr1 = {1, 8, 6, 2, 5, 4, 8, 3, 7};
        System.out.println(maxArea(arr1));
    }
}
