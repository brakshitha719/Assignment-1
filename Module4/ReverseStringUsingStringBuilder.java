package Assignment.Ass2.Module4;
import java.util.Scanner;

    public class ReverseStringUsingStringBuilder {

        public static void main(String[] args) {

            Scanner sc = new Scanner(System.in);

            System.out.print("Enter a string: ");
            String input = sc.nextLine();

            // Using StringBuilder to reverse the string
            StringBuilder sb = new StringBuilder(input);
            sb.reverse();

            System.out.println("Reversed string: " + sb.toString());

            sc.close();
        }
    }
