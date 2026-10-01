package Easy;

public class ReverseNumber {

    public static void main(String[] args) {
        int n = 1234;
        reverse(n);
        System.out.println("Reverse of Number: "+sum);
        reverse2(n);

        n = 3456;
        System.out.println(reverse3(n));
    }
    static int sum =0;

    //Strategy #1: using a global sum variable
    public static void reverse(int n){
        if(n==0) return;

        sum = sum*10 + (n%10);
        reverse(n/10);
    }


    public static int reverse2(int n){
        //sometimes you might need additional variable in argument
        System.out.println(Math.ceil(Math.log10(n)));

        if(n%10==n) return n;


        return 0;

    }

    public static int reverse3(int n){
        int digits = (int)(Math.log10(n)) + 1;

        return helper(n,digits);
    }

    private static int helper(int n, int digits) {
        if(n%10 ==n){
            return n;
        }

        return (n%10)*(int)Math.pow(10,digits-1) + helper(n/10,digits-1);
    }


}
