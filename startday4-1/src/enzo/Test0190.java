package enzo;

/**
 * ClassName: Test0190
 * Package: enzo
 * Description:
 *
 * @Author ENZO
 * @Create 2024/4/1 19:17
 * @Version 1.0
 */
public class Test0190 {
    public class Solution {
        public int reverseBits(int n) {
            int rev = 0;
            for (int i = 0; i < 32 && n != 0; ++i) {
                rev |= (n & 1) << (31 - i);
                n >>>= 1;
            }
            return rev;
        }
    }
}

