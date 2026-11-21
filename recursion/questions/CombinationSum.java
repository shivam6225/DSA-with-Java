package questions;

import java.util.ArrayList;
import java.util.List;

public class CombinationSum {
    class Solution {
        public List<List<Integer>> combinationSum(int[] candidates, int target) {

            return sum(candidates,0,target,0,new ArrayList<>());
        }

        public List<List<Integer>> sum(int[] c, int tsum, int target, int i, List<Integer> list){
            if(tsum==target){
                List<List<Integer>> sumList = new ArrayList();
                sumList.add(list);
                return sumList;
            }

            if(tsum>target||i>c.length-1){
                return new ArrayList<>();
            }

            List<List<Integer>> sumList = new ArrayList<>();

            if(tsum+c[i]<=target){
                List<Integer> addI = new ArrayList(list);
                addI.add(c[i]);
                sumList.addAll(sum(c,tsum+c[i],target,i,addI));
            }


            sumList.addAll(sum(c,tsum,target,i+1,list));


            return sumList;
        }
    }
}
