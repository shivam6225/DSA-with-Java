package linear_search.questions;

import java.util.HashSet;
import java.util.Set;

public class CheckIfNandItsDoubleExists {

        public boolean checkIfExist(int[] arr) {
            Set<Integer> set = new HashSet<>();

            for(int num:arr){
                if(set.contains(num<<1) || ((num&1)==0 && set.contains(num>>1))){
                    return true;
                }
                set.add(num);
            }

            return false;

        }
}
