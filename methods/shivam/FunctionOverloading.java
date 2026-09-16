package shivam;

public class FunctionOverloading {

    public static void main(String[] args) {
        fun(6);
        fun("Shivam");
        int ans = sum(10,20);
        int result = sum(10,20,30);
    }
    //Function Overloading
    //Two or more functions have same name and same return type
    //But different type of arguments
    //This happens when your program is compiled
    //Compile time it decides which function to run
    static void fun(int a){
        System.out.println("First one");

    }

    static void fun(String name){
        System.out.println("Second One");
    }

    static int sum(int a , int b){
        return a+b;
    }

    static int sum(int a,int b, int c){
        return a+b+c;
    }
}
