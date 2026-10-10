package questions;

import java.util.HashSet;
import java.util.Set;

public class FairCandySwap {

    class Solution {
        public int[] fairCandySwap(int[] aliceSizes, int[] bobSizes) {
            int aSum = 0;
            int bSum =0;
            int alen = aliceSizes.length;
            int blen = bobSizes.length;

            for(int i=0;i<alen;i++){
                aSum+=aliceSizes[i];
            }
            for(int i=0;i<blen;i++){
                bSum+=bobSizes[i];
            }
            int diff = (aSum-bSum)/2;

            Set<Integer> aSet = new HashSet<>();

            for(int i=0;i<alen;i++){
                aSet.add(aliceSizes[i]);
            }

            for(int i=0;i<blen;i++){
                if(aSet.contains(bobSizes[i]+diff))
                {
                    return new int[]{bobSizes[i]+diff,bobSizes[i]};
                }
            }

            return new int[]{};
        }
    }
}
