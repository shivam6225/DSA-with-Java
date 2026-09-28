public class NumRec {
    public static void main(String[] args) {
        // write a function that takes number and prints
        //number 1 to n
        print1(1);
        System.out.println("Now With Recursion");
        print(1);
    }

    //Recursive Function
    static void print(int n){
        if(n==5){
            System.out.println(5);
            return;
        }
        System.out.println(n);
        print(n+1); //tailed Recursion

    }

    static void print1(int n){
        System.out.println(n);
        print2(2);
    }
    static void print2(int n){
        System.out.println(n);
        print3(3);
    }
    static void print3(int n){
        System.out.println(n);
        print4(4);
    }
    static void print4(int n){
        System.out.println(n);
        print5(5);
    }
    static void print5(int n){
        System.out.println(n);
    }


}


