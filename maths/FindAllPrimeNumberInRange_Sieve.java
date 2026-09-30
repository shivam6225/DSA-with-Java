public class FindAllPrimeNumberInRange_Sieve {

    public static void main(String[] args) {
        int N = 40;
        boolean[] primes = new boolean[N+1];
        sieve(primes,N);
    }

    //false in array means number is prime
    static void sieve(boolean [] primes,int n){
        for(int i=2;i*i<=n;i++){
            if(!primes[i]){
                for(int j=i*2;j<=n;j+=i){
                    primes[j] = true;
                }
            }
        }

        for(int i=2;i<=n;i++){
            if(!primes[i]){
                System.out.print(i+" ");
            }
        }
    }
}
