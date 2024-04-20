package enzo;

import org.testng.annotations.Test;
import org.w3c.dom.ls.LSInput;

import java.util.*;

/**
 * Package: enzo
 * Description: �Ӽ�2
 *
 * @Author ENZO
 * @Create 2024��4��11�� 10:53
 */
public class Test0090 {
    //���ݷ���Ҫ���ݹ�ͼ�֦
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        ArrayList<List<Integer>> result = new ArrayList<>();
        result.add(new ArrayList<>());
        for (int i = 1; i <= nums.length; i++) {
            backTracking(nums, result, i, 0, new ArrayList<>());
        }
        return result;
    }

    // ���ݺ���,result�������length�Ӽ��ĳ��ȣ�index���ĸ�������ʼ�ң�subset�Ӽ�
    public void backTracking(int[] nums, List<List<Integer>> result, int length, int index, List<Integer> subset) {
        // ��֦����,һ���������������Ҳ���֮ǰ���ظ����Ͱ����ӽ�result
        //����
        boolean flag = true;
        if (subset.size() == length) {
            List<Integer> temp = new ArrayList<>(subset);
            Collections.sort(temp);
            for (List<Integer> list : result) {
                if (list.equals(temp)) {
                    flag = false;
                }
            }

            if (flag) {
                result.add(temp);
            }
        }

        for (int i = index; i < nums.length; i++) {
            subset.add(nums[i]);
            backTracking(nums, result, length, i + 1, subset);
            // ��һ������һ��Ҫɾ����һ��Ԫ�أ�����������������
            subset.remove(subset.size() - 1);
        }

    }


    @Test
    public void test() {
        int[] nums = {4, 4, 4, 1, 4};
        List<List<Integer>> lists = subsetsWithDup(nums);
        System.out.println(lists);
    }


    @Test
    public void test2() {
        ArrayList<List<Integer>> lists = new ArrayList<>();     //��list�����integers
        lists.add(new ArrayList<>());

        ArrayList<Integer> integers = new ArrayList<>();
        integers.add(1);
        integers.add(2);
        lists.add(integers);

        System.out.println("lists = " + lists);
        System.out.println("integers = " + integers);

        boolean flag = true;
        for (List<Integer> list : lists) {       //���integers��list�������е�Ԫ�ض���һ��������ӽ�ȥ
            ArrayList<Integer> temp = new ArrayList<>(integers);        //Ҫ�Ƚϵ�Ԫ��
            if (list.equals(temp)) {
                flag = false;
                break;
            }
        }

        if (flag == true) {
            lists.add(integers);
        } else {
            System.out.println("failed to add!");
        }

        System.out.println(lists);


    }

}
