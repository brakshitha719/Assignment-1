package Assignment.Assignment3.Module7;

public class BinarySearch {

    // Iterative Binary Search
    public static int binarySearchIterative(int[] arr, int target) {
        int left = 0;
        int right = arr.length - 1;

        while (left <= right) {
            int mid = (left + right) / 2;

            if (arr[mid] == target)
                return mid;
            else if (arr[mid] < target)
                left = mid + 1;
            else
                right = mid - 1;
        }

        return -1;
    }

    // Recursive Binary Search
    public static int binarySearchRecursive(int[] arr, int left, int right, int target) {
        if (left <= right) {
            int mid = (left + right) / 2;

            if (arr[mid] == target)
                return mid;
            else if (arr[mid] > target)
                return binarySearchRecursive(arr, left, mid - 1, target);
            else
                return binarySearchRecursive(arr, mid + 1, right, target);
        }

        return -1;
    }

    public static void main(String[] args) {
        int[] arr = {2, 4, 6, 8, 10, 12};
        int target = 8;

        // Iterative search
        int result1 = binarySearchIterative(arr, target);

        // Recursive search
        int result2 = binarySearchRecursive(arr, 0, arr.length - 1, target);

        System.out.println("Iterative Binary Search Index: " + result1);
        System.out.println("Recursive Binary Search Index: " + result2);
    }
}