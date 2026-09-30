public class PrimeNumberOrNot {

    public static void main(String[] args) {

        System.out.println(isPrime(19));

    }

    static boolean isPrime(int n){
        if(n<=1) return false;

        //You can use while loop too for this
        for(int i=2;i*i<=n;i++){
            if(n%i==0){
                return false;
            }
        }

        return true;
    }
}
