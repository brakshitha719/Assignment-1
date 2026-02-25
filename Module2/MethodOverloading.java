package Assignment.Ass1.Module2;

public class MethodOverloading {
    // Method with two integers
    static int add(int a, int b) {
        return a + b;
    }

    // Method with three integers
    static int add(int a, int b, int c) {
        return a + b + c;
    }

    // Method with two double values
    static double add(double a, double b) {
        return a + b;
    }

    public static void main(String[] args) {

        System.out.println("Sum of 10 and 20 = " + add(10, 20));
        System.out.println("Sum of 10, 20 and 30 = " + add(10, 20, 30));
        System.out.println("Sum of 5.5 and 4.5 = " + add(5.5, 4.5));
    }
}
