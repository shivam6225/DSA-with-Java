package Easy;

public class ProductOfDigits {

    public static void main(String[] args){
        int n = 455;

        System.out.println("Product of Digits in number :"+ productOfDigits(n));
    }

    private static long productOfDigits(int n) {
        if(n%10==n) return n;

        return (n%10)*productOfDigits(n/10);
    }
}
