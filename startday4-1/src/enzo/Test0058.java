package enzo;

import org.testng.annotations.Test;

/**
 * Package: enzo
 * Description: 最后一个单词的长度
 *
 * @Author ENZO
 * @Create 7/4/2024 下午4:44
 */
public class Test0058 {
    public int lengthOfLastWord(String s) {
        int count = 0;
        char[] chars = s.toCharArray();
        for (int i = chars.length - 1; i > 0; i--) {
            if (chars[i] == ' ') {
                break;
            }
            count++;
        }

        return count;
    }
    
    @Test
    public void test(){
        String s = "  fly me to  the room ";
        System.out.println(lengthOfLastWord(s));
    }
}
