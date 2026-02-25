package Assignment.Ass1.Module1;
import java.util.Scanner;

public class Studentgrade {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the marks (0 to 100): ");
        int marks = sc.nextInt();

        int gradeGroup = marks / 10;   // used for switch

        switch (gradeGroup) {
            case 10:   // 100
            case 9:    // 90 - 99
                System.out.println("Grade: A");
                break;

            case 8:    // 80 - 89
                System.out.println("Grade: B");
                break;

            case 7:    // 70 - 79
                System.out.println("Grade: C");
                break;

            case 6:    // 60 - 69
                System.out.println("Grade: D");
                break;

            default:
                if (marks >= 0 && marks < 60)
                    System.out.println("Grade: F");
                else
                    System.out.println("Invalid marks");
        }

        sc.close();
    }
}
