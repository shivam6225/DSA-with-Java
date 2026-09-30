public class PowerOf2 {

    public static void main(String[] args) {
        int n = 31 ; //fix for n =0
        boolean ans = (n & (n-1)) == 0;
        System.out.println(ans);
    }
}
