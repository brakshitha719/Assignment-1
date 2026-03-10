package Assignment.Assignment3.Module6;
import java.util.*;

public class PairsWithSum {

    public static void findPairs(int[] arr, int target) {
        HashSet<Integer> set = new HashSet<>();

        for (int num : arr) {
            int complement = target - num;

            if (set.contains(complement)) {
                System.out.println("(" + complement + ", " + num + ")");
            }

            set.add(num);
        }
    }

    public static void main(String[] args) {
        int[] arr = {2, 4, 3, 5, 7, 8, 9};
        int target = 7;

        System.out.println("Pairs with sum " + target + ":");
        findPairs(arr, target);
    }
}