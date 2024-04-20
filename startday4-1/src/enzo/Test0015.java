package enzo;

import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Package: enzo
 * Description: ����֮��
 *
 * @Author ENZO
 * @Create 2024��4��12�� 14:58
 */
//�ڶ���ѭ��ö�ٵ���Ԫ�ز�С�ڵ�ǰ��һ��ѭ��ö�ٵ���Ԫ�أ�
//������ѭ��ö�ٵ���Ԫ�ز�С�ڵ�ǰ�ڶ���ѭ��ö�ٵ���Ԫ�ء�
//���Է��֣�������ǹ̶���ǰ����ѭ��ö�ٵ���Ԫ�� a �� b����ôֻ��Ψһ�� c ���� a+b+c=0�����ڶ���ѭ������ö��һ��Ԫ�� bʱ������ b��> b��
//��ô���� a+b��+c��=0�� c�� һ���� c��<c���� c����������һ�������� c ����ࡣ
//Ҳ����˵�����ǿ��Դ�С����ö�� b��ͬʱ�Ӵ�Сö�� c�����ڶ���ѭ���͵�����ѭ��ʵ�����ǲ��еĹ�ϵ��

public class Test0015 {
    public List<List<Integer>> threeSum(int[] nums) {

        List<List<Integer>> result = new ArrayList<>();        //�����

        Arrays.sort(nums);

        int m = nums.length;
        //��һ��ѭ��
        for (int i = 0; i < m; i++) {

            //��Ҫ����һ��i��һ������Ȼ������
            if (i > 0 && nums[i] == nums[i - 1]) {
                continue;
            }
            int target = -nums[i];      //��һ��Ŀ��ֵ������

            //˫ָ��
            int c = nums.length - 1;

            //�ڶ���ѭ����ö�ٵڶ���Ԫ��b
            //!!!!!!!!!!!!!!!!!!!!!!!!!!!!���㽵����
            for (int b = i + 1; b < nums.length; b++) {

                //��Ҫ����һ��i��һ������Ȼ������
                if (b > i + 1 && nums[b] == nums[b - 1]) {
                    continue;
                }

                //��֤cָ����bָ����ұߣ�����c��λ�ã����м�ö��b
                while (b < c && nums[b] + nums[c] > target) {
                    c--;
                }

                //���b==c��break
                if (b == c) {
                    break;
                }

                if (nums[b] + nums[c] == target) {
                    List<Integer> integers = new ArrayList<>();
                    integers.add(nums[i]);
                    integers.add(nums[b]);
                    integers.add(nums[c]);
                    result.add(integers);
                }
            }
        }
        return result;
    }

    @Test
    public void test() {
        int[] nums = {-1, 0, 1, 2, -1, -4};
        List<List<Integer>> lists = threeSum(nums);
        System.out.println(lists);
    }
}
