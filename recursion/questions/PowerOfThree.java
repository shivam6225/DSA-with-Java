package questions;

public class PowerOfThree {
    class Solution {
        public boolean isPowerOfThree(int n) {
            return power(n,3);
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
