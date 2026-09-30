
public class CountSetBits {

    public static void main(String[] args) {
        int n =245;

        System.out.println(Integer.toBinaryString(n));
        System.out.println(setBitsCount(n));

    }

    private static int setBitsCount(int n) {

        int count =0;

        while(n>0){
            count++;
            n=(n&(n-1));
        }

        return count;
    }
}
