/* Pass an object to a method */

// A class that defines a block
class Block {
    private int a, b, c;
    private int volume;

    Block (int i, int j, int k) {
        a = i;
        b = j;
        c = k;
        volume = a * b * c;
    }

    // Return true if ob defines same block
    boolean sameBlock(Block ob) {
        if((ob.a == a) & (ob.b == b) & (ob.c == c)) return true;
        else return false;
    }

    boolean sameVolume(Block ob) {
        if(ob.volume == volume) return true;
        else return false;
    }
}

class PassOb {
    public static void main(String args[]) {
        Block ob1 = new Block(10, 2, 5);
        Block ob2 = new Block(10, 2, 5);
        Block ob3 = new Block(4, 5, 5);

        System.out.println("ob1 same dimensions as ob2: " + ob1.sameBlock(ob2));
        System.out.println("ob2 same dimensions as ob3: " + ob2.sameBlock(ob3));
        System.out.println("ob1 same volume as ob3: " + ob1.sameVolume(ob3));
    }
}

