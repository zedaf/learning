// Try This 6-1: An improved queue class

class Queue2 {
    private char q[];
    private int putloc, getloc;

    Queue2(int size) {
        q = new char[size]; // allocate memory for size
        putloc = getloc = 0;
    }

    void put(char ch) {
        if(putloc==q.length) {
            System.out.println(" - Queue is full");
            return;
        }
        q[putloc++] = ch;
    }

    char get() {
        if(getloc == putloc) {
            System.out.println(" - Queue is empty");
            return (char) 0;
        }
        return q[getloc++];
    }
}

class ImprovedQueue {
    public static void main(String args[]) {
        Queue3 bigQ = new Queue3(100);
        Queue3 smallQ = new Queue3(4);

        char ch;
        int i;

        System.out.println("Using bigQ to store the alphabet");

        for(i = 0; i < 26; i++) {
            bigQ.put((char) ('A' + i));
        }

        // retrieve and display  from bigQ
        System.out.println("Contents of bigQ: ");
        for(i = 0; i < 26; i ++) {
            ch = bigQ.get();
            if(ch != (char) 0) System.out.println(ch);
        }

        System.out.println("Using smallQ to generate errors.");

        for (i=0;i < 5;i++) {
            System.out.print("Attempting to store " + (char) ('Z' - i));
            smallQ.put((char) ('Z' - i));
            System.out.println();
        }
        System.out.println();

        // more errors on smallQ
        System.out.print("Contents of smallQ: ");
        for(i=0; i < 5; i++) {
            ch = smallQ.get();
            if(ch != (char)0) System.out.print(ch);
        }
    }
}
