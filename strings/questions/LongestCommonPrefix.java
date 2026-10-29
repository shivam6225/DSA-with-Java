package questions;
import java.util.*;
public class LongestCommonPrefix {

    class Solution {
        public String longestCommonPrefix(String[] strs) {
            StringBuilder sb = new StringBuilder();
            Arrays.sort(strs);
            String first = strs[0];
            String last = strs[strs.length-1];
            int len = Math.min(last.length(),first.length());

            for(int i=0;i<len;i++){
                if(last.charAt(i)!=first.charAt(i)){
                    return sb.toString();
                }

                sb.append(first.charAt(i));
            }

            return sb.toString();
        }
    }
}
