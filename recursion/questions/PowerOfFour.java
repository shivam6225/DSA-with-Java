package questions;

public class PowerOfFour {
    class Solution {
        public boolean isPowerOfFour(int n) {
            return power(n,4);
        }

        public boolean power(int n,int pow){
            if(n==1){
                return true;
            }
            else if(n==0 || n%pow!=0){
                return false;
            }

            return power(n/pow,pow);
        }
    }
}
