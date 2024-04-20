package homework1;

/**
 * Package: homework1
 * Description:
 *
 * @Author ENZO
 * @Create 2024Äê4ÔÂ9ÈÕ 18:54
 */
public class Test4 {
    public static void main(String[] args) {
        char[] chars = new char[64];
        for (int i = 0; i < 26; i++) {
            chars[i] = (char) ('a' + i);
            chars[26 + i] = (char) ('A' + i);
        }
        for (int i = 0; i < 10; i++) {
            chars[52 + i] = (char) ('0' + i);
        }

        int[] arr = new int[6];
        for (int i = 0; i < 6; i++) {
            int temp = (int) (Math.random() * 62);
            arr[i] = temp;
        }

        for (int m : arr){
            System.out.print(chars[m]);
        }

    }
}
