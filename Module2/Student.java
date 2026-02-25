package Assignment.Ass1.Module2;

public class Student {

    int id;
    String name;

    // Default constructor
    Student() {
        id = 0;
        name = "Not Assigned";
    }

    // Parameterized constructor
    Student(int i, String n) {
        id = i;
        name = n;
    }

    // Method to display student details
    void display() {
        System.out.println("ID: " + id + ", Name: " + name);
    }

    public static void main(String[] args) {

        // Object created using default constructor
        Student s1 = new Student();

        // Object created using parameterized constructor
        Student s2 = new Student(101, "Rahul");

        s1.display();
        s2.display();
    }
}
