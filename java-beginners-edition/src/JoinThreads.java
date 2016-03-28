/**
 * Created by afabiani on 3/28/2016.
 */

class MyThread5 implements  Runnable {
    Thread thrd;

    // Construct new thread
    MyThread5(String name) {
        thrd = new Thread(this, name);

        thrd.start();
    }

    // Begin execution
    public void run() {
        System.out.println(thrd.getName() + " starting up.");

        try {
            for(int count = 0; count < 30; count++) {
                Thread.sleep(400);
                System.out.println("In " + thrd.getName() + ", count is " + count);
            }
        }
        catch (InterruptedException exc) {
            System.out.println(thrd.getName() + " interrupted.");
        }
        System.out.println(thrd.getName() + " terminating.");
    }
}

public class JoinThreads {
    public static void main(String args[]) {
        System.out.println("Main thread starting.");

        MyThread5 mt1 = new MyThread5("Child #1");
        MyThread5 mt2 = new MyThread5("Child #2");
        MyThread5 mt3 = new MyThread5("Child #3");

        try {
            mt1.thrd.join();
            System.out.println(mt1.thrd.getName() + " joined");
            mt2.thrd.join();
            System.out.println(mt2.thrd.getName() + " joined");
            mt3.thrd.join();
            System.out.println(mt3.thrd.getName() + " joined");
        }
        catch(InterruptedException exc) {
            System.out.println("Main thread interrupted");
        }
        System.out.println("Main thread exiting");
    }
}
