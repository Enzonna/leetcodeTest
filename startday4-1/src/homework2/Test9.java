package homework2;

/**
 * Package: homework2
 * Description:
 *
 * @Author ENZO
 * @Create 2024Äê4ÔÂ10ÈÕ 09:46
 */
public class Test9 {
    public static void main(String[] args) {
        int[] arr = new int[10];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int) (Math.random() * 100);
        }

        Util.myArraySort(arr);

        int sum = arr[1] - arr[0];
        for (int i = 1; i < arr.length - 1; i++) {
            int m = arr[i + 1] - arr[i];
            sum = Math.max(sum, m);
        }
        System.out.println(sum);

    }
}
