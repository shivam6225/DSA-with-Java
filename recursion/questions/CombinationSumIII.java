package questions;

import java.util.*;

public class CombinationSumIII {

    class Solution {
        public List<List<Integer>> combinationSum3(int k, int n) {
            List<List<Integer>> sumList = new ArrayList<>();

            comb(k,n,1,new ArrayList<>(),sumList);

            return sumList;
        }

        public void comb(int k,int n,int index,List<Integer> list, List<List<Integer>> sumList){
            if(n==0 && k==0){
                sumList.add(new ArrayList<>(list));
                return;
            }

            if(n<0){
                return;
            }

            for(int i=index;i<=9 && n>=i;i++){
                list.add(i);
                comb(k-1,n-i,i+1,list,sumList);
                list.removeLast();
            }
        }
    }
}
