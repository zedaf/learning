// Display a text file

import java.io.*;

class ShowFile {
    public static void main(String args[]) {
        int i;
        FileInputStream fin = null;

        if(args.length != 1) {
            System.out.println("Usage: Showfile <file>");
            return;
        }

        try {
            fin = new FileInputStream(args[0]);

            do {
                i = fin.read();
                if(i != -1) System.out.print((char) i);
            }while (i != -1);
        }
        catch (IOException exc) {
            System.out.println("I/O Error: " + exc);
        }
        finally {
            try {
                if(fin != null) fin.close();
            }
            catch (IOException exc) {
                System.out.println("Error closing file: " + exc);
            }
        }
    }
}

