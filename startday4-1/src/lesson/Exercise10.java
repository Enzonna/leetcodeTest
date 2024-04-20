package lesson;

/**
 * Package: lesson
 * Description:
 *
 * @Author ENZO
 * @Create 2024年4月8日 19:31
 */
public class Exercise10 {
    public static void main(String[] args) {
        //(1)先确定行数
        int[][] yangHui = new int[10][];

        //(2)再确定每一行的列数
        //(3)再确定元素
        for (int i = 0; i < yangHui.length; i++) {
            // 第一行有 1 个元素, 第 n 行有 n 个元素
            yangHui[i] = new int[i + 1];

            //每一行的第一个和最后一个元素都是1
            yangHui[i][0] = 1;
            yangHui[i][i] = 1;

            //中间的元素
            for (int j = 1; j < yangHui[i].length - 1; j++) {
                yangHui[i][j] = yangHui[i - 1][j - 1] + yangHui[i - 1][j];
            }

        }

        //(4)打印显示
        for (int[] ints : yangHui) {
            for (int m : ints) {
                System.out.print(" " + m);
            }
            System.out.println();
        }
    }
}
