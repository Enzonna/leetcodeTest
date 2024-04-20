package enzo;

import org.testng.annotations.Test;

/**
 * Package: enzo
 * Description: ʢ���ˮ������
 *
 * @Author ENZO
 * @Create 2024��4��14�� 11:16
 */
public class Test0011 {
    //������ʱ
//    public int maxArea(int[] height) {
//        int res = 0;
//
//        //��ѭ��
//        for (int i = 0; i < height.length; i++) {
//
//            //Сѭ��
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

        //˫ָ��
        int l = 0, r = height.length - 1;

        while (l < r) {
            int temp = Math.min(height[l], height[r]) * (r - l);
            //�����ָ��С����ָ�룬��ô�ұ��ƶ�
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
