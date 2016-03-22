/**
 * Created by afabiani on 3/21/2016.
 * Compare  two files
 */

import java.io.*;

public class CompFiles {
    public static void main(String args[]) {
        int i = 0;
        int j = 0;

        //make sure both files are specified
        if (args.length != 2) {
            System.out.println("Usage: CompFiles f1 f2");
            return;
        }

        // compare the files
        try(FileInputStream f1 = new FileInputStream(args[0]); FileInputStream f2 = new FileInputStream(args[1])) {
            // check contents of files
            do {
                i = f1.read();
                j = f2.read();
                if (i != j) break;
            } while (i != j && j != -1);

            if (i != j)
                System.out.println("Files differ.");
            else
                System.out.println("Files are the same.");
        }
        catch (IOException exc) {
            System.out.println("I/O Error: " + exc);
        }
    }
}
