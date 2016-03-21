import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * Created by afabiani on 3/18/2016.
 */
public class CopyFile {
    public static void main(String args[]) throws IOException {
        int i;
        FileInputStream fin = null;
        FileOutputStream fout = null;

        //make sure both files have been specified
        if (args.length != 2) {
            System.out.println("Usage: CopyFile <source> <dest>");
            return;
        }

        //Copy a file
        try {
            fin = new FileInputStream(args[0]);
            fout = new FileOutputStream(args[1]);

            do {
                i = fin.read();
                if(i != -1) fout.write(i);
            }while (i != -1);
            System.out.println(args[0] + " copied to " + args[1]);
        }
        catch (IOException exc) {
            System.out.println("I/O Error: " + exc);
        }
        finally {
            try {
                if (fin != null) fin.close();
            }
            catch (IOException exc){
                System.out.println("Error closing input file: " + exc);
            }
            try {
                if (fout != null) fout.close();
            }
            catch (IOException exc) {
                System.out.println("Error closing output file: " + exc);
            }
        }
    }
}
