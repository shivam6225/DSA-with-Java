public class OddOrEvenBit {

    public static void main(String[] args) {
        int n=24;
        System.out.printf("Is Number %d Even: %b",n , isEven(n));
    }

    private static boolean isEven(int i) {
        //& with 1
        //n&1 == 1 means odd else even
        //LSD decides if number is even or odd -> least Significant Bit
        return (i&1)!=1;
    }
}
