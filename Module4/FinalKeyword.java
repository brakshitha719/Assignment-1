package Assignment.Ass2.Module4;
// Demonstration of final keyword with variable, method and class

    // final class
    final class Vehicle {

        // final variable
        final int maxSpeed = 120;

        // final method
        final void displaySpeed() {
            System.out.println("Maximum Speed : " + maxSpeed);
        }
    }

    // This class can use Vehicle, but cannot extend it
    public class FinalKeyword {

        public static void main(String[] args) {

            Vehicle v = new Vehicle();
            v.displaySpeed();

            // final variable cannot be changed
            // v.maxSpeed = 150;   // ❌ Compile-time error
        }
    }

/*
Important points:

1. final variable
   → Its value cannot be changed once assigned.

2. final method
   → It cannot be overridden in a subclass.

3. final class
   → It cannot be inherited.

Note:
class Car extends Vehicle { }   // ❌ Not allowed because Vehicle is final
*/

