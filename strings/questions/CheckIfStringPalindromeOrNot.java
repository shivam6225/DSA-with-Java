package questions;

public class CheckIfStringPalindromeOrNot {

    public static void main(String[] args) {
        String name = "abcba";

        System.out.println(isPalindrome(name));

    }

    private static boolean isPalindrome(String name) {
        if(name==null || name.length()==0)
        {
            return true;
        }
        name = name.toLowerCase();
        int start = 0;
        int end = name.length()-1;

        while(start<end){
            if(name.charAt(start)!=name.charAt(end)){
                return false;
            }
            start++;
            end--;
        }

        return start>=end;
    }


}
