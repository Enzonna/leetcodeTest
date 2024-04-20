package homework1;

/**
 * Package: homework1
 * Description:
 *
 * @Author ENZO
 * @Create 2024年4月9日 18:42
 */
public class Test2 {
    public static void main(String[] args) {
        String[] hua = {"黑桃", "红桃", "梅花", "方片"};
        String[] dian = {"A", "2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K"};
        String[] pu = new String[hua.length * dian.length + 2];

        for (int i = 0; i < hua.length; i++) {
            for (int j = 0; j < dian.length; j++) {
                pu[i + 4 * j] = hua[i] + dian[j];
            }
        }
        pu[pu.length - 2] = "小王";
        pu[pu.length - 1] = "大王";

        for (String s : pu) {
            System.out.print(" " + s);
        }
    }
}
