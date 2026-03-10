package Assignment.Assignment3.Module6;
import java.util.*;

public class NegativePositivePartition {

    public static void partitionArray(int[] arr) {
        int left = 0;
        int right = arr.length - 1;

        while (left <= right) {
            if (arr[left] < 0) {
                left++;
            }
            else if (arr[right] >= 0) {
                right--;
            }
            else {
                // swap
                int temp = arr[left];
                arr[left] = arr[right];
                arr[right] = temp;

                left++;
                right--;
            }
        }
    }

    public static void main(String[] args) {
        int[] arr = {12, -7, -5, 3, -1, 8, -2};

        partitionArray(arr);

        System.out.println("Array after partition:");
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}
