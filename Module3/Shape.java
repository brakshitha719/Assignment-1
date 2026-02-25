package Assignment.Ass1.Module3;

public class Shape {

    void draw() {
        System.out.println("Drawing a shape");
    }
}

// Derived class 1
class Circle extends Shape {

    @Override
    void draw() {
        System.out.println("Drawing a circle");
    }
}

// Derived class 2
class Rectangle extends Shape {

    @Override
    void draw() {
        System.out.println("Drawing a rectangle");
    }
}

// Main class
class PolymorphismDemo {

    public static void main(String[] args) {

        // Polymorphism: base class reference
        Shape s1 = new Circle();
        Shape s2 = new Rectangle();

        s1.draw();   // calls Circle's draw()
        s2.draw();   // calls Rectangle's draw()
    }
}
