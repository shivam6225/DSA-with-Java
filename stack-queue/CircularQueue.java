public class CircularQueue {


    protected int[] data;

    private static final int DEFAULT_SIZE = 10;

    protected int end = 0;
    protected int front = 0;
    protected int size = 0;

    public CircularQueue(int size) {
        this.data = new int[size];
    }


    public CircularQueue() {
        //constructor calling constructor
        this(DEFAULT_SIZE);
    }

    public boolean insert(int value) {
        if(isFull()){
            System.out.println("Queue is full");
            return false;
        }
        data[end++] = value;
        end = end%data.length;
        size++;
        return true;
    }

    public boolean isFull() {
        return size==data.length;
    }

    private boolean isEmpty(){
        return size == 0;
    }

    public int remove() throws QueueException{
        if(isEmpty()){
            throw new QueueException("Cannot remove from Empty Queue");
        }
        int removed = this.data[front++];
        front = front % data.length;
        size--;
        return removed;
    }

    public  int peek() throws QueueException{
        if(isEmpty()){
            throw new QueueException("Cannot peek from Empty Queue");
        }
        return this.data[front];
    }

    public void display(){
        if(isEmpty()){
            System.out.println("Empty");
            return;
        }
        System.out.println(front+" "+end);
        int i = front;
        do{
            System.out.print(data[ i % data.length]+" <- ");
            i++;
            i%=data.length;
        }while(i!=end);
        System.out.println("END");
    }
}
