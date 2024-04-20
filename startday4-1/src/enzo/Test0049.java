package enzo;

import org.testng.annotations.Test;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

/**
 * Package: enzo
 * Description: 字母异位词分组
 *
 * @Author ENZO
 * @Create 2024年4月8日 16:26
 */
public class Test0049 {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String, ArrayList> result = new HashMap<>();
        //将每一个字符串排序后放进hashMap的key中
        for (String s : strs) {
            char[] temp = s.toCharArray();
            Arrays.sort(temp);

            String key = new String(temp);
            if (!result.containsKey(key)) {
                result.put(key, new ArrayList<>());
            }
            result.get(key).add(s);
        }
        return new ArrayList(result.values());
    }


    @Test
    public void test() {
        String[] strs = {"eat", "tea", "tan", "nat", "ate", "bat"};
        groupAnagrams(strs);
        //Iterable<String> iterable = groupAnagrams(strs).iterator();

    }
}
