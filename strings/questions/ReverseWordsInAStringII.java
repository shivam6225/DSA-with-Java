package questions;

public class ReverseWordsInAStringII {

    class Solution {
        public void reverseWords(char[] s) {
            int n=s.length;
            reverse(s,0,n-1);

            int left = 0;
            int right = 0;


            while(left<n){
                while(right<n && s[right]!=' ') right++;
                reverse(s,left,right-1);
                left=right+1;
                right++;
            }

        }

        public void reverse(char[] s,int left,int right){
            int start = left;
            int end = right;

            while(start<end){
                char temp = s[start];
                s[start]=s[end];
                s[end]=temp;
                start++;
                end--;
            }
        }
    }
}
