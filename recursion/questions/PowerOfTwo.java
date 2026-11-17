package questions;

public class PowerOfTwo {

    class Solution {
        public boolean isPowerOfTwo(int n) {
            return power(n,2);
        }

        public boolean power(int n,int pow){
            if(n==1){
                return true;
            }
            else if(n==0 || n%2!=0){
                return false;
            }

            return power(n/pow,pow);
        }
    }
}
