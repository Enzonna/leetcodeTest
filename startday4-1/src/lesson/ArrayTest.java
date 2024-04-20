package lesson;

import org.testng.annotations.Test;

import java.util.ArrayList;

/**
 * Package: lesson
 * Description:
 *
 * @Author ENZO
 * @Create 2024Äê4ÔÂ9ÈÕ 15:37
 */
public class ArrayTest {
    public ArrayList<Integer> search(int[] nums, int target) {
        ArrayList<Integer> result = new ArrayList<>();
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == target) {
                result.add(i);
            }
        }
        return result;
    }


    @Test
    public void test(){
        int[] arr = {8,35,2,2,2,2,2,6};
        ArrayList<Integer> list = search(arr,2);
        System.out.println(list);
    }
}
