package questions;

public class HappyNumber {

    class Solution {
        public boolean isHappy(int n) {
            int slow = n;
            int fast = n;
            do{
                slow = sumOfSquares(slow);
                fast = sumOfSquares(sumOfSquares(fast));
                if(fast==1) return true;
            }while(slow!=fast);

            return false;
        }

        public int sumOfSquares(int n){
            int sum = 0;
            while(n!=0){
                int temp = n%10;
                sum+=temp*temp;
                n=n/10;
            }
            return sum;
        }
    }
}
