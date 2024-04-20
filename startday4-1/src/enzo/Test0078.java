package enzo;

import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.List;

/**
 * Package: enzo
 * Description:�Ӽ�
 *
 * @Author ENZO
 * @Create 2024��4��10�� 14:41
 */
public class Test0078 {
    //����һ�� ��չ��
    public List<List<Integer>> subsets1(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();     //�����
        result.add(new ArrayList<>());      //[]

        for (int m : nums) {        //������ÿ�ζ������е������ϼ�m
            //�½�temp1����ѭ������ʱ����
            List<List<Integer>> temp1 = new ArrayList<>();
            //���������������Ԫ��
            for (List<Integer> list : result) {
                //�½�temp2��Сѭ������ʱ���飬ÿ�ζ����������е�Ԫ�أ�m
                //�ȸ��ƣ���������������������һ�ֵ�result������ֵȡ��temp2�������������
                List<Integer> temp2 = new ArrayList<>(list);
                //��ÿ��temp2�����m
                temp2.add(m);
                //��Сѭ��temp2�����ѭ��temp1
                temp1.add(temp2);
            }
            //ÿ��ѭ�����������ε����н����ӵ�result������У������Ա���һ��ѭ�������������е�Ԫ��
            for (List<Integer> l : temp1) {
                result.add(l);
            }
        }
        return result;
    }

    //�������� ���ݷ���Ҫ���ݹ�ͼ�֦
    public List<List<Integer>> subsets(int[] nums) {
        ArrayList<List<Integer>> result = new ArrayList<>();
        result.add(new ArrayList<>());
        for (int i = 1; i <= nums.length; i++) {
            backTracking(nums, result, i, 0, new ArrayList<>());
        }
        return result;
    }

    //���ݺ���,result�������length�Ӽ��ĳ��ȣ�index���ĸ�������ʼ�ң�subset�Ӽ�
    public void backTracking(int[] nums, List<List<Integer>> result, int length, int index, List<Integer> subset) {
        //��֦����,һ�������������Ͱ����ӽ�result
        if (subset.size() == length) {
            List<Integer> temp = new ArrayList<>(subset);
            //���
            result.add(temp);
            return;
        }

        for (int i = index; i < nums.length; i++) {
            subset.add(nums[i]);
            backTracking(nums, result, length, i + 1, subset);
            //��һ������һ��Ҫɾ����һ��Ԫ�أ�����������������
            subset.remove(subset.size() - 1);
        }

    }


    @Test
    public void test() {
        int[] nums = {1, 2, 2};
        List<List<Integer>> lists = subsets(nums);
        System.out.println(lists);
    }

}
