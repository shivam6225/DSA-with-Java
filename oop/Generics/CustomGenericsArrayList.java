package Generics;

import java.util.Arrays;

//Implementing Custom Array List having same features has ArrayList in utils
//Issue here -> this is just implementation for Int
//hence comes Generics -> Parameterized Type
//T -> Type Parameter (this is done at Compile Time)
//Overloading for generics is not allowed
public class CustomGenericsArrayList<T> {

    private Object[] data ;
    static private int DEFAULT_SIZE = 10;
    private int size =0;

    public CustomGenericsArrayList() {
        this.data = new Object[DEFAULT_SIZE];
    }

    public void add(T num) {
        if(this.isFUll()) {
            this.resize();
        }
        this.data[this.size++] = num;
    }

    public T remove() {
        return (T)data[--size];
    }

    public T get(int index){
        return (T)data[index];
    }

    public int size(){
        return size;
    }

    public void set(int index,T num){
        data[index] = num;
    }



    private void resize() {
        Object [] temp = new Object[data.length*2];

        //copy the current in new array
        for(int i=0;i<data.length;i++){
            temp[i] = this.data[i];
        }

        this.data = temp;
    }

    private boolean isFUll() {
        return this.size == this.data.length;
    }

    @Override
    public String toString() {
        return "CustomGenericsArrayList{" +
                "data=" + Arrays.toString(data) +
                ", size=" + size +
                '}';
    }

    public static void main(String[] args) {
        CustomGenericsArrayList<Integer> list = new CustomGenericsArrayList<>();
        list.add(45);
        System.out.println(list.remove());
        list.add(10);
        System.out.println(list.get(0));
        list.set(1,6789);
        System.out.println(list.size());
        System.out.println(list);
    }


}
