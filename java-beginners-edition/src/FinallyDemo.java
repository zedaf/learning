class Usefinally {
    public static void genException(int what) {
        int t;
        int nums[] = new int[2];

        System.out.println("Receiving " + what);
        try {
            switch(what) {
                case 0:
                    t = 10 / what; //generate div by zero
                    break;
                case 1:
                    nums[4] = 4; //generate array index error
                    break;
                case 2:
                    return; //return from try block
            }
        }
        catch (ArithmeticException exc) {
            System.out.println("Can't div by 0!");
            return;
        }
        catch (ArrayIndexOutOfBoundsException exc) {
            System.out.println("Array index out of bounds!");
        }
        finally {
            System.out.println("Leaving try block");
        }
    }
}

class FinallyDemo {
    public static void main(String args[]) {
        for(int i = 0; i < 3; i++) {
            Usefinally.genException(i);
            System.out.println();
        }
    }
}