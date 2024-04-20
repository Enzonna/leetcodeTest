package enzo;

import org.testng.annotations.Test;

/**
 * Package: enzo
 * Description: Z字形变换
 *
 * @Author ENZO
 * @Create 2024年4月12日 11:15
 */
public class Test0006 {
    //numRows是行数
    public String convert(String s, int numRows) {
        if (s.length() == 0 || numRows == 1) {
            return s;
        }

        int length = s.length();
        int t = 2 * numRows - 2;        //周期值
        int c = (length + t - 1) / t * (numRows - 1);

        char[][] arr = new char[numRows][c];

        for (int i = 0, x = 0, y = 0; i < s.length(); i++) {
            arr[x][y] = s.charAt(i);
            if (i % t < numRows - 1) {
                x++;        //向下移动
            } else {
                x--;        //向右上移动
                y++;
            }
        }

        StringBuilder result = new StringBuilder();
        for (char[] c1 : arr) {
            for (char c2 : c1) {
                if (Character.isLetter(c2)) {
                    result.append(c2);
                }
            }
        }
        return result.toString();
    }
    
    
    @Test
    public void test(){
        String s = "PAYPALISHIRING";
        String newString =  convert(s,3);
        System.out.println(newString);
    }
}
