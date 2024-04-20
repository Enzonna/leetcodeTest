package enzo;

import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Package: enzo
 * Description: 三数之和
 *
 * @Author ENZO
 * @Create 2024年4月12日 14:58
 */
//第二重循环枚举到的元素不小于当前第一重循环枚举到的元素；
//第三重循环枚举到的元素不小于当前第二重循环枚举到的元素。
//可以发现，如果我们固定了前两重循环枚举到的元素 a 和 b，那么只有唯一的 c 满足 a+b+c=0。当第二重循环往后枚举一个元素 b时，由于 b′> b，
//那么满足 a+b′+c′=0的 c′ 一定有 c′<c，即 c′在数组中一定出现在 c 的左侧。
//也就是说，我们可以从小到大枚举 b，同时从大到小枚举 c，即第二重循环和第三重循环实际上是并列的关系。

public class Test0015 {
    public List<List<Integer>> threeSum(int[] nums) {

        List<List<Integer>> result = new ArrayList<>();        //结果集

        Arrays.sort(nums);

        int m = nums.length;
        //第一层循环
        for (int i = 0; i < m; i++) {

            //需要和上一个i不一样，不然继续找
            if (i > 0 && nums[i] == nums[i - 1]) {
                continue;
            }
            int target = -nums[i];      //第一个目标值，互补

            //双指针
            int c = nums.length - 1;

            //第二层循环，枚举第二个元素b
            //!!!!!!!!!!!!!!!!!!!!!!!!!!!!三层降两层
            for (int b = i + 1; b < nums.length; b++) {

                //需要和上一个i不一样，不然继续找
                if (b > i + 1 && nums[b] == nums[b - 1]) {
                    continue;
                }

                //保证c指针在b指针的右边，锁死c的位置，在中间枚举b
                while (b < c && nums[b] + nums[c] > target) {
                    c--;
                }

                //如果b==c，break
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
