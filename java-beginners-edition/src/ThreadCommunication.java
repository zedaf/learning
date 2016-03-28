/**
 * Created by afabiani on 3/28/2016.
 */

class TickTock {
    String state; // contains state of the clock

    synchronized void tick(boolean running) {
        if (!running) { // stop the clock
            state = "ticked";
            notify(); // notify any waiting threads
            return;
        }

        System.out.print("Tick ");
        state = "ticked"; // set the current state to ticked

        notify(); // let tock() run (tick() notifies tock())
        try {
            while (!state.equals("tocked"))
                wait(); // wait for tock() to complete
        } catch (InterruptedException exc) {
            System.out.println("Thread interrupted");
        }
    }

    synchronized  void tock(boolean running) {
        if(!running) { // stop the clock
            state = "tocked";
            notify();
            return;
        }
        System.out.println("Tock");
        state = "tocked";

        notify(); // let tick() run
        try {
            while(!state.equals("ticked"))
                wait(); // wait for tick to complete
        }
        catch (InterruptedException exc) {
            System.out.println("Thread interrupted");
        }
    }
}

class clockThread implements Runnable {
    Thread thrd;
    TickTock ttobj;

    clockThread(String name, TickTock tt) {
        thrd = new Thread(this, name);
        ttobj = tt;
        thrd.start();
    }

    public void run() {
        if(thrd.getName().compareTo("Tick") == 0) {
            for(int i=0; i<5; i++) ttobj.tick(true);
            ttobj.tick(false);
        }
        else {
            for(int i =0; i < 5; i++) ttobj.tock(true);
            ttobj.tock(false);
        }
    }
}
public class ThreadCommunication {
    public static void main(String args[]) {
        TickTock tt = new TickTock();
        clockThread mt1 = new clockThread("Tick", tt);
        clockThread mt2 = new clockThread("Tock", tt);

        try {
            mt1.thrd.join();
            mt2.thrd.join();
        }
        catch(InterruptedException exc) {
            System.out.println("Main thread died unexpectedly.");
        }
    }
}
