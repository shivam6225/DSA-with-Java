package Easy;

public class SumOfDigits {

    public static void main(String[] args) {
        int n = 238902;

        System.out.println("Sum of all digits in number :"+ sumOfDigits(n));
    }

    private static int sumOfDigits(int n) {

        if(n==0) return 0;

        return (n%10) + sumOfDigits(n/10);
    }
}
