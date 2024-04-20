package lesson;

public class ForExerise2 {
    //所谓水仙花数是指一个3位数，其各个位上数字立方和等于其本身。
    // 例如： 153 = 1\*1\*1 + 5\*5\*5 + 3\*3\*3，找出所有的水仙花数，并统计他们有几个。
    public static void main(String[] args) {
        System.out.println("水仙花数有：");
        int mun = 0;
        for (int i = 100; i < 1000; i++) {
            int bai = i / 100;
            int shi = i / 10 % 10;
            int ge = i % 10;
            if ((bai * bai * bai + shi * shi * shi + ge * ge * ge) == i) {
                System.out.println(i);
                //mun++;
            }
        }
        //System.out.println("一共有 " + mun);
        System.out.println("==============");
        //mun=0
        int j = 100;
        while (j < 1000) {
            int bai = j / 100;
            int shi = j / 10 % 10;
            int ge = j % 10;
            if ((bai * bai * bai + shi * shi * shi + ge * ge * ge) == j) {
                System.out.println(j);
            }
            j++;
            mun++;
        }
        //System.out.println("一共有 " + mun);
        System.out.println("=============");
        //mun=0
        int k = 0;
        do {
            int bai = j / 100;
            int shi = j / 10 % 10;
            int ge = j % 10;
            if ((bai * bai * bai + shi * shi * shi + ge * ge * ge) == k) {
                System.out.print(k);
            }
            k++;
            mun++;
        } while (k < 1000);
        System.out.println("一共有" + mun);
    }
}
