/**
 * Created by afabiani on 3/28/2016.
 * Demonstrate synchronize
 */

class SumArray {
    private int sum;

    synchronized int sumArray(int nums[]) {  // <--- sumArray() is synchronized
        sum = 0; //reset sum
        for(int i = 0; i < nums.length; i++) {
            sum += nums[i];
            System.out.println("Running total for " + Thread.currentThread().getName() + " is " + sum);

            try {
                Thread.sleep(10); // allow task-switch - won't happen because this object is synchronized
            }
            catch(InterruptedException exc) {
                System.out.println("Error: Thread interrupted.");
            }
        }
        return sum;
    }
}

class sumThread implements Runnable {
    Thread thrd;
    static SumArray sa = new SumArray(); // <- Declared as static so only 1 copy of this class is shared by all threads
    int a[];
    int answer;

    sumThread(String name, int nums[]) {
        thrd = new Thread(this, name);
        a = nums;
        thrd.start();
    }

    public void run() {
        int sum;
        System.out.println(thrd.getName() + " starting.");
        answer = sa.sumArray(a);
        System.out.println("Sum for " + thrd.getName() + " is " + answer);
        System.out.println(thrd.getName() + " terminating.");
    }
}

public class Sync {
    public static void main(String args[]) {
        int a[] = {1, 2, 3, 4, 5};

        sumThread mt1 = new sumThread("Child #1", a);
        sumThread mt2 = new sumThread("Child #2", a);
        mt1.thrd.setPriority(Thread.NORM_PRIORITY);
        mt2.thrd.setPriority(Thread.NORM_PRIORITY);

        try {
            mt1.thrd.join();
            mt2.thrd.join();
        }
        catch(InterruptedException exc) {
            System.out.println("Main thread interrupted.");
        }
    }
}
