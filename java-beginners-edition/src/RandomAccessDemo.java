/**
 * Created by afabiani on 3/21/2016.
 */

import java.io.*;

public class RandomAccessDemo {
    public static void main(String args[]) {
        double data[] = { 19.4, 10.1, 123.54, 33.0, 87.9, 74.25};
        double d;

        // open and use a random access file
        try (RandomAccessFile raf = new RandomAccessFile("random.dat", "rw")) {
            // write values to the file
            for (int i = 0; i < data.length; i++) {
                raf.writeDouble(data[i]);
            }

            // now read back specific values
            raf.seek(0); // seek to first double
            d = raf.readDouble();
            System.out.println("First value is " + d);

            raf.seek(8); // seek to second double
            d = raf.readDouble();
            System.out.println("Second value is " + d);

            raf.seek(8 * 3); //seek to fourth double
            d= raf.readDouble();
            System.out.println("fourth value is " + d);

            System.out.println();

            // now read every other value
            System.out.println("here is every other value: ");
            for(int i = 0; i < data.length; i+=2) {
                raf.seek(8 * i); // seek to ith double
                d = raf.readDouble();
                System.out.print(d + " ");
            }
        }
        catch (IOException exc) {
            System.out.println("I/O Error: " + exc);
        }
    }
}
