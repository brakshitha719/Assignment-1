package Assignment.Ass2.Module5;
    // Demonstration of synchronization using two threads
// accessing a shared counter

    class Counter {

        private int count = 0;

        // synchronized method
        synchronized void increment() {
            count++;
        }

        int getCount() {
            return count;
        }
    }

    class MyThread1 extends Thread {

        Counter counter;

        MyThread1(Counter counter) {
            this.counter = counter;
        }

        public void run() {
            // each thread increments the counter 1000 times
            for (int i = 0; i < 1000; i++) {
                counter.increment();
            }
        }
    }

    public class Synchronization {

        public static void main(String[] args) throws InterruptedException {

            Counter c = new Counter();

            MyThread1 t1 = new MyThread1(c);
            MyThread1 t2 = new MyThread1(c);

            t1.start();
            t2.start();

            // wait for both threads to finish
            t1.join();
            t2.join();

            System.out.println("Final counter value: " + c.getCount());
        }
    }
