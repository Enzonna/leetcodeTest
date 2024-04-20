package enzo;

import org.testng.annotations.Test;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/**
 * Package: enzo
 * Description: ȫ����
 *
 * @Author ENZO
 * @Create 2024��4��8�� 18:24
 */
public class Test0046 {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();     //�����,���ص��б�
        HashMap<Integer, Boolean> visited = new HashMap<>();        //�Ƿ񱻷��ʹ�

        for (int m : nums) {
            visited.put(m, false);      //�����еķ���ֵ����false
        }

        backTracking(nums, result, visited, new ArrayList<>());
        return result;
    }

    public void backTracking(int[] nums, List<List<Integer>> result, HashMap<Integer, Boolean> visited, ArrayList<Integer> list) {
        if (list.size() == nums.length) {       //���list�ĳ��ȵ�����Ŀ������ĳ��ȣ���ôlist�����ˣ���list�Ž�result�������������
            result.add(new ArrayList<>(list));      //�����µķŽ�ȥ
            return;
        }
        //ȡ��һ��Ԫ��m
        for (int m : nums) {
            if (!visited.get(m)) {      //�����Ԫ�صķ���ֵ��false��֤��δ���ʹ�
                list.add(m);        //����Ԫ�طŽ�list��
                visited.put(m, true);       //�޸ĸ�Ԫ�صķ���ֵΪtrue��֤�����ʹ�
                backTracking(nums, result, visited, list);      //��������
                list.remove(list.size() - 1);       //ɾ��list�ģ�����������һ������ɾ�����Ǹ��ڵ㣬��ΪҪ���ݣ�����һ���ڵ������ѯ�ֵܷ�֧
                visited.put(m, false);      //����Ԫ�ط���ֵ�޸�Ϊfalse
            }
        }
    }


    @Test
    public void test() {
        int[] arr = {1, 2, 3};
        List<List<Integer>> lists = permute(arr);
        System.out.println(lists);

    }

}
