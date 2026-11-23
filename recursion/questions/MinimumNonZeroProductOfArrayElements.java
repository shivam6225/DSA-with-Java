package questions;

public class MinimumNonZeroProductOfArrayElements {

    class Solution {
        public static final int mod=1000000007;
        public int minNonZeroProduct(int p) {
            if(p==1) return 1;
            long val = (1L<<p)-1;
            long n=val/2;
            val%=mod;
            return (int)((calculate((val-1), n)*val)%mod);
        }

        public long calculate(long x,long n){
            x%=mod;
            if(n==0){
                return 1;
            }

            if(n%2!=0){
                return (x*calculate((x*x)%mod,(n-1)/2))%mod;
            }
            else{
                return calculate((x*x)%mod,n/2)%mod;
            }
        }
    }
}
