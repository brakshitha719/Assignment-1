package Assignment.Ass2.Module5;

    // Custom Exception class
    class InvalidAgeException extends Exception {

        public InvalidAgeException(String message) {
            super(message);
        }
    }

    public class CustomException {

        // Method using throws
        static void checkAge(int age) throws InvalidAgeException {

            if (age < 18) {
                // using throw
                throw new InvalidAgeException("Age must be 18 or above.");
            } else {
                System.out.println("You are eligible.");
            }
        }

        public static void main(String[] args) {

            try {
                checkAge(16);   // change value to test
            } catch (InvalidAgeException e) {
                System.out.println("Exception caught: " + e.getMessage());
            }
        }
    }

