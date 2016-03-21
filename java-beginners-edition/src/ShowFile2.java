// Display a text file

import java.io.FileInputStream;
import java.io.IOException;

class ShowFile2 {
    public static void main(String args[]) {
        int i;

        if(args.length != 1) {
            System.out.println("Usage: Showfile <file>");
            return;
        }

        // This uses try-with-resources to open and then automatically close the file
        try (FileInputStream fin = new FileInputStream(args[0])) {
            do {
                i = fin.read();
                if(i != -1) System.out.print((char) i);
            } while (i != -1);
        }
        catch(IOException exc) {
            System.out.println("I/O Error: " + exc);
        }
    }
}

