package Assignment.Assignment3.Module6;

import java.util.*;

public class DifferenceArray {

    public static void main(String[] args) {
        int n = 5;
        int[] arr = {10, 20, 30, 40, 50};

        int[] diff = new int[n];

        // Construct difference array
        diff[0] = arr[0];
        for (int i = 1; i < n; i++) {
            diff[i] = arr[i] - arr[i - 1];
        }

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of updates: ");
        int q = sc.nextInt();

        while (q-- > 0) {
            System.out.print("Enter left index: ");
            int l = sc.nextInt();

            System.out.print("Enter right index: ");
            int r = sc.nextInt();

            System.out.print("Enter value to add: ");
            int val = sc.nextInt();

            diff[l] += val;
            if (r + 1 < n) {
                diff[r + 1] -= val;
            }
        }

        // Build final updated array
        int[] result = new int[n];
        result[0] = diff[0];

        for (int i = 1; i < n; i++) {
            result[i] = result[i - 1] + diff[i];
        }

        System.out.println("Updated Array:");
        for (int num : result) {
            System.out.print(num + " ");
        }

        sc.close();
    }
}
