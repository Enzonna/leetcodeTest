package enzo;

import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.List;

/**
 * Package: enzo
 * Description: ������Ǵ�����
 *
 * @Author ENZO
 * @Create 2024��4��11�� 20:09
 */
public class Test0119 {
    public List<Integer> getRow(int rowIndex) {
        ArrayList<List<Integer>> result = new ArrayList<>();

        for (int i = 0; i <= rowIndex; i++) {
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

        return result.get(rowIndex);
    }

    @Test
    public void test() {
        int m = 4;
        List<Integer> arrayList = getRow(m);

        System.out.println(arrayList);
    }
}
