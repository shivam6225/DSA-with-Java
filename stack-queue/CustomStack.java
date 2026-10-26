public class CustomStack {

    protected int[] data;

    private static final int DEFAULT_SIZE = 10;

    private int ptr = -1;



    public CustomStack(int size) {
        this.data = new int[size];
    }


    public CustomStack() {
        //constructor calling constructor
        this(DEFAULT_SIZE);
    }

    public boolean push(int value) {
        if(isFull()){
            System.out.println("Stack is full");
            return false;
        }
        this.data[++ptr] = value;
        return true;
    }

    public boolean isFull() {
        return ptr==data.length -1;
    }

    private boolean isEmpty(){
        return ptr == -1;
    }

    public int pop() throws StackException{
        if(isEmpty()){
            throw new StackException("Cannot pop from Empty Stack");
        }
        return this.data[ptr--];
    }

    public  int peek() throws StackException{
        if(isEmpty()){
            throw new StackException("Cannot peek from Empty Stack");
        }
        return this.data[ptr];
    }
}
