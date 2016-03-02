// implements a fail-soft array which prevents run time errors

class FailSoftArray {
    private int a[]; // reference to array
    private int errval; //value to return if get() fails
    public int length; //length is public

    // Construct array given it's size and value to return if get() fails
    public FailSoftArray(int size, int errv) {
        a = new int[size];
        errval = errv;
        length = size;
    }

    public int get(int index) {
        if(indexOK(index)) return a[index];
        return errval;
    }

    public boolean put(int index, int val) {
        if(indexOK(index)) {
            a[index] = val;
            return true;
        }
        return false;
    }

    // return true if index is within bounds
    private boolean indexOK(int index) {
        if (index >= 0 & index < length) return true;
        return false;
    }
}

// demonstrate the failsoft array
class FailSoftArrayDemo {
    public static void main(String args[]) {
        FailSoftArray fs = new FailSoftArray(5, -1);
        int x;

        // show quiet failures
        System.out.println("Fail quietly.");
        for(int i=0; i < (fs.length * 2); i++)
            fs.put(i, i*10);  // access to array must be through its accessor methods

        for(int i=0; i < (fs.length * 2); i++) {
            x = fs.get(i);
            if (x != -1) System.out.println(x + " ");
        }

        // now, handle failures
        System.out.println("\nFail with error reports.");
        for(int i=0; i < (fs.length * 2); i++)
            if(!fs.put(i, i*10))
                System.out.println("Index " + i + " out-of-bounds");

        for(int i=0; i < (fs.length * 2); i++) {
            x = fs.get(i);
            if(x != -1) System.out.println(x + " ");
            else
                System.out.println("Index " + i + " out-of-bounds");
        }
    }
}
