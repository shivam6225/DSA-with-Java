package questions;

public class MaximumNumberOfRemovableCharacters {

    class Solution {
        public int maximumRemovals(String s, String p, int[] removable) {
            char[] ch = s.toCharArray();
            char[] ph = p.toCharArray();
            int left =0;
            int right = removable.length;

            while(left<=right){
                int mid = left+(right-left)/2;

                for(int i=0;i<mid;i++){
                    ch[removable[i]]=' ';
                }

                if(check(ch,ph)) left=mid+1;
                else{
                    for(int i=0;i<mid;i++){
                        ch[removable[i]]=s.charAt(removable[i]);
                    }
                    right=mid-1;
                }
            }

            return right;

        }

        public boolean check(char[] s,char[] p){
            int i=0;
            int k=0;
            int n=p.length;

            while(i<s.length){
                if(s[i]==p[k] ){
                    k++;
                }
                i++;
                if(k==n){
                    return true;
                }
            }

            return false;

        }
    }
}
