package homework1;

/**
 * Package: homework1
 * Description:
 *
 * @Author ENZO
 * @Create 2024��4��9�� 18:59
 */
public class Test5 {

    public static void main(String[] args) {

        int[] arr = {1, 2, 3, 4, 4, 2, 1};
        int left = 0;
        int right = arr.length - 1;
        boolean flag = true;

        while (left < right){
            if (arr[left] == arr[right]){
                left++;
                right--;
            }else {
                flag = false;
                break;
            }
        }

        if (flag){
            System.out.println("�ǶԳ�");
        }else{
            System.out.println("���ǶԳ�");
        }


    }
}
