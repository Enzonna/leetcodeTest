package homework2;

/**
 * Package: homework2
 * Description:
 *
 * @Author ENZO
 * @Create 2024Äê4ÔÂ9ÈÕ 20:52
 */
public class Test6 {
    public static boolean isBalance(int[] arr) {
        int index = 0;
        while (index < arr.length) {
            int lSum = 0, rSum = 0;
            for (int i = 0; i < index; i++) {
                lSum += arr[i];
            }
            for (int i = arr.length - 1; i > index; i--) {
                rSum += arr[i];
            }
            if (lSum == rSum) {
                return true;
            }
            index++;
        }
        return false;
    }


    public static void main(String[] args) {
        int[] arr1 = {1,2,5,3,2,4,2};
        int[] arr2 = {9, 6, 8, 8, 7, 6, 9, 5, 2, 5};
        System.out.println(isBalance(arr1));
        System.out.println(isBalance(arr2));

    }
}
