package enzo;

import org.testng.annotations.Test;

import java.util.Arrays;

/**
 * Package: enzo
 * Description: ��ӽ�������֮��
 *
 * @Author ENZO
 * @Create 2024��4��14�� 10:11
 */
public class Test0016 {
    public int threeSumClosest(int[] nums, int target) {
        int result = Integer.MAX_VALUE;
        Arrays.sort(nums);

        //��һ��ѭ������ѭ����һ��Ԫ��
        for (int i = 0; i < nums.length; i++) {

            if (i > 0 && nums[i] == nums[i - 1]) {
                continue;
            }

            //˫ָ�룬��ָ����ָ�붨��
            int l = i + 1, r = nums.length - 1;
            //�ڶ���ѭ��������
            while (l < r) {
                int sum = nums[i] + nums[l] + nums[r];
                if (sum == target) {
                    return target;
                }

                if (Math.abs(sum - target) < Math.abs(result - target)) {
                    result = sum;
                }
                //�����С��Ŀ��ֵ��˵����С�ˣ���ָ��Ӧ��������
                if (sum > target) {
                    r--;

                } else {
                    l++;
                }
            }
        }
        return result;
    }

    @Test
    public void test() {
        int[] arr = {-1, 2, 1, -4};
        System.out.println(threeSumClosest(arr, 1));
    }
}
