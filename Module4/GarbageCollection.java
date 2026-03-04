package Assignment.Ass2.Module4;
        // This method is called before an object is garbage collected
        public class GarbageCollection {

            public static void main(String[] args) {

                GarbageCollection obj1 = new GarbageCollection();
                GarbageCollection obj2 = new GarbageCollection();

                // Make objects eligible for GC
                obj1 = null;
                obj2 = null;

                // Request garbage collection
                System.gc();

                System.out.println("Garbage collection requested.");
            }
        }