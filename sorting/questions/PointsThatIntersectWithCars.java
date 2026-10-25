package questions;
import java.util.*;

public class PointsThatIntersectWithCars {

    class Solution {
        public int numberOfPoints(List<List<Integer>> nums) {
            int[] prefix = new int[102];

            for(List<Integer> num:nums){
                prefix[num.get(0)]+=1;
                prefix[num.get(1)+1] -=1;
            }

            int count = 0;

            for(int i=1;i<102;i++){
                prefix[i]+=prefix[i-1];

                if(prefix[i]!=0){
                    count+=1;
                }
            }

            return count;
        }
    }
}
