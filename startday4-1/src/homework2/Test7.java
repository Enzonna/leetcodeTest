package homework2;

/**
 * Package: homework2
 * Description:
 *
 * @Author ENZO
 * @Create 2024年4月9日 21:17
 */
public class Test7 {
    /**
     * 不考虑顺序吗？？稳定性
     * @param arr
     * @return
     */
    public static int[] myFun(int[] arr) {
        int left = 0, right = arr.length - 1;
        while (left < right) {
            while (arr[left] % 2 != 0) {
                left++;
            }
            while (arr[right] % 2 == 0) {
                right--;
            }
            if (left < right) {
                int temp = arr[left];
                arr[left] = arr[right];
                arr[right] = temp;
            }
        }
        return arr;
    }


    public static void main(String[] args) {
        int[] arr = {26, 67, 49, 38, 52, 66, 7, 71, 56, 87};
        int[] arrNew = myFun(arr);
        for (int m : arrNew) {
            System.out.print(" " + m);
        }

    }
}
