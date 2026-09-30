public class NumberOfDigitsInBaseB {

    public static void main(String[] args) {
         int n = 3567;

         int b = 10;

         int c =2;

         int ans = (int) (Math.log(n)/Math.log(b)) + 1;
         System.out.println(ans);
         ans = (int) (Math.log(n)/Math.log(c)) + 1;
         System.out.println(ans);
    }
}
