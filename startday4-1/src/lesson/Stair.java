package lesson;

/**
 * Package: lesson
 * Description:
 *
 * @Author ENZO
 * @Create 2024��4��12�� 15:39
 */
public class Stair {

    public static void main(String[] args) {
        for (int i = 1; i <= 10; i++) {
            System.out.println("�ߵ���" + i + "��̨����" + step(i) + "���߷�");
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
