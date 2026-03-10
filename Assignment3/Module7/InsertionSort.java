package Assignment.Assignment3.Module7;

public class InsertionSort {

    public static void insertionSort(int[] arr) {
        int n = arr.length;

        for (int i = 1; i < n; i++) {
            int key = arr[i];
            int j = i - 1;

            // Move elements greater than key
            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j--;
            }

            arr[j + 1] = key;
        }
    }

    public static void main(String[] args) {
        int[] arr = {8, 3, 5, 2, 9};

        insertionSort(arr);

        System.out.println("Sorted Array:");
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}

//Advantage for Nearly Sorted Arrays
//
//Insertion Sort is very efficient for nearly sorted arrays because:
//
//Only a few elements need shifting.
//
//The algorithm quickly finds the correct position.
//
//In the best case (already sorted array), it runs in O(n) time.