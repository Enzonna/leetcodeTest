package lesson;

import java.sql.Connection;
import java.util.*;

/**
 * Package: lesson
 * Description:
 *
 * @Author ENZO
 * @Create 2024Äê4ÔÂ19ÈÕ 10:21
 */
public class Test3 {
    public static void main(String[] args) {
        List<String> strings = new ArrayList<>();
        strings.add("a");
        strings.add("b");
        strings.add("a");
        int a = Collections.binarySearch(strings,"a");
        System.out.println(a);
    }
}
