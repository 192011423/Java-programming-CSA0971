import java.util.*;
public class shiftele {
    public static void duplicateZeros(int[] arr) {
        int len = arr.length;
        for (int i = 0; i < len; i++) {
            if (arr[i] == 0) {
                for (int j = len - 1; j > i; j--) {
                    arr[j] = arr[j - 1];
                }
                if (i + 1 < len) {
                    arr[i + 1] = 0;
                    i++;
                }
            }
        }
    }

    public static void main(String[] args) {
        int[] arr = {1, 0, 2, 3, 0, 4, 5, 0};
        duplicateZeros(arr);
        System.out.println(Arrays.toString(arr));
    }
}