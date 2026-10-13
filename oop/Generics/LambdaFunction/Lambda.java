package Generics.LambdaFunction;

import java.util.ArrayList;
import java.util.function.Consumer;

public class Lambda {

    public static void main(String[] args) {

        ArrayList<Integer> arr = new ArrayList<>();

        for(int i =0;i<5;i++){
            arr.add(i+1);
        }

        Consumer<Integer> fun =  (item) -> System.out.println(item*2);

//        arr.forEach((item) -> {
//            System.out.println(item*2);
//        });

        arr.forEach(fun);

        Operation sum = (a,b) -> a+b;
        Operation prod = (a,b) -> a*b;
        Operation sub = (a,b) -> a-b;
        Operation div = (a,b) -> a/b;

        Lambda myCal = new Lambda();

        System.out.println(myCal.operate(5,3,sum));
        System.out.println(myCal.operate(5,3,prod));
        System.out.println(myCal.operate(5,3,sub));

    }

    //Convert this to lambda function
//    int sum(int a,int b){
//        return a+b;
//    }

    private int operate(int a , int b , Operation op){
        return op.operation(a,b);
    }
}

interface Operation {
    int operation(int a , int b);
}
