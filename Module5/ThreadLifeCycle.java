package Assignment.Ass2.Module5;


    // Java program to demonstrate Thread life-cycle states

    class ThreadLifeCycle extends Thread {

        public void run() {
            try {
                // TIMED_WAITING state
                Thread.sleep(1000);
                System.out.println("Inside run() - State: " + Thread.currentThread().getState());
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        public static void main(String[] args) throws Exception {

            ThreadLifeCycle t = new ThreadLifeCycle();

            // NEW state
            System.out.println("After creating thread - State: " + t.getState());

            // RUNNABLE state
            t.start();
            System.out.println("After calling start() - State: " + t.getState());

            // Give a small delay so that thread enters sleep
            Thread.sleep(200);
            System.out.println("While thread is sleeping - State: " + t.getState());

            // Wait for thread to finish
            t.join();

            // TERMINATED state
            System.out.println("After thread completed - State: " + t.getState());
        }
    }

