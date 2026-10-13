package Generics;

import java.util.Arrays;

//Implementing Custom Array List having same features has ArrayList in utils
//Issue here -> this is just implementation for Int
//hence comes Generics -> Parameterized Type
public class CustomArrayList {

    private int[] data ;
    static private int DEFAULT_SIZE = 10;
    private int size =0;

    public CustomArrayList() {
        this.data = new int[DEFAULT_SIZE];
    }

    public void add(int num) {
        if(this.isFUll()) {
            this.resize();
        }
        this.data[this.size++] = num;
    }

    public int remove() {
        return data[--size];
    }

    public int get(int index){
        return data[index];
    }

    public int size(){
        return size;
    }

    public void set(int index,int num){
        data[index] = num;
    }



    private void resize() {
        int [] temp = new int[data.length*2];

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
        return "CustomArrayList{" +
                "data=" + Arrays.toString(data) +
                ", size=" + size +
                '}';
    }

    public static void main(String[] args) {
        CustomArrayList list = new CustomArrayList();
        list.add(45);
        list.remove();
        list.add(10);
        System.out.println(list.get(0));
        list.set(1,6789);
        System.out.println(list.size());
        System.out.println(list);
    }


}
