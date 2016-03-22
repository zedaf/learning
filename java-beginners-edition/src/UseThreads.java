/**
 * Created by afabiani on 3/22/2016.
 *
 * Create a thread by implenting Runnable
 *
 */

class MyThread2 implements Runnable {
    String threadName;

    MyThread2(String name) {
        threadName = name;
    }

    //Entry point of thread
    public void run() {
        System.out.println(threadName + " starting.");
        try {
            for(int count = 0; count < 10; count++) {
                Thread.sleep(400);
                System.out.println("In " + threadName + ", count is " + count);
            }
        }
        catch (InterruptedException exc) {
            System.out.println(threadName + " interrupted.");
        }
        System.out.println(threadName + " terminating.");
    }
}

public class UseThreads {
    public static void main(String args[]) {
        System.out.println("Main thread starting.");

        //First, construct a MyThread object
        MyThread2 mt = new MyThread2("Child #1");  // <-- a new Runnable object
        Thread newThread = new Thread(mt); // <--- Construct a thread on that object
        newThread.start(); // <---- Start running that thread

        for(int i = 0; i < 50; i++) {
            System.out.print(".");
            try {
                Thread.sleep(100);
            }
            catch(InterruptedException exc) {
                System.out.println("Main thread interrupted.");
            }
        }

        System.out.println("Main thread exiting");
    }
}
