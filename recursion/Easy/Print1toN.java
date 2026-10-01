package Easy;

public class Print1toN {

    public static void main(String[] args) {
        int N =10;
        print(N);
    }

    static void print(int n){
        //Base Condition
        if(n==0) return;

        //Recursive Function
        print(n-1);

        //print post the function is returned
        System.out.print(n+" ");
    }
}
