package questions;

import java.util.ArrayList;
import java.util.List;

public class FindTargetIndicesAfterSortingArray {

    class Solution {
        public List<Integer> targetIndices(int[] nums, int target) {
            List<Integer> list = new ArrayList<>();
            int cntBefore = 0;
            int cntSame = 0;

            for(int num:nums){
                if(target>num) cntBefore++;
                else if(target==num) cntSame++;
            }


            for(int i=cntBefore;i<cntBefore+cntSame;i++){
                list.add(i);
            }

            return list;
        }
    }
}
