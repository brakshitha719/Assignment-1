package Assignment.Ass2.Module4;
    // Demonstration of static variables and static methods

    class Student {

        // static variable (shared by all objects)
        static String college = "Vishveswaraya Institute";

        String name;

        Student(String name) {
            this.name = name;
        }

        // static method
        static void changeCollege() {
            college = "Sapthagiri University";
        }

        void display() {
            System.out.println("Name    : " + name);
            System.out.println("College : " + college);
        }
    }

    public class Static {

        public static void main(String[] args) {

            Student s1 = new Student("Rakshitha");
            Student s2 = new Student("Anu");

            // calling static method using class name
            Student.changeCollege();

            s1.display();
            System.out.println();

            s2.display();
        }
    }
