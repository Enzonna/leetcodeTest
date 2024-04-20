package homework1;

/**
 * Package: homework1
 * Description:
 *
 * @Author ENZO
 * @Create 2024年4月9日 19:10
 */
public class Test7 {
    public static void main(String[] args) {
        int[] front = new int[35];
        int[] after = new int[12];

        for (int i = 0; i < 5; i++) {
            int temp = (int) (Math.random() * 35);
            while (front[temp] == 1) {       //存在了
                temp = (int) (Math.random() * 35);
            }
            front[temp] = 1;
        }

        for (int i = 0; i < 2; i++) {
            int temp = (int) (Math.random() * 12);
            while (after[temp] == 1) {       //存在了
                temp = (int) (Math.random() * 12);
            }
            after[temp] = 1;
        }

        for (int i = 0; i < front.length; i++) {
            if (front[i] == 1) {
                System.out.println(i);
            }
        }
        for (int m : after) {
            System.out.print(m);
        }
    }
}
