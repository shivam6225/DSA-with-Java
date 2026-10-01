package Easy;

public class CountZeroes {

    public static void main(String[] args) {
        System.out.println(countZeros(100020));

        System.out.println(count(10020));
    }

    static int countZeros(int n){
        if(n%10==n) return n==0?1:0;

        return ((n%10)==0?1:0 ) + countZeros(n/10);
    }

    static int count(int n){
        return helper(n,0);
    }

    static int helper(int n,int c){
        if(n==0) {
            return c;
        }

        int rem=n%10;
        if(rem==0) return helper(n/10,c+1);

        return helper(n/10,c);
    }
}
