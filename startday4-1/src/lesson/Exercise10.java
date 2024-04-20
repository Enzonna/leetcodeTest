package lesson;

/**
 * Package: lesson
 * Description:
 *
 * @Author ENZO
 * @Create 2024��4��8�� 19:31
 */
public class Exercise10 {
    public static void main(String[] args) {
        //(1)��ȷ������
        int[][] yangHui = new int[10][];

        //(2)��ȷ��ÿһ�е�����
        //(3)��ȷ��Ԫ��
        for (int i = 0; i < yangHui.length; i++) {
            // ��һ���� 1 ��Ԫ��, �� n ���� n ��Ԫ��
            yangHui[i] = new int[i + 1];

            //ÿһ�еĵ�һ�������һ��Ԫ�ض���1
            yangHui[i][0] = 1;
            yangHui[i][i] = 1;

            //�м��Ԫ��
            for (int j = 1; j < yangHui[i].length - 1; j++) {
                yangHui[i][j] = yangHui[i - 1][j - 1] + yangHui[i - 1][j];
            }

        }

        //(4)��ӡ��ʾ
        for (int[] ints : yangHui) {
            for (int m : ints) {
                System.out.print(" " + m);
            }
            System.out.println();
        }
    }
}
