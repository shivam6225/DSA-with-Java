package questions;

public class CheckIfItsGoodArray {

        public boolean isGoodArray(int[] nums) {
            int x = nums[0];
            for(int a:nums){
                while(a>0){
                    int y = x%a;
                    x=a;
                    a=y;
                }
            }

            return x==1;
        }
}
