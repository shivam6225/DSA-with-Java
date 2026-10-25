package questions;
import java.util.*;

public class SortIntegersByNumberOf1Bits {

    class Solution {
        public int[] sortByBits(int[] arr) {
            Map<Integer,Integer> setBits = new HashMap<>();

            Integer[] arrObj = new Integer[arr.length];

            for(int i=0;i<arr.length;i++){
                arrObj[i]=arr[i];

                setBits.put(arr[i],getSetBits(arr[i]));
            }

            Arrays.sort(arrObj , (a,b)-> {
                if(setBits.get(a).equals(setBits.get(b))){
                    return Integer.compare(a,b);
                }
                return Integer.compare(setBits.get(a),setBits.get(b));
            });

            for(int i=0;i<arr.length;i++){
                arr[i]=arrObj[i];
            }

            return arr;
        }

        public int getSetBits(int n){
            int count=0;
            while(n!=0){
                n &=(n-1);
                count++;
            }

            return count;
        }
    }
}
