package linear_search.questions;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class IntersectionOfTwoArraysII {

        public int[] intersect(int[] nums1, int[] nums2) {
            if(nums2.length>nums1.length){
                return intersect(nums2,nums1);
            }

            Map<Integer,Integer> map = new HashMap<>();
            for(int num:nums2) {
                map.put(num,map.getOrDefault(num,0)+1);
            }

            ArrayList<Integer> list =new ArrayList<>();

            for(int num:nums1) {
                int count = map.getOrDefault(num,0);
                if(count>0){
                    list.add(num);
                    map.put(num,count-1);
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
