package questions;

public class MajorityElement {

        public int majorityElement(int[] nums) {
            int count = 1;
            int x = nums[0];

            for(int i=1;i<nums.length;i++){
                if(count==0) x=nums[i];

                count+=(nums[i]==x) ? 1 :-1;
            }

            return x;
        }
}
