package Assignment.Assignment3.Module6;
public class BoyerMoore {

    public static int findMajority(int[] arr) {
        int candidate = 0;
        int count = 0;

        // Step 1: Find candidate
        for (int num : arr) {
            if (count == 0) {
                candidate = num;
            }

            if (num == candidate) {
                count++;
            } else {
                count--;
            }
        }

        // Step 2: Verify candidate
        count = 0;
        for (int num : arr) {
            if (num == candidate) {
                count++;
            }
        }

        if (count > arr.length / 2) {
            return candidate;
        }

        return -1; // No majority element
    }

    public static void main(String[] args) {
        int[] arr = {2, 2, 1, 1, 2, 2, 2};

        int result = findMajority(arr);

        if (result != -1) {
            System.out.println("Majority Element: " + result);
        } else {
            System.out.println("No Majority Element");
        }
    }
}
