// A character queue interface

public interface ICharQ {
    //put a character into the queue
    void put (char ch) throws QueueFullException;

    //get a character from the queue
    default char get() throws QueueEmptyException {
        return 0;
    }
}