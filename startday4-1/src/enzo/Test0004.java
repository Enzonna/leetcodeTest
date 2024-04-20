package enzo;

import org.testng.annotations.Test;

/**
 * Package: enzo
 * Description: 两正序数组的中位数
 *
 * @Author ENZO
 * @Create 2024年4月15日 15:26
 */
public class Test0004 {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int total = nums1.length + nums2.length;
        double res;
        //奇数偶数分情况讨论
        if (total % 2 != 0) {
            res = getKthElement(nums1, nums2, total / 2 + 1);
        } else {
            res = (getKthElement(nums1, nums2, total / 2) + getKthElement(nums1, nums2, total / 2 + 1)) / 2.0;
        }
        return res;

    }

    public int getKthElement(int[] nums1, int[] nums2, int k) {
        int index1 = 0, index2 = 0;     //两数组的指针

        while (true) {
            //其中一个数组到头了，直接返回另一个数组，边界情况
            if (index1 == nums1.length) {
                return nums2[index2 + k - 1];
            }
            if (index2 == nums2.length) {
                return nums1[index1 + k - 1];
            }
            //正常的返回形式，k都是1，挑选这两个小的返回出去
            if (k == 1) {
                return Math.min(nums1[index1], nums2[index2]);
            }

            int half = k / 2;       //核心思想，每次循环使查找范围减少一半
            //新起点的索引
            int newIndex1 = Math.min(index1 + half, nums1.length) - 1;
            int newIndex2 = Math.min(index2 + half, nums2.length) - 1;
            //新起点的值
            int pre1 = nums1[newIndex1], pre2 = nums2[newIndex2];

            if (pre1 <= pre2) {
                //错误！！！！防止越界的错误
                k -= (newIndex1 - index1 + 1);
                index1 = newIndex1 + 1;
            } else {
                k -= (newIndex2 - index2 + 1);
                index2 = newIndex2 + 1;
            }
        }
    }

    @Test
    public void test() {
        int[] arr1 = {1, 2};
        int[] arr2 = {3, 4};
        System.out.println(findMedianSortedArrays(arr1, arr2));
    }


}

