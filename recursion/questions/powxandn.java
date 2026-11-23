package questions;

public class powxandn {

    class Solution {
        public double myPow(double x, int n) {
            return calculate(x,(long)n);
        }

        public double calculate(double x,long n){
            if(n==0){
                return 1;
            }

            if(n<0){
                return 1.0/calculate(x,-1*n);
            }

            if(n%2!=0){
                return x*calculate(x*x,(n-1)/2);
            }
            else{
                return calculate(x*x,n/2);
            }
        }
    }
}
