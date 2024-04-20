package homework2;

import org.testng.annotations.Test;

/**
 * Package: homework2
 * Description:
 *
 * @Author ENZO
 * @Create 2024Äê4ÔÂ9ÈÕ 19:45
 */
public class Util {
    public static void myArrayPrint(int[] arr) {
        for (int m : arr) {
            System.out.print(" " + m);
        }
    }

    public static void myArraySort(int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            for (int j = 0; j < arr.length - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }

    public static int myArraySearch(int[] arr, int target) {
        int left = 0, right = arr.length - 1;
        while (left <= right) {
            int mid = (left + right) / 2;
            if (arr[mid] == target) {
                return 1;
            } else if (target < arr[mid]) {
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }
        return 0;
    }


    @Test
    public void test(){
        int[] arr = {1,3,4,5,6,8,11};
        System.out.println(myArraySearch(arr,99));
    }
}
