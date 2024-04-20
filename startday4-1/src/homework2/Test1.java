package homework2;



/**
 * Package: homework2
 * Description:
 *
 * @Author ENZO
 * @Create 2024Äê4ÔÂ9ÈÕ 19:41
 */
public class Test1 {
    public static void main(String[] args) {
        int[] arr = new int[10];
        for (int i = 0; i < 10; i++) {
            arr[i] = (int) (Math.random() * 50) * 2;
        }
        Util.myArraySort(arr);
        Util.myArrayPrint(arr);
    }
}
