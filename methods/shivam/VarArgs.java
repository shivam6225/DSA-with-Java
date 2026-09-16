package shivam;

import java.util.Arrays;

public class VarArgs {
    //Variable Length Arguments -> VarArgs
    public static void main(String[] args) {
        fun(1,2,34,56,67,89);
        multiple(1,2,"Shivam","Variable","Prakhar");
        fun("shivam","kunal");
        //Ambiguity as if it is empty , it's difficult to decide which fun to run
        //fun();
    }

    //...v -> internally as array/collection of integer
    //Length of Variable is not constant
    //Zero or more than zero arguments
    static void fun(int ...v){
        System.out.println(Arrays.toString(v));
    }

    static void fun(String ...v){
        System.out.println(Arrays.toString(v));
    }

    //Variable arg should be last in the list
    static void multiple(int a, int b , String ...c){

    }
}
