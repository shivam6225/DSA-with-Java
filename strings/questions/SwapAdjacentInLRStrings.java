package questions;

public class SwapAdjacentInLRStrings {

    class Solution {
        public boolean canTransform(String start, String result) {
            int count = 0;
            int n= start.length();
            char[] s= start.toCharArray();
            char[] r= result.toCharArray();
            for(int i=0;i<n;i++){
                if(s[i]=='X') count++;
                if(r[i]=='X') count--;
            }
            if(count!=0) return false;

            int i=0,j=0;
            while(i<n && j<n){
                while(i<n && s[i]=='X') i++;
                while(j<n && r[j]=='X') j++;

                if(i==n || j==n){
                    return i==n && j==n;
                }
                if(s[i] != r[j]) return false;
                if(s[i] == 'L' && i<j) return false;
                if(s[i] == 'R' && i>j) return false;

                i++;
                j++;
            }

            return true;
        }
    }
}
