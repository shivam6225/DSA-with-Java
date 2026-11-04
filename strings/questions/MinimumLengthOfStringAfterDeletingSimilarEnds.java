package questions;

public class MinimumLengthOfStringAfterDeletingSimilarEnds {

    class Solution {
        public int minimumLength(String s) {

            int i=0;
            int j=s.length()-1;
            char[] ch = s.toCharArray();
            while(i<j && ch[i]==ch[j]){
                char chi = ch[i];
                while(i<j && ch[i]==chi) {
                    i++;
                }
                while(i<j && chi==ch[j]){
                    j--;
                }
                if(i==j){
                    if(ch[i]!=chi) return 1;
                    else return 0;
                }
            }

            return j-i+1;
        }
    }
}
