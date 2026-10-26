public class CustomQueue {

    protected int[] data;

    private static final int DEFAULT_SIZE = 10;

    private int end = 0;



    public CustomQueue(int size) {
        this.data = new int[size];
    }


    public CustomQueue() {
        //constructor calling constructor
        this(DEFAULT_SIZE);
    }

    public boolean insert(int value) {
        if(isFull()){
            System.out.println("Queue is full");
            return false;
        }
        this.data[end++] = value;
        return true;
    }

    public boolean isFull() {
        return end==data.length;
    }

    private boolean isEmpty(){
        return end == 0;
    }

    public int remove() throws QueueException{
        if(isEmpty()){
            throw new QueueException("Cannot remove from Empty Queue");
        }
        int removed = this.data[0];
        for (int i = 1; i < end; i++) {
            data[i-1]=data[i];
        }
        end--;
        return removed;
    }

    public  int peek() throws QueueException{
        if(isEmpty()){
            throw new QueueException("Cannot peek from Empty Queue");
        }
        return this.data[0];
    }
}
