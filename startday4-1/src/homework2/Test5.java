package homework2;

import java.util.HashMap;
import java.util.Map;

/**
 * Package: homework2
 * Description:
 *
 * @Author ENZO
 * @Create 2024Äê4ÔÂ9ÈÕ 20:20
 */
public class Test5 {
    public static void main(String[] args) {
        int[] arr = {2, 6, 2, 5, 7, 1, 2, 5, 6, 1, 5, 6, 1, 6, 5, 7, 1};

        HashMap<Integer, Integer> hashMap = new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            hashMap.put(arr[i], hashMap.getOrDefault(arr[i], 0) + 1);
        }

        for (Map.Entry<Integer, Integer> entry : hashMap.entrySet()) {
            if (entry.getValue() % 2 != 0){
                System.out.println(entry.getKey());
            }
        }


    }
}
