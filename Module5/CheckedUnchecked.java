package Assignment.Ass2.Module5;

import java.io.FileReader;
import java.io.IOException;

public class CheckedUnchecked {
    public static void main(String[] args) {

            // -------- Checked Exception Example --------
            try {
                // FileReader throws a checked exception (IOException)
                FileReader fr = new FileReader("sample.txt");
                fr.read();
                fr.close();
            } catch (IOException e) {
                System.out.println("Checked Exception caught: " + e);
            }


            // -------- Unchecked Exception Example --------
            try {
                // ArithmeticException is an unchecked exception
                int a = 10 / 0;
                System.out.println(a);
            } catch (ArithmeticException e) {
                System.out.println("Unchecked Exception caught: " + e);
            }
        }
    }
