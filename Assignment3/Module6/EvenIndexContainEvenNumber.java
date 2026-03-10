package Assignment.Assignment3.Module6;
import java.util.*;

public class EvenIndexContainEvenNumber {


    public static void rearrangeArray(int[] arr) {
        int n = arr.length;
        int i = 0; // even index pointer

        for (int j = 0; j < n; j++) {
            if (arr[j] % 2 == 0 && i < n) {
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                i += 2;
            }
        }
    }

    public static void main(String[] args) {
        int[] arr = {3, 6, 12, 1, 5, 8};

        rearrangeArray(arr);

        System.out.println("Rearranged Array:");
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}
