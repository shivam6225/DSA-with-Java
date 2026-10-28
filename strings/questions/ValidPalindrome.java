package questions;

public class ValidPalindrome {

    class Solution {
        public boolean isPalindrome(String s) {
            int left = 0;
            int right = s.length()-1;
            char[] ch = s.toCharArray();
            while(left<right){
                while(left<right && !isAlphaNumeric(ch[left])) left++;
                while(left<right && !isAlphaNumeric(ch[right])) right--;

                if(lower(ch[left])!=lower(ch[right])) return false;
                left++;
                right--;
            }

            return right-left<=1;
        }

        public boolean isAlphaNumeric(char ch){
            return (ch>='a' && ch<='z') || (ch>='0'&&ch<='9') || (ch>='A' && ch<='Z');
        }

        public char lower(char ch){
            if(ch>='A' && ch<='Z'){
                return (char)(ch+32);
            }
            return ch;
        }
    }
}
