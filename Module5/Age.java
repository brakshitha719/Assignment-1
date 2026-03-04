import java.util.Scanner;
        public static void main(String[] args) {

            Scanner sc = new Scanner(System.in);

            System.out.print("Enter your age: ");
            int age = sc.nextInt();

            try {
                if (age < 18) {
                    // throwing exception
                    throw new Exception("Age must be 18 or above.");
                }

                System.out.println("You are eligible.");

            } catch (Exception e) {
                System.out.println("Exception: " + e.getMessage());
            }

            sc.close();
        }

