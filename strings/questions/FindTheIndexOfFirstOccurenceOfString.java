package questions;

public class FindTheIndexOfFirstOccurenceOfString {

    class Solution {
        public int strStr(String haystack, String needle) {
            if(needle.isEmpty()) return 0;
            int nlen = needle.length();
            int[] lps = new int[nlen];
            int plps = 0;
            int i=1;

            while(i<nlen){
                if(needle.charAt(i)==needle.charAt(plps)){
                    lps[i] = plps + 1;
                    plps++;
                    i++;
                }
                else if(plps==0){
                    lps[i] = 0;
                    i++;
                }
                else {
                    plps = lps[plps-1];
                }
            }

            i=0;
            int j=0;
            while(i<haystack.length()){
                if(haystack.charAt(i)==needle.charAt(j)){
                    i++;
                    j++;
                }
                else{
                    if(j==0){
                        i++;
                    }
                    else {
                        j = lps[j-1];
                    }
                }
                if(j==nlen){
                    return i-nlen;
                }
            }

            return -1;
        }
    }
}
