/**
 * Created by afabiani on 3/23/2016.
 */

class MyThread3 extends Thread {

    // construct a new thread
    MyThread3(String name) {
        super(name); // name thread
        start();
    }

    public void run() {
        System.out.println(getName() + " starting.");
        try {
            for(int count = 0; count < 10; count++){
                Thread.sleep(400);
                System.out.println("In " + getName() + ", count is " + count);
            }
        }
        catch (InterruptedException exc) {
            System.out.println(getName() + " interrupted");
        }
        System.out.println(getName() + " terminating");
    }
}

public class ExtendThread {
    public static void main(String args[]) {
        System.out.println("Main thread starting");

        MyThread3 mt = new MyThread3("Child #1");

        for(int i = 0; i < 50; i++) {
            System.out.print(".");
            try {
                Thread.sleep(100);
            }
            catch (InterruptedException exc) {
                System.out.println("Main thread interrupted");
            }
            System.out.println("Main thread ending");
        }
    }
}


