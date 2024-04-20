package homework1;

/**
 * Package: homework1
 * Description:
 *
 * @Author ENZO
 * @Create 2024Äê4ÔÂ9ÈÕ 18:47
 */
public class Test3 {
    public static void main(String[] args) {
        char c = 'a';
        for (int i = 0; i < 26; i++) {
            System.out.print((char) (c + i) + " ");
            if ((i + 1) % 10 == 0) {
                System.out.println();
            }
        }
        System.out.println();
        int count = 0;
        for (int i = 25; i >= 0; i--) {
            System.out.print((char) (c + i) + " ");
            count++;
            if (count % 10 == 0) {
                System.out.println();
            }
        }


    }
}
