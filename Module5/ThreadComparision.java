package Assignment.Ass2.Module5;
    // Creating a thread using Thread class
    class MyThread extends Thread {

        @Override
        public void run() {
            System.out.println("Thread created using Thread class");
        }
    }

    // Creating a thread using Runnable interface
    class MyRunnable implements Runnable {

        @Override
        public void run() {
            System.out.println("Thread created using Runnable interface");
        }
    }

    public class ThreadComparision {

        public static void main(String[] args) {

            // Using Thread class
            MyThread t1 = new MyThread();
            t1.start();

            // Using Runnable interface
            MyRunnable r = new MyRunnable();
            Thread t2 = new Thread(r);
            t2.start();
        }
    }

