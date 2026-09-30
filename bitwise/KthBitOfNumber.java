public class KthBitOfNumber {

    public static void main(String[] args) {
        int n = 10010101;
        int k =3;
        System.out.printf("%d bit of %d is : %d",k,n,findKthBit(n,k));
    }

    private static int findKthBit(int n,int k) {
        return n&(1<<(k-1));
    }
}
