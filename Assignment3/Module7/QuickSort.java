package Assignment.Assignment3.Module7;

public class QuickSort {

    // Partition function
    public static int partition(int[] arr, int low, int high) {
        int pivot = arr[high];   // choose last element as pivot
        int i = low - 1;

        for (int j = low; j < high; j++) {
            if (arr[j] < pivot) {
                i++;

                // swap arr[i] and arr[j]
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }

        // place pivot at correct position
        int temp = arr[i + 1];
        arr[i + 1] = arr[high];
        arr[high] = temp;

        return i + 1;
    }

    // Quick Sort function
    public static void quickSort(int[] arr, int low, int high) {
        if (low < high) {

            int pi = partition(arr, low, high);

            quickSort(arr, low, pi - 1);
            quickSort(arr, pi + 1, high);
        }
    }

    public static void main(String[] args) {

        int[] arr = {10, 7, 8, 9, 1, 5};

        quickSort(arr, 0, arr.length - 1);

        System.out.println("Sorted Array:");
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}

//Pivot Partition Logic
//
//Choose a pivot element (here we take the last element).
//
//Rearrange the array so that:
//
//Elements smaller than pivot go to the left side.
//
//Elements greater than pivot go to the right side.
//
//Place the pivot in its correct sorted position.
//
//Recursively apply Quick Sort to the left and right subarrays.