package Assignment.Ass1.Module1;

public class Whileloop {
    public static void main(String[] args) {

        int i = 2;      // first even number
        int sum = 0;

        while (i <= 100) {
            sum = sum + i;
            i = i + 2;   // move to next even number
        }

        System.out.println("Sum of even numbers between 1 and 100 is: " + sum);
    }
}
