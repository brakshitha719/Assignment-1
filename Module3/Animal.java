package Assignment.Ass1.Module3;

 public class Animal {

    void eat() {
        System.out.println("Animal is eating");
    }
}

// Derived class (single inheritance)
class Dog extends Animal {

    void bark() {
        System.out.println("Dog is barking");
    }
}

// Main class
class SingleInheritanceDemo {

    public static void main(String[] args) {

        Dog d = new Dog();

        d.eat();   // inherited method from Animal
        d.bark();  // method of Dog
    }
}
