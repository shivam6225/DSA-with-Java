package questions;

public class SplitTwoStringsToMakeAPalindrome {

    class Solution {
        public boolean checkPalindromeFormation(String a, String b) {
            return check(a,b) || check(b,a);
        }

        public boolean check(String a ,String b){
            int i =0;
            int j= b.length()-1;

            while(i<j && a.charAt(i)==b.charAt(j)){
                i++;
                j--;
            }

            return isPalindrome(a,i,j) || isPalindrome(b,i,j);

        }

        public  boolean isPalindrome(String a,int i,int j){
            while(i<j){
                if(a.charAt(i)!=a.charAt(j)){
                    return false;
                }
                i++;
                j--;
            }

            return true;
        }


    }
}
