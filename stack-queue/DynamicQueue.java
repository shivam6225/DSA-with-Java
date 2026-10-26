public class DynamicQueue extends CircularQueue{

    public DynamicQueue(int size) {
        super(size);
    }

    public DynamicQueue() {
        super();
    }

    @Override
    public boolean insert(int value){
        if(super.isFull()){
            int[] temp = new int[data.length*2];
            //copy all items
            for (int i = 0; i < data.length; i++) {
                temp[i]=data[(front+i)%data.length];
            }
            front=0;
            end=data.length;
            data = temp;
        }
        return super.insert(value);
    }
}
