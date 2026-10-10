package Properties.Polymorphism;

public class Numbers {

    double sum(double a , int b){
        return a+b;
    }

    int sum(int a,int b, int c){
        return a+b+c;
    }


    public static void main(String[] args) {
        Numbers num = new Numbers();
        //Method Overloading
        num.sum(2,3); //Java automatically does typecast
        num.sum(1,2,3);
        //num.sum(4,5,6,7); -> this will throw error as no method with 4 arguments
        //We got error during Compile time only

    }
}
