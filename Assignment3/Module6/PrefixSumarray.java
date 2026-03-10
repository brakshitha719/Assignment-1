package Assignment.Assignment3.Module6;

import java.util.*;

public class PrefixSumarray {

    public static void main(String[] args) {
        int[] arr = {2, 4, 6, 8, 10};
        int n = arr.length;

        // Construct prefix sum array
        int[] prefix = new int[n];
        prefix[0] = arr[0];

        for (int i = 1; i < n; i++) {
            prefix[i] = prefix[i - 1] + arr[i];
        }

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of queries: ");
        int q = sc.nextInt();

        while (q-- > 0) {
            System.out.print("Enter left index: ");
            int l = sc.nextInt();

            System.out.print("Enter right index: ");
            int r = sc.nextInt();

            int sum;
            if (l == 0) {
                sum = prefix[r];
            } else {
                sum = prefix[r] - prefix[l - 1];
            }

            System.out.println("Range Sum = " + sum);
        }

        sc.close();
    }
}
