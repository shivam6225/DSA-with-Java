package questions;

import java.util.ArrayList;
import java.util.*;

public class CombinationSumII {

    class Solution {
        public List<List<Integer>> combinationSum2(int[] candidates, int target) {
            Arrays.sort(candidates);
            List<List<Integer>> sumList = new ArrayList();
            sum(candidates,target,0,new LinkedList<>(),sumList);
            return sumList;
        }

        public void sum(int[] c,int target, int i, List<Integer> list,List<List<Integer>> sumList){
            if(target==0){
                sumList.add(new ArrayList<>(list));
                return;
            }

            if(target<0){
                return;
            }

            for(int j=i;j<c.length && target>=c[i];j++){
                if(j>i && c[j]==c[j-1]) continue;
                list.add(c[j]);
                sum(c,target-c[j],j+1,list,sumList);
                list.remove(list.size()-1);
            }

            //return sumList;
        }
    }
}
