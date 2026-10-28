package questions;

public class MergeStringsAlternately {

    class Solution {
        public String mergeAlternately(String word1, String word2) {
            int m=word1.length();
            int n=word2.length();

            int i=0,j=0;
            int count=0;

            StringBuilder sb = new StringBuilder();

            while(i<m && j<n){
                sb.append(word1.charAt(i));
                sb.append(word2.charAt(j));
                j++;
                i++;
            }

            if(j<n) {
                sb.append(word2.substring(j,n));
            }
            else{
                sb.append(word1.substring(i,m));
            }

            return sb.toString();
        }
    }
}
