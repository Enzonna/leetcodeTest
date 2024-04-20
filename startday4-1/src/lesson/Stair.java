package lesson;

/**
 * Package: lesson
 * Description:
 *
 * @Author ENZO
 * @Create 2024年4月12日 15:39
 */
public class Stair {

    public static void main(String[] args) {
        for (int i = 1; i <= 10; i++) {
            System.out.println("走到第" + i + "级台阶有" + step(i) + "种走法");
        }
        System.out.println();
    }

    public static int step(int n) {
        if (n < 1) {
            return 0;
        }
        if (n == 1 || n == 2) {
            return n;
        }
        return step(n - 1) + step(n - 2);

    }
}
