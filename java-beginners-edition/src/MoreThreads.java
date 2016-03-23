/**
 * Created by afabiani on 3/23/2016.
 */

class MyThread4 implements  Runnable {
    Thread thrd;

    // Construct new thread
    MyThread4(String name) {
        thrd = new Thread(this, name);

        thrd.start();
    }

    // Begin execution
    public void run() {
        System.out.println(thrd.getName() + " starting up.");

        try {
            for(int count = 0; count < 50; count++) {
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

public class MoreThreads {
    public static void main(String args[]) {
        System.out.println("Main thread starting.");

        MyThread4 thread1 = new MyThread4("Child #1");
        MyThread4 thread2 = new MyThread4("Child #2");
        MyThread4 thread3 = new MyThread4("Child #3");
        MyThread4 thread4 = new MyThread4("Child #4");

        do {
            System.out.print(".");

            try {
                Thread.sleep(100);
            }
            catch(InterruptedException exc) {
                System.out.println("Main thread interrupted");
            }
        } while( thread1.thrd.isAlive() || thread2.thrd.isAlive() || thread3.thrd.isAlive() || thread4.thrd.isAlive());

        System.out.println("Main thread exiting");
    }
}
