package Assignment.Ass1.Module3;
// Demonstrates both Method Overloading and Method Overriding
// ---------- Method Overriding example ----------
class Parent {
    void show() {
        System.out.println("This is show() method from Parent class");
    }
}

class Child extends Parent {

    // Overriding the show() method
    @Override
    void show() {
        System.out.println("This is show() method from Child class");
    }
}

// ---------- Method Overloading example ----------
class Calculator {

    // same method name, different parameters
    int add(int a, int b) {
        return a + b;
    }

    int add(int a, int b, int c) {
        return a + b + c;
    }
}

class OverloadingVsOverridingDemo {

    public static void main(String[] args) {

        // Method Overloading
        Calculator calc = new Calculator();
        System.out.println("Addition of 2 numbers: " + calc.add(10, 20));
        System.out.println("Addition of 3 numbers: " + calc.add(10, 20, 30));

        // Method Overriding
        Parent obj = new Child();   // parent reference, child object
        obj.show();                // calls Child's show() method
    }
}
