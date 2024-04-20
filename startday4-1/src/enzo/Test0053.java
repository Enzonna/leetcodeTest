package enzo;

import org.testng.annotations.Test;

/**
 * Package: enzo
 * Description:
 *
 * @Author ENZO
 * @Create 2024年4月8日 20:35
 */
public class Test0053 {
    //暴力法
    public int maxSubArray1(int[] nums) {
        int length = nums.length;
        int sum = nums[0];
        for (int i = 0; i < length; i++) {
            int temp = 0;       //第一个错误
            for (int j = i; j < length; j++) {
                temp = temp + nums[j];
                sum = Math.max(sum, temp);
            }
        }
        return sum;
    }


    // 动态规划

    public int maxSubAray1(int[] nums) {
        int pre = 0, maxAns = nums[0];
        for (int x : nums) {
            //pre来维护对于当前f(i)的f(i?1)的值是多少
            pre = Math.max(pre + x, x);//判断f(i-1)是否要加到当前数上
            maxAns = Math.max(maxAns, pre);//获取最大值
        }
        return maxAns;
    }

    // 贪心法

    public int maxSubAray2(int[] nums) {
        //类似寻找最大最小值的题目,初始值一定要定义成理论上的最小最大值
        int result = Integer.MIN_VALUE;
        int numsSize = nums.length;
        int sum = 0;
        for (int i = 0; i < numsSize; i++) {
            sum += nums[i];
            result = Math.max(result, sum);
            //如果sum < 0,重新开始找子序串
            if (sum < 0) {
                sum = 0;
            }
        }

        return result;
    }


    // 分治法: 线段树

    public int maxSubAray3(int[] nums) {
        if (nums == null || nums.length <= 0)// 输入校验
            return 0;
        int len = nums.length;// 获取输入长度
        return getInfo(nums, 0, len - 1).mSum;
    }

    static class wtevTree { //线段树
        int lSum;// 以左区间为端点的最大子段和
        int rSum;// 以右区间为端点的最大子段和
        int iSum;// 区间所有数的和
        int mSum;// 该区间的最大子段和

        wtevTree(int l, int r, int i, int m) { // 构造函数
            lSum = l;
            rSum = r;
            iSum = i;
            mSum = m;
        }
    }

    // 通过既有的属性,计算上一层的属性,一步步往上返回,获得线段树
    wtevTree pushUp(wtevTree leftT, wtevTree rightT) {
        // 新子段的lSum等于左区间的lSum或者左区间的 区间和 加上右区间的lSum
        int l = Math.max(leftT.lSum, leftT.iSum + rightT.lSum);
        // 新子段的rSum等于右区间的rSum或者右区间的 区间和 加上左区间的rSum
        int r = Math.max(leftT.rSum + rightT.iSum, rightT.rSum);
        // 新子段的区间和等于左右区间的区间和之和
        int i = leftT.iSum + rightT.iSum;
        // 新子段的最大子段和,其子段有可能穿过左右区间,或左区间,或右区间
        int m = Math.max(leftT.rSum + rightT.lSum, Math.max(leftT.mSum, rightT.mSum));
        return new wtevTree(l, r, i, m);
    }

    // 递归建立和获得输入区间所有子段的结构
    wtevTree getInfo(int[] nums, int left, int right) {
        if (left == right) // 若区间长度为1,其四个子段均为其值
            return new wtevTree(nums[left], nums[left], nums[left], nums[left]);
        int mid = (left + right) >> 1;// 获得中间点mid,右移一位相当于除以2,运算更快
        wtevTree leftT = getInfo(nums, left, mid);
        wtevTree rightT = getInfo(nums, mid + 1, right);//mid+1,左右区间没有交集。
        return pushUp(leftT, rightT);//递归结束后,做最后一次合并
    }


    @Test
    public void test() {
        int[] arr = {-2, 1, -3, 4, -1, 2, 1, -5, 4};
        //int[] arr2 = {-1};
        System.out.println(maxSubAray1(arr));
        //System.out.println(maxSubArray(arr2));
    }
}
