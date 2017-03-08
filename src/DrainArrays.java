import java.util.Arrays;
/**
 * Created by volfovskaya on 08.03.17.
 */
public class DrainArrays {
    /*
    public static void bubbleSort(int[] arr) {
        for (int a = arr.length - 1; a >= 0; a--) {
            for (int j = 0; j < a; j++) {
                if (arr[j] > arr[j + 1]) {
                    int t = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = t;
                }
            }
        }
    }*/


    public static int[] mergeArrays(int[] a1, int[] a2) {
        /* sumArrays
        int[] a3 = new int[a1.length + a2.length];
        int lengthA1 = a1.length;
        int lengthA2 = a2.length;
        int lengthA3 = a3.length;
        for (int i = 0; i <= (lengthA1 - 1); i++) {
            a3[i] = a1[i];
        }
        for (int i = lengthA1; i <= (lengthA3 - 1); i++) {
            a3[i] = a2[i - lengthA1];
        }

        System.out.println(Arrays.toString(a3));*/

        int[] Arr = new int[a1.length + a2.length];
        int[] minArr;
        int[] maxArr;
        if (a1.length == 0 && a2.length == 0){
            return Arr;
        }
        if (a1.length == 0 && a2.length > 0) {
            Arr = a2;
            return Arr;
        }
        if (a1.length > 0 && a2.length == 0) {
            Arr = a1;
            return Arr;
        }

        if (a1[a1.length-1] <= a2[a2.length-1]) {
            minArr = a1;
            maxArr = a2;
        }
        else {
            minArr = a2;
            maxArr = a1;
        }
        int i = 0;
        int j = 0;
        if (a1.length > 0 || a2.length > 0) {
            while (i + j < Arr.length - 1) {
                if (i < minArr.length && minArr[i] < maxArr[j]) {
                    Arr[i+j] = minArr[i];
                    i++;
                }
                else {
                    Arr[i+j] = maxArr[j];
                    j++;
                }
            }
            Arr[Arr.length - 1] = maxArr[maxArr.length - 1];
        }
        return Arr;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(mergeArrays(new int[]{0, 2, 2}, new int[]{1, 3})));
        System.out.println(Arrays.toString(mergeArrays(new int[]{0, 5, 6}, new int[]{})));
        System.out.println(Arrays.toString(mergeArrays(new int[]{0, 2, 100}, new int[]{1, 3, 10, 20, 100})));

    }

}
