package Easy;

public class PrintNto1 {

    public static void main(String[] args) {
        int N=10;
        print(N);
    }

    static void print(int n){
        //Base Condition
        if(n==0) return;

        System.out.print(n+" ");
        //Recursive Function
        print(n-1);
    }
}
