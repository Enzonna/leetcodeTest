package enzo;

import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.List;

/**
 * Package: enzo
 * Description: 杨辉三角
 *
 * @Author ENZO
 * @Create 2024年4月11日 19:48
 */
public class Test0118 {
    public List<List<Integer>> generate(int numRows) {
        ArrayList<List<Integer>> result = new ArrayList<>();

        for (int i = 0; i < numRows; i++) {
            ArrayList<Integer> temp = new ArrayList<>();
            for (int j = 0; j <= i; j++) {
                if (j == 0 || j == i) {
                    temp.add(1);
                } else {
                    temp.add(result.get(i - 1).get(j - 1) + result.get(i - 1).get(j));
                }
            }
            result.add(temp);
        }

        return result;
    }

    @Test
    public void test() {
        int m = 4;
        List<List<Integer>> arrayList = new ArrayList<>();
        arrayList = generate(m);

        System.out.println(arrayList);
    }
}
