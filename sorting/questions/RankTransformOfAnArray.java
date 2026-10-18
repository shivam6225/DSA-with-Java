package questions;

import java.util.*;

public class RankTransformOfAnArray {

    class Solution {
        public int[] arrayRankTransform(int[] arr) {
            HashMap<Integer,Integer> rank = new HashMap<>();

            int[] sortA = Arrays.copyOf(arr,arr.length);

            Arrays.sort(sortA);

            int rk = 1;
            for(int i=0;i<sortA.length;i++){
                if(i>0 && sortA[i]>sortA[i-1]){
                    rk++;
                }
                rank.put(sortA[i],rk);
            }



            for(int i=0;i<arr.length;i++){
                sortA[i] = rank.get(arr[i]);
            }


            return sortA;




        }
    }
}
