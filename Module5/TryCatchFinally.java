package Assignment.Ass2.Module5;

import java.util.Scanner;

public class TryCatchFinally {
        public static void main(String[] args) {

            Scanner sc = new Scanner(System.in);

            try {
                System.out.print("Enter first number: ");
                int a = sc.nextInt();

                System.out.print("Enter second number: ");
                int b = sc.nextInt();

                int result = a / b;   // may cause ArithmeticException

                System.out.println("Result: " + result);

            } catch (ArithmeticException e) {
                System.out.println("Error: Division by zero is not allowed.");

            } finally {
                System.out.println("Program execution completed.");
                sc.close();
            }
        }
    }
