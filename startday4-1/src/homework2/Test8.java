package homework2;

import java.util.HashMap;
import java.util.Map;

/**
 * Package: homework2
 * Description:
 *
 * @Author ENZO
 * @Create 2024��4��10�� 09:28
 */
//8�����������и������������
public class Test8 {
    public static int myFun(int[] arr) {
        HashMap<Integer, Integer> hashMap = new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            hashMap.put(arr[i], hashMap.getOrDefault(arr[i], 0) + 1);
        }

        for (Map.Entry<Integer, Integer> entry : hashMap.entrySet()) {
            if (entry.getValue() > (arr.length / 2)) {
                return entry.getKey();
            }
        }
        return -1;
    }


    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 2, 2, 2, 5, 4, 2, 4, 4, 4, 4, 4, 4, 4, 4};
        int result = myFun(arr);
        if (result != -1) {
            System.out.println("��Ԫ��Ϊ��" + result);
        } else {
            System.out.println("����ʧ��");
        }

    }
}
