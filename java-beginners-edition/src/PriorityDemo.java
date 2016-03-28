/**
 * Created by afabiani on 3/28/2016.
 */

class Priority implements Runnable {
    int count;
    Thread thrd;
    static boolean stop = false;
    static String currentName;

    /* Construct a new thread. Notice this constructor
    does not actually start the threads running.
     */

    Priority(String name) {
        thrd = new Thread(this, name);
        count = 0;
        currentName = name;
    }

    //Begin execution of new thread
    public void run() {
        System.out.println(thrd.getName() + " starting");
        do {
            count++;
            if(currentName.compareTo(thrd.getName()) != 0) {
                currentName = thrd.getName();
                System.out.println("In " + currentName);
            }
        } while(stop == false && count < 10000000);
        stop = true;

        System.out.println("\n" + thrd.getName() + " terminating.");
    }
}
public class PriorityDemo {
    public static void main(String args[]) {
        Priority mt1 = new Priority("High Priority Thread");
        Priority mt2 = new Priority("Low Priority Thread");

        // set prio
        mt1.thrd.setPriority(Thread.NORM_PRIORITY + 2);
        mt2.thrd.setPriority(Thread.NORM_PRIORITY - 2);

        // Start threads
        mt1.thrd.start();
        mt2.thrd.start();

        try {
            mt1.thrd.join();
            mt2.thrd.join();
        }
        catch(InterruptedException exc) {
            System.out.println("Main thread interrupted");
        }
        System.out.println("\nHigh Priority thread counted to " + mt1.count);
        System.out.println("\nLow Priority thread counted to " + mt2.count);
    }
}
