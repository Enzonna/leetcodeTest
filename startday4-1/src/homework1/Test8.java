package homework1;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

/**
 * Package: homework1
 * Description:
 *
 * @Author ENZO
 * @Create 2024年4月9日 19:28
 */
public class Test8 {
    public static void main(String[] args) {
        String s = "pneumonoultramicroscopicsilicovolcanoconiosis";
        char[] chars = s.toCharArray();

        HashMap<Character, Integer> result = new HashMap<>();
        for (int i = 0; i < chars.length; i++) {
            result.put(chars[i], result.getOrDefault(chars[i], 0) + 1);
        }

        for (Map.Entry<Character, Integer> entry : result.entrySet()) {
            System.out.println(entry.getKey() + "的次数是：" + entry.getValue());
        }


    }

}
