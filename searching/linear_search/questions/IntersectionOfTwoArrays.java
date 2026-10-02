package linear_search.questions;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class IntersectionOfTwoArrays {

        public int[] intersection(int[] nums1, int[] nums2) {
            Set<Integer> set = new HashSet<>();
            for(int num:nums2) {
                set.add(num);
            }

            ArrayList<Integer> list =new ArrayList<>();

            for(int num:nums1) {
                if(set.contains(num)){
                    list.add(num);
                    set.remove(num);
                }
            }

            int[] arr = new int[list.size()];
            int curr=0;
            for(int num:list){
                arr[curr++] = num;
            }

            return arr;

        }
}
