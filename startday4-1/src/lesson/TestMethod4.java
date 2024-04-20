package lesson;

import org.testng.annotations.Test;

import java.util.Arrays;

public class TestMethod4 {
    public static void iterateElement(int[] a) {
        for (int i = 0; i < a.length; i++) {
            a[i] = (int) (Math.random() * 100);
            System.out.print(a[i] + " ");
        }
        System.out.println();
    }

    public static int[] smallToBigSort(int[] a) {
        for (int i = 0; i < a.length - 1; i++) {
            for (int j = 0; j < a.length - 1 - i; j++) {
                if (a[j] > a[j + 1]) {
                    int temp = a[j];
                    a[j] = a[j + 1];
                    a[j + 1] = temp;
                }
            }
        }
        return a;
    }

    public static int[] reverse(int[] a) {
        int[] b = Arrays.copyOf(a,a.length);
        int j = b.length - 1;
        for (int i = 0; i < j; i++, j--) {
            int temp = b[i];
            b[i] = b[j];
            b[j] = temp;
        }
        arrayOut(b);
        return a;
    }

    public static int[] arrayOut(int a[]) {
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + "\t");
        }
        System.out.println();
        return a;
    }

    public static void main(String[] args) {
        int[] numbs = new int[10];
        int[] arr = {2, 6, 1, 7, 0, 1};
        reverse(arr);
        System.out.println("--------------------");
        iterateElement(numbs);
        int a1[] = smallToBigSort(numbs);
        arrayOut(a1);
        arrayOut(numbs);
        int a2[] = reverse(numbs);
        arrayOut(a2);

    }

    @Test
    public void test() {
        int[] arr = {2, 6, 1, 7, 0, 1};
        reverse(arr);
        for (int i : arr) {
            System.out.print(i);
        }
    }
}
