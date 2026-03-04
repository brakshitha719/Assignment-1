package Assignment.Ass2.Module4;

    public class StringComparison {

        public static void main(String[] args) {

            // 1. String (Immutable)
            String s1 = "Hello";
            s1.concat(" World");   // This creates a new object, but s1 is not changed
            System.out.println("String value: " + s1);

            // 2. StringBuilder (Mutable, not thread-safe)
            StringBuilder sb = new StringBuilder("Hello");
            sb.append(" World");   // Modifies the same object
            System.out.println("StringBuilder value: " + sb);

            // 3. StringBuffer (Mutable, thread-safe)
            StringBuffer sf = new StringBuffer("Hello");
            sf.append(" World");   // Modifies the same object
            System.out.println("StringBuffer value: " + sf);

            // Demonstrating object references
            String a = "Java";
            String b = a.concat(" Programming");
            System.out.println("\nString a: " + a);
            System.out.println("New String b: " + b);

            StringBuilder sb1 = new StringBuilder("Java");
            sb1.append(" Programming");
            System.out.println("StringBuilder sb1: " + sb1);

            StringBuffer sf1 = new StringBuffer("Java");
            sf1.append(" Programming");
            System.out.println("StringBuffer sf1: " + sf1);
        }
    }
