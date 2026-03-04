package Assignment.Ass2.Module5;


    // Java program to demonstrate Deadlock

    class Deadlock {

        // Two shared resources
        static final Object lock1 = new Object();
        static final Object lock2 = new Object();

        public static void main(String[] args) {

            // First thread
            Thread t1 = new Thread(() -> {
                synchronized (lock1) {
                    System.out.println("Thread 1: Holding lock1...");

                    try { Thread.sleep(100); } catch (InterruptedException e) { }

                    System.out.println("Thread 1: Waiting for lock2...");
                    synchronized (lock2) {
                        System.out.println("Thread 1: Acquired lock2");
                    }
                }
            });

            // Second thread
            Thread t2 = new Thread(() -> {
                synchronized (lock2) {
                    System.out.println("Thread 2: Holding lock2...");

                    try { Thread.sleep(100); } catch (InterruptedException e) { }

                    System.out.println("Thread 2: Waiting for lock1...");
                    synchronized (lock1) {
                        System.out.println("Thread 2: Acquired lock1");
                    }
                }
            });

            t1.start();
            t2.start();
        }
    }

